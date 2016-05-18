package com.yc.po;

import java.io.Serializable;
/**
 * Í¶Æ±ÁÐ±íbean
 * @author LHM
 *
 */
public class SubjectBean implements Serializable {
	private static final long serialVersionUID = 2976110412797382104L;
	private int sub_id;
	private String title;
	private int optionCount;
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

	public int getVoteUser() {
		return voteUserCount;
	}

	public void setVoteUser(int voteUserCount) {
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
		return "SubjectBean [sub_id=" + sub_id + ", title=" + title
				+ ", optionCount=" + optionCount + ", voteUserCount="
				+ voteUserCount + ", type=" + type + "]";
	}

}
