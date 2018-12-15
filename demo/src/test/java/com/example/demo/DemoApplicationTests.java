package com.example.demo;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.News;
import com.example.demo.mapper2.mybatis.NewsDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	@Autowired
	private NewsDao newsDao;
	@Test
	public void contextLoads() {
		News news = newsDao.GetTop1News();
		String json= JSONObject.toJSON(news).toString();
		System.out.print(json);
	}
}
