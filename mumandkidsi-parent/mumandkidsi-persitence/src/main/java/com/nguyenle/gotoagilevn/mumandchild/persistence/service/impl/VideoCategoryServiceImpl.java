package com.nguyenle.gotoagilevn.mumandchild.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nguyenle.gotoagilevn.mumandchild.persistence.repository.VideoCategoryRepository;
import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoCategoryService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Category;

@Service
public class VideoCategoryServiceImpl implements VideoCategoryService{

	@Autowired
	private VideoCategoryRepository categoryRepository;
	
	@Override
	public Category findByName(String name) throws Exception {
			Category test = categoryRepository.findByName(name);
			return test ;
	}

	@Override
	public Category saveCategory(Category category) throws Exception {
		return categoryRepository.save(category);
	}

}
