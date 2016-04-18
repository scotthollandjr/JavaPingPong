import java.util.Map;
import java.util.HashMap;

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
    if ( integerNumber % 3 == 0 ) {
      return "ping";
    } else {
      return integerNumber;
    }
  }
}
