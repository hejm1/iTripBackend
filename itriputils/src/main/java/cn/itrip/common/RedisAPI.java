package cn.itrip.common;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class RedisAPI {
    public JedisPool jedisPool;//redis连接池对象

    public JedisPool getJedisPool() {
        return jedisPool;
    }

    public void setJedisPool(JedisPool jedisPool) {
        this.jedisPool = jedisPool;
    }

    /**
     * 设置key和value到redis中去
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key, String value) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set(key, value);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到链接池
            RedisAPI.returnResource(jedisPool, jedis);
        }
        return false;
    }

    /**
     * 判断某个key是否存在
     * @param key
     * @return
     */
    public boolean exist(String key) {
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            return jedis.exists(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到链接池
            RedisAPI.returnResource(jedisPool, jedis);
        }
        return false;
    }

    public static void returnResource(JedisPool jedisPool, Jedis jedis) {
        if (null != jedis) {
            jedisPool.returnResource(jedis);
        }
    }

    /**
     * 获取数据
     * @param key
     * @return
     */
    public String get(String key) {
        String value = null;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value = jedis.get(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到链接池
            RedisAPI.returnResource(jedisPool, jedis);
        }
        return value;
    }

    /**
     * 判断redis中是否存在传入的key
     * @param key
     * @return
     */
    public boolean existsForKey(String key) {
        boolean value = false;
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            value = jedis.exists(key);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //返还到链接池
            RedisAPI.returnResource(jedisPool, jedis);
        }
        return value;
    }
}
