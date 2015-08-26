package com.nguyenle.gotoagilevn.mumandchild.persistence.service;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Category;

public interface VideoCategoryService {

	Category findByName(String name) throws Exception;
	Category saveCategory(Category category) throws Exception;
}
