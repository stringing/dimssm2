package service;

import java.util.List;

import pojo.Category;
import util.Page;

public interface CategoryService {
	List<Category> list();
	void addTwo();
	void deleteAll();
}