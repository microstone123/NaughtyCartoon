package com.naughty.cartoon.bean;

import com.google.gson.annotations.Expose;

public class Image {
	@Expose
	private Integer ChapterId;

	@Expose
	private Integer Id;

	@Expose
	private Integer Sort;

	@Expose
	private String Url;

	public Integer getChapterId() {
		return ChapterId;
	}

	public void setChapterId(Integer chapterId) {
		ChapterId = chapterId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Integer getSort() {
		return Sort;
	}

	public void setSort(Integer sort) {
		Sort = sort;
	}

	public String getUrl() {
		return Url;
	}

	public void setUrl(String url) {
		Url = url;
	}

}
