package com.test.sleuth;

import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

@RestController
public class TestController {

  private static final Logger logger = Logger.getLogger(TestController.class.getName());

  @Value("${spring.redis.cluster.nodes}")
  private String redisHostAndPort;

  private void insertKey(String value) {
    JedisCluster jedis = new JedisCluster(HostAndPort.parseString(redisHostAndPort));
    jedis.set("test", value);
    logger.info("insert success ");

    String result = jedis.get("foo");
    logger.info(result);
    jedis.close();
  }

  @RequestMapping("/")
  public String home() {
    logger.info("Api triggered.");

    insertKey("value");

    return "Hello World";
  }
}
