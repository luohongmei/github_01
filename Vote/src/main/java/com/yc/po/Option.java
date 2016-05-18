package com.yc.po;

public class Option {
	  private int op_id;//  --编号
	  private String option1;//--投票选项
	  private int sub_id;   // --投票主题
	  private int order1;//--显示顺序
	  
	public Option(){
		
	}
	public Option(String option1, int sub_id, int order1) {
		this.option1 = option1;
		this.sub_id = sub_id;
		this.order1 = order1;
	}
	public int getOp_id() {
		return op_id;
	}
	public void setOp_id(int op_id) {
		this.op_id = op_id;
	}
	public String getOption1() {
		return option1;
	}
	public void setOption1(String option1) {
		this.option1 = option1;
	}
	
	public int getOrder1() {
		return order1;
	}
	public void setOrder1(int order1) {
		this.order1 = order1;
	}
	
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	@Override
	public String toString() {
		return "Option [op_id=" + op_id + ", option1=" + option1 + ", sub_id="
				+ sub_id + ", order1=" + order1 + "]";
	}
	
}
