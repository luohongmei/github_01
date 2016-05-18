package com.yc.po;

public class Item {
	private int  it_id;//--编号
	private int op_id;// --投票选项id
	private int  sub_id ;// --投票主题编号id
	private String  userid;//--用户id
	public int getIt_id() {
		return it_id;
	}
	public void setIt_id(int it_id) {
		this.it_id = it_id;
	}
	public int getOp_id() {
		return op_id;
	}
	public void setOp_id(int op_id) {
		this.op_id = op_id;
	}
	public int getSub_id() {
		return sub_id;
	}
	public void setSub_id(int sub_id) {
		this.sub_id = sub_id;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Item [it_id=" + it_id + ", op_id=" + op_id + ", sub_id="
				+ sub_id + ", userid=" + userid + "]";
	}
	
}
