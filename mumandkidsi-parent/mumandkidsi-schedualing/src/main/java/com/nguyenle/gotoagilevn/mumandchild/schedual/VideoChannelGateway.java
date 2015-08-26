package com.nguyenle.gotoagilevn.mumandchild.schedual;



import java.util.Collection;

import com.nguyenle.gotoagilevn.mumandchild.persistence.vo.VideoChannel;

public interface VideoChannelGateway {

	void getAllVideoChanelsFromDB(Collection<VideoChannel> videochannels);
}
