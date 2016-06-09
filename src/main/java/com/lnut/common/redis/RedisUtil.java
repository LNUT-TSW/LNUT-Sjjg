package com.lnut.common.redis;

import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

/**
 * Created by L on 16/5/21.
 */
@Component
public class RedisUtil {

    @Resource
    JedisPool jedisPool;

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public RedisUtil() {

    }
//    /*
//     * 正常返还链接
//	 */
//    private void returnResource(Jedis jedis, String cmdName, String key) {
//        if (jedis != null) {
//            try {
//                jedisPool.returnResource(jedis);
//            } catch (Exception e) {
////                logger.error(StringUtil.format("释放资源:{0}->{1}失败", cmdName, key), e);
//            }
//        }
//    }

    /**
     * 把对象放入Hash中
     */
    public void hset(String key,String field,String value, int seconds){
        Jedis jedis =jedisPool.getResource();
        jedis.hset(key,field, value);
        jedis.expire(key, seconds);
        jedisPool.returnResource(jedis);
    }
    /**
     * 从Hash中获取对象
     */
    public String hget(String key,String field){
        Jedis jedis =jedisPool.getResource();
        String text=jedis.hget(key,field);
        jedisPool.returnResource(jedis);
        return text;
    }
//    /**
//     * 从Hash中获取对象,转换成制定类型
//     */
//    public <T> T hget(String key,String field,Class<T> clazz){
//        String text=hget(key, field);
//        T result=JsonUtil.parseObject(text, clazz);
//        return result;
//    }
//    /**
//     * 从Hash中删除对象
//     */
//    public void hdel(String key,String ... field){
//        Jedis jedis =jedisPool.getResource();
//        Object result=jedis.hdel(key,field);
//        jedisPool.returnResource(jedis);
//    }
}
