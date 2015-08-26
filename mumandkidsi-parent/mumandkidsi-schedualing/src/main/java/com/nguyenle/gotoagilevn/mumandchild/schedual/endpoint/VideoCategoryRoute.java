package com.nguyenle.gotoagilevn.mumandchild.schedual.endpoint;


import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.Router;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.Video;

@MessageEndpoint
public class VideoCategoryRoute {

	@Router
	public String routeVideo(Video video) {
		System.out.println("Rount Video Baseon title " + video.getName());
		String videoName = video.getName();
		String route = "nocategory";
		if (videoName.contains("Tôm") || videoName.contentEquals("tôm")) {
			route = "tom";
		} else if (videoName.contains("Gỏi") || videoName.contentEquals("gỏi")) {
			route = "goi";
		} else if (videoName.contains("Nai") || videoName.contentEquals("nai")) {
			route = "nai";
		}
		return route;
	}
}
