package com.example.demo.sc;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JedisUtil {
    public static void main(String[] args) {
        //ip地址，端口号
//        Jedis jedis = cli_single("127.0.0.1", 6379);
//        jedis.set("key", "test connect!");
//        String value = jedis.get("key");
//        System.out.println(value);

        //连接本地的 Redis 服务
        Jedis jedis = new Jedis("localhost");
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        //存储数据到列表中
//        jedis.lpush("site-list", "Runoob");
//        jedis.lpush("site-list", "Google");
//        jedis.lpush("site-list", "Taobao");
//        // 获取存储的数据并输出
//        List<String> list = jedis.lrange("site-list", 0 ,2);
//        for(int i=0; i<list.size(); i++) {
//            System.out.println("列表项为: "+list.get(i));
//        }
        // 获取数据并输出
        Set<String> keys = jedis.keys("*");
        Iterator<String> it=keys.iterator() ;
        while(it.hasNext()){
            String key = it.next();
            System.out.println(key);
        }
    }

    /**
     * 单个连接
     *
     * @param host
     * @param port
     * @return
     */
    public static Jedis cli_single(String host, int port) {
        try {
            return new Jedis(host, port);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 连接池
     *
     * @param host
     * @param port
     * @return
     */
//    public static Jedis cli_pool(String host, int port) {
//        JedisPoolConfig config = new JedisPoolConfig();
//        // 最大连接数
//        config.setMaxTotal(10);
//        // 最大连接空闲数
//        config.setMaxIdle(2);
//        JedisPool jedisPool = new JedisPool(config, host, port);
//        try{
//
//            return jedisPool.getResource();
//        }catch(Exception e){
//            e.printStackTrace();
//            return null;
//        }
//
//    }
}
