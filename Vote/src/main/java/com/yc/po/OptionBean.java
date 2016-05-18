package com.yc.po;

import java.io.Serializable;

import java.util.List;
/**
 * Õ∂∆±œÍ«Èbean
 * @author LHM
 *
 */
public class OptionBean implements Serializable {
	private static final long serialVersionUID = -4518717595153574721L;
	private String title;
	private int optionCount;
    private List<Integer> voteOptionCount;
    private int voteUserCount;
    
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
	public List<Integer> getVoteOptionCount() {
		return voteOptionCount;
	}
	public void setVoteOptionCount(List<Integer> voteOptionCount) {
		this.voteOptionCount = voteOptionCount;
	}
	public int getVoteUserCount() {
		return voteUserCount;
	}
	public void setVoteUserCount(int voteUserCount) {
		this.voteUserCount = voteUserCount;
	}
	@Override
	public String toString() {
		return "OptionBean [title=" + title + ", optionCount=" + optionCount
				+ ", voteOptionCount=" + voteOptionCount + ", voteUserCount="
				+ voteUserCount + "]";
	}

    
}
