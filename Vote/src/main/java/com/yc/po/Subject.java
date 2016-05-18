package com.yc.po;


public class Subject  {
	
	 private int sub_id;           // --投票主题编号
	 private String title;   // --投票主题
	 private String type;
	
	 public int getSub_id() {
		return sub_id;
	 }
	 public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	 }
	 public String getTitle() {
		return title;
	 }
	 public void setTitle(String title) {
		this.title = title;
	 }
	 
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Subject [sub_id=" + sub_id + ", title=" + title + ", type="
				+ type + "]";
	}
	
}
