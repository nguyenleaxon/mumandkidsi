package com.nguyenle.gotoagilevn.mumandchild.persistence.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Video;

@Repository
public interface VideoRepository extends MongoRepository<Video, String> {
   
	
}
