package com.tiny.document;

import java.util.Date;

import lombok.Data;

@Data
public class Document {
	private int documentId;
	private String content;
	private int point;
	private int like;
	private int dislike;
	private int comment;
	private int sharing;
	private String providerUserId;
	private String name;
	private String ipAddress;
	private Date regDate;

	public void setIpAddress(String ipAddress) {
		String[] split = ipAddress.split("\\.");
		if (split.length == 4) {
			this.ipAddress = String.format("%02x%02x%02x%02x", Integer.parseInt(split[0]), Integer.parseInt(split[1]),
					Integer.parseInt(split[2]), Integer.parseInt(split[3]));
		}
	}
}