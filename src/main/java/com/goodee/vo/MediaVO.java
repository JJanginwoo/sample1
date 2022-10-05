package com.goodee.vo;

import org.springframework.web.multipart.MultipartFile;

public class MediaVO {
	private String user;
	private String url;
	private MultipartFile[] mediafile;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public MultipartFile[] getMediafile() {
		return mediafile;
	}
	public void setMediafile(MultipartFile[] mediafile) {
		this.mediafile = mediafile;
	}
}
