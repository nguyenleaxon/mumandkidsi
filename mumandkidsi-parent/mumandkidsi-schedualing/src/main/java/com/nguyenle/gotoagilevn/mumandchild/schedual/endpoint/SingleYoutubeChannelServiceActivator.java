package com.nguyenle.gotoagilevn.mumandchild.schedual.endpoint;

import org.apache.log4j.Logger;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.VideoChannel;

@MessageEndpoint
public class SingleYoutubeChannelServiceActivator {
	
	private final static Logger LOGGER = Logger.getLogger(SingleYoutubeChannelServiceActivator.class.getName()); 
	
	//@Autowired
	//private VideoCategoryService categoryService;
	
	@ServiceActivator
	public VideoChannel videoChannel (VideoChannel videoChannel) throws Exception {
		LOGGER.info("########  $$$$$$$$ Get only one channel by using splitter from list of channel" + videoChannel.getChannelName());
		return videoChannel;
	}
}
