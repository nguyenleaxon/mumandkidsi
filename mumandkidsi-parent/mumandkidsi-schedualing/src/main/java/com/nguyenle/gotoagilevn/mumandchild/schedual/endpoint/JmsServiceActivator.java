package com.nguyenle.gotoagilevn.mumandchild.schedual.endpoint;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoChannelService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.service.VideoService;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Video;
import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.VideoChannel;

@MessageEndpoint
public class JmsServiceActivator {
	
	private final static Logger LOGGER = Logger.getLogger(JmsServiceActivator.class.getName());
	
	@Autowired
	VideoService videoService;
	
	@Autowired
	VideoChannelService channelService;
	
	@ServiceActivator
	public void readVideoFromQueeu(Video video) {
		try {
		LOGGER.info("Reading Video From Queeu : " + video.getName());
		VideoChannel videoChannel = getChannelByUrl(video.getChannelURL());
		video.setChannel(videoChannel);
		videoService.saveVideoToDatabase(video);
		LOGGER.info("########### DONE SAVING DATABASE  " + video.getName());
		} catch (Exception ex) {
			LOGGER.error(ex);
		}
	}
	
	private VideoChannel getChannelByUrl(String channel) throws Exception {
   	 return channelService.getChannelByUrl(channel);
    }
	
}
