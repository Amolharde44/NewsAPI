package com.News.Model;

public class NewsEntity {

	
	String from;
	String sortBy;
	String apiKey;
	String qnTitle;
	public NewsEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsEntity(String from, String sortBy, String apiKey, String qnTitle) {
		super();
		this.from = from;
		this.sortBy = sortBy;
		this.apiKey = apiKey;
		this.qnTitle = qnTitle;
	}
	@Override
	public String toString() {
		return "NewsEntity [from=" + from + ", sortBy=" + sortBy + ", apiKey=" + apiKey + ", qnTitle=" + qnTitle + "]";
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getSortBy() {
		return sortBy;
	}
	public void setSortBy(String sortBy) {
		this.sortBy = sortBy;
	}
	public String getApiKey() {
		return apiKey;
	}
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}
	public String getQnTitle() {
		return qnTitle;
	}
	public void setQnTitle(String qnTitle) {
		this.qnTitle = qnTitle;
	}
	
	
}
