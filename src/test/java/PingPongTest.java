import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class PingPongTest {

    // "The PingPong method should count from 1 to a given number. For example, we expect 2 to return the ArrayList [1, 2]"
    @Test
    public void PingPongGame_notDivisibleByAnything_Array() {
      PingPong PingPongGame = new PingPong();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(1);
      expected.add(2);
      assertEquals(expected, PingPongGame.PingPongGame(2));
    }

    // "The PingPong method should print 'ping' for provided numbers divisible by 3. For example, 3 would return the ArrayList [1, 2, 'ping']"
    @Test
    public void PingPongGame_divisibleBy3_Array() {
      PingPong PingPongGame = new PingPong();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(1);
      expected.add(2);
      expected.add("ping");
      assertEquals(expected, PingPongGame.PingPongGame(3));
    }

    // "The PingPong method should print 'pong' for provided numbers divisible by 5. For example, 5 would retrun the ArrayList [1,2,'ping', 4, 'pong']"
    @Test
    public void PingPongGame_divisibleBy5_Array() {
      PingPong PingPongGame = new PingPong();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(1);
      expected.add(2);
      expected.add("ping");
      expected.add(4);
      expected.add("pong");
      assertEquals(expected, PingPongGame.PingPongGame(5));
    }

    // "The PingPong method should print 'pingpong' for provided numbers divisible by 15. For example, 15 should return the ArrayList [1, 2, 'ping', 4 ,'pong', 'ping', 7, 8, 'ping', 'pong', 11, 'ping', 13, 14, 'pingpong']"
    @Test
    public void PingPongGame_divisibleBy15_Array() {
      PingPong PingPongGame = new PingPong();
      ArrayList<Object> expected = new ArrayList<Object>();
      expected.add(1);
      expected.add(2);
      expected.add("ping");
      expected.add(4);
      expected.add("pong");
      expected.add("ping");
      expected.add(7);
      expected.add(8);
      expected.add("ping");
      expected.add("pong");
      expected.add(11);
      expected.add("ping");
      expected.add(13);
      expected.add(14);
      expected.add("pingpong");
      assertEquals(expected, PingPongGame.PingPongGame(15));
    }
}
