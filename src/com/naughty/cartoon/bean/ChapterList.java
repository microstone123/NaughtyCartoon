package com.naughty.cartoon.bean;

import com.google.gson.annotations.Expose;

public class ChapterList {
	@Expose
	private Object book;

	@Expose
	private Integer bookId;

	@Expose
	private Integer chapterNo;

	@Expose
	private Integer chapterType;

	@Expose
	private String frontCover;

	@Expose
	private Integer id;

	@Expose
	private Object images;

	@Expose
	private String postUser;

	@Expose
	private Integer reel;

	@Expose
	private String refreshTime;

	@Expose
	private String refreshTimeStr;

	@Expose
	private Integer sort;

	@Expose
	private String title;

	public Object getBook() {
		return book;
	}

	public void setBook(Object book) {
		this.book = book;
	}

	public Integer getBookId() {
		return bookId;
	}

	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}

	public Integer getChapterNo() {
		return chapterNo;
	}

	public void setChapterNo(Integer chapterNo) {
		this.chapterNo = chapterNo;
	}

	public Integer getChapterType() {
		return chapterType;
	}

	public void setChapterType(Integer chapterType) {
		this.chapterType = chapterType;
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

	public Object getImages() {
		return images;
	}

	public void setImages(Object images) {
		this.images = images;
	}

	public String getPostUser() {
		return postUser;
	}

	public void setPostUser(String postUser) {
		this.postUser = postUser;
	}

	public Integer getReel() {
		return reel;
	}

	public void setReel(Integer reel) {
		this.reel = reel;
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

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
		this.sort = sort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
