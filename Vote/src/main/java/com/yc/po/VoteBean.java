package com.yc.po;

import java.io.Serializable;
import java.util.List;
/**
 * 
 * 我要参与bean
 */
public class VoteBean implements Serializable {
	private static final long serialVersionUID = 8993922046107772955L;
	public int sub_id;
	private String title;
	private int optionCount;
    private List<Option>  options;
    private int voteUserCount;
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
	public int getOptionCount() {
		return optionCount;
	}
	public void setOptionCount(int optionCount) {
		this.optionCount = optionCount;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "VoteBean [sub_id="+sub_id+",title=" + title + ", optionCount=" + optionCount
				+ ", options=" + options + ", voteUserCount=" + voteUserCount
				+ ", type=" + type + "]";
	}
    
}
