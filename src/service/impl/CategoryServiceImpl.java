package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;
import util.Page;

@Service//这个是对CategoryService的实现，扫描到CategoryService则会实例化这个impl
public class CategoryServiceImpl implements CategoryService{

	@Autowired//从spring容器内扫描到的mapper取出来赋予它CategoryMappper
	CategoryMapper categoryMapper;
	
	public List<Category> list() {
		return categoryMapper.list();//调用dao持久层即mapper的方法
	}
	
	public void deleteAll() {
		List<Category> cs = list();
		for (Category c : cs) {
			
			categoryMapper.delete(c.getId());
		}
	}
	
	@Override
	public void addTwo() {
		
		Category c1 = new Category();
		c1.setName("短的名字");
		categoryMapper.add(c1);
		
		Category c2 = new Category();
		c2.setName("名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,名字长对应字段放不下,");
		categoryMapper.add(c2);
	}


}
