package com.zqskate.test;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zqskate.utils.RedisUtils;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedisUtils {
	
	@Resource
	private RedisUtils RedisUtils;
	
	@Test
	public void testResid() {
		RedisUtils.set("key", "value", 1000L);
	}

}
