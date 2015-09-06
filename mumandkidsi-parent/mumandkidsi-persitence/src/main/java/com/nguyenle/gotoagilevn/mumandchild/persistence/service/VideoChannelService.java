package com.nguyenle.gotoagilevn.mumandchild.persistence.service;

import java.util.List;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.VideoChannel;

public interface VideoChannelService {

	List<VideoChannel> getAllActiveChannel() throws Exception;
	
	VideoChannel getChannelByUrl(String channelUrl) throws Exception;
}
