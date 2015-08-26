package com.nguyenle.gotoagilevn.mumandchild.schedual.endpoint;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoCategoryService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Category;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Video;
import com.nguyenle.gotoagilevn.mumandchild.schedual.util.VideoCatetoryNameUtil;

@MessageEndpoint
public class LoggingRejectVideoServiceActivator {

	private final static Logger LOGGER = Logger
			.getLogger(LoggingRejectVideoServiceActivator.class.getName());

	@Autowired
	private VideoService videoService;

	@Autowired
	private VideoCategoryService categoryService;

	@ServiceActivator
	public void loggingRejectVideo(Video video) {

		Category unknowCategory = null;
		try {
			unknowCategory = categoryService.findByName(VideoCatetoryNameUtil.UNKNOWN_CATEGORY);
			video.setVideoCategory(unknowCategory);
			videoService.saveVideoToDatabase(video);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			LOGGER.error("Error Message " + e.getMessage());
		}
		LOGGER.info("######### Video Name " + video.getName() + " Doesn't exist in keywords table #######");
	}
}
