package com.yc.po;



public class User{
    private static int user_type_ordinary=1;//��ͨ�û�
    private static int user_type_admin=2;//����Ա
	private String userid;      // --�û�id
	private String username;       //  --�û���
	private String password;         //  --�û�����
	private int  status = 1; //�û���ɫ
	private int version;  //�û��Ƿ���Ч
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
