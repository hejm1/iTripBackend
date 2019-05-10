import org.junit.Test;
import redis.clients.jedis.Jedis;

public class redisTest {
    @Test
    public void test(){
        Jedis jedis=new Jedis("localhost");
       jedis.set("name","hejm");
    }
}
