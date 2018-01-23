package com.piggsoft.blog;

import com.piggsoft.blog.po.Blog;
import com.piggsoft.blog.repository.BlogRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BlogApplicationTests {

	@Autowired
	private BlogRepository blogRepository;

	@Test
	public void contextLoads() {
		Blog blog = new Blog();
		blog.setTag("123");
		blog.setTitle("2222");
		blog.setContent("123123中国人们我们爱你");
		blogRepository.save(blog);
	}

}
