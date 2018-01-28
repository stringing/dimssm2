package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mapper.CategoryMapper;
import pojo.Category;
import service.CategoryService;
import util.Page;

@Service//����Ƕ�CategoryService��ʵ�֣�ɨ�赽CategoryService���ʵ�������impl
public class CategoryServiceImpl implements CategoryService{

	@Autowired//��spring������ɨ�赽��mapperȡ����������CategoryMappper
	CategoryMapper categoryMapper;
	
	public List<Category> list() {
		return categoryMapper.list();//����dao�־ò㼴mapper�ķ���
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
		c1.setName("�̵�����");
		categoryMapper.add(c1);
		
		Category c2 = new Category();
		c2.setName("���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,���ֳ���Ӧ�ֶηŲ���,");
		categoryMapper.add(c2);
	}


}
