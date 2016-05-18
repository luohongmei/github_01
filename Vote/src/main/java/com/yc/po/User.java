package com.yc.po;



public class User{
    private static int user_type_ordinary=1;//普通用户
    private static int user_type_admin=2;//管理员
	private String userid;      // --用户id
	private String username;       //  --用户名
	private String password;         //  --用户密码
	private int  status = 1; //用户角色
	private int version;  //用户是否有效
	public boolean isAdminstrator(){
	   return (this.status==user_type_admin);
		
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
}
