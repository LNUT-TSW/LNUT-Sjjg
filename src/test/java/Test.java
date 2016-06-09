package java;

import com.lnut.common.redis.RedisUtil;

/**
 * Created by L on 16/5/21.
 */
public class Test {
    public static void main(String args[]) {
        RedisUtil redisUtil = new RedisUtil();
        redisUtil.hset("Test","TestByLzj","Sjjg",50);
    }

}
