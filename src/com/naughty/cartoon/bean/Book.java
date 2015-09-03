package com.naughty.cartoon.bean;

import com.google.gson.annotations.Expose;

public class Book {
	@Expose
	private String author;

	@Expose
	private Integer classifyId;

	@Expose
	private String explain;

	@Expose
	private String frontCover;

	@Expose
	private Integer id;

	@Expose
	private Integer lastChapterNo;

	@Expose
	private String refreshTime;

	@Expose
	private String refreshTimeStr;

	@Expose
	private String serializedState;

	@Expose
	private String title;

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Integer getClassifyId() {
		return classifyId;
	}

	public void setClassifyId(Integer classifyId) {
		this.classifyId = classifyId;
	}

	public String getExplain() {
		return explain;
	}

	public void setExplain(String explain) {
		this.explain = explain;
	}

	public String getFrontCover() {
		return frontCover;
	}

	public void setFrontCover(String frontCover) {
		this.frontCover = frontCover;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getLastChapterNo() {
		return lastChapterNo;
	}

	public void setLastChapterNo(Integer lastChapterNo) {
		this.lastChapterNo = lastChapterNo;
	}

	public String getRefreshTime() {
		return refreshTime;
	}

	public void setRefreshTime(String refreshTime) {
		this.refreshTime = refreshTime;
	}

	public String getRefreshTimeStr() {
		return refreshTimeStr;
	}

	public void setRefreshTimeStr(String refreshTimeStr) {
		this.refreshTimeStr = refreshTimeStr;
	}

	public String getSerializedState() {
		return serializedState;
	}

	public void setSerializedState(String serializedState) {
		this.serializedState = serializedState;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
