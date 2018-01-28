package test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import service.CategoryService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class MTest {

	@Autowired
	private CategoryService categoryService;

	@Test
	@Transactional(propagation=Propagation.REQUIRED,rollbackForClassName="Exception")//使用事务的注解
	public void testAddTwo() {
		categoryService.deleteAll();
		categoryService.addTwo();
		
	}

}
