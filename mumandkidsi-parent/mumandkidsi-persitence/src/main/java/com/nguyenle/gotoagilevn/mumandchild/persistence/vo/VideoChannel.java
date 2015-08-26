package com.nguyenle.gotoagilevn.mumandchild.persistence.vo;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="channel")
public class VideoChannel implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String channelName;
	private String channelUrl;
	private Boolean isActive;
	
	public VideoChannel(String channelName,String channelUrl) {
		this.channelName = channelName;
		this.channelUrl = channelUrl;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public String getChannelUrl() {
		return channelUrl;
	}

	public void setChannelUrl(String channelUrl) {
		this.channelUrl = channelUrl;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
}
