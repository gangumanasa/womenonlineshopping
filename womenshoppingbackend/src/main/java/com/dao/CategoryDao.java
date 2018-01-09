package com.dao;

import java.util.List;

import com.model.Category;

//interface for category
public interface CategoryDao 
{
	public void insertCategory(Category category);
	public List<Category>retrieve();
	public Category findById(int cid);
	public void deleteCategory(int cid);
	public void updateCategory(Category c);
	

}
