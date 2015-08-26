package com.nguyenle.gotoagilevn.mumandchild.schedual.endpoint;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Video;

@MessageEndpoint
public class JmsServiceActivator {
	
	private final static Logger LOGGER = Logger.getLogger(AddCategoryPropertiesTransform.class.getName());
	
	@Autowired
	VideoService videoService;
	
	@ServiceActivator
	public void readVideoFromQueeu(Video video) {
		LOGGER.info("Reading Video From Queeu : " + video.getName());
		videoService.saveVideoToDatabase(video);
		LOGGER.info("########### DONE SAVING DATABASE  " + video.getName());
	}
	
}
