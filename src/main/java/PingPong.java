import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class PingPong {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get ("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/detector.vtl");

      String number = request.queryParams("number");
      Integer integerNumber = Integer.parseInt(number);
      Object PingPongGame = PingPongGame(integerNumber);

      model.put("PingPongGame", PingPongGame);
      model.put("number", number);
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());



  }


  public static Object PingPongGame(Integer integerNumber) {
    ArrayList<Object> pingPongArray = new ArrayList<Object>();
    for ( Integer counter = 1 ; counter <= integerNumber ; counter++ ) {
      if (counter % 15 == 0) {
        pingPongArray.add("pingpong");
      } else if ( counter % 3 == 0 ) {
        pingPongArray.add("ping");
      } else if ( counter % 5 == 0 ) {
        pingPongArray.add("pong");
      } else {
        pingPongArray.add(counter);
      }
    }
    return pingPongArray;
  }
}
