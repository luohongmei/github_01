package com.yc.po;

import java.util.List;
/**
 * 添加新投票操作
 * @author LHM
 *
 */
public class AddSubjectBean {
	 private int sub_id;
     private String title;
     private List<String>options;
     private int type;

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
	public List<String> getOptions() {
		return options;
	}
	public void setOptions(List<String> options) {
		this.options = options;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "AddSubjectBean [sub_id=" + sub_id + ", title=" + title
				+ ", options=" + options + ", type=" + type + "]";
	}
	  
       
}
