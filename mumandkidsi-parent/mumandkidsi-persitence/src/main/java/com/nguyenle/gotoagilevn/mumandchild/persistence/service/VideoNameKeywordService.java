package com.nguyenle.gotoagilevn.mumandchild.persistence.service;

import java.util.List;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.VideoNameKeyword;

public interface VideoNameKeywordService {

	List<VideoNameKeyword> listAllKeywords();
	VideoNameKeyword findVideoNameKeyByName(String name) throws Exception;
}
