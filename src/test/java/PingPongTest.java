import org.junit.*;
import static org.junit.Assert.*;

public class PingPongTest {

    @Test
    public void PingPongGame_notDivisibleByAnything_number() {
      assertEquals(2, PingPong.PingPongGame(2));
    }

    @Test
    public void PingPongGame_divisibleBy3_ping() {
      assertEquals("ping", PingPong.PingPongGame(3));
    }
    // "The PingPong method should count from 1 to a given number. For example, we expect 2 to return the ArrayList [1, 2]"
    //
    // "The PingPong method should print 'ping' for provided numbers divisible by 3. For example, 3 would return the ArrayList [1, 2, 'ping']"
    //
    // "The PingPong method should print 'pong' for provided numbers divisible by 5. For example, 5 would retrun the ArrayList [1,2,'ping', 4, 'pong']"
    //
    // "The PingPong method should print 'pingpong' for provided numbers divisible by 15. For example, 15 should return the ArrayList [1, 2, 'ping', 4 ,'pong', 'ping', 7, 8, 'ping', 'pong', 11, 'ping', 13, 14, 'pingpong']"
}
