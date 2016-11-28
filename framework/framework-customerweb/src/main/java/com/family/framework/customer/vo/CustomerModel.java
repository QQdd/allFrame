package com.family.framework.customer.vo;

public class CustomerModel {
	  private Integer uuid;

	    private String customerid;

	    private String pwd;

	    private String showname;

	    private String truename;

	    private String registertime;

	    public Integer getUuid() {
	        return uuid;
	    }

	    public void setUuid(Integer uuid) {
	        this.uuid = uuid;
	    }

	    public String getCustomerid() {
	        return customerid;
	    }

	    public void setCustomerid(String customerid) {
	        this.customerid = customerid == null ? null : customerid.trim();
	    }

	    public String getPwd() {
	        return pwd;
	    }

	    public void setPwd(String pwd) {
	        this.pwd = pwd == null ? null : pwd.trim();
	    }

	    public String getShowname() {
	        return showname;
	    }

	    public void setShowname(String showname) {
	        this.showname = showname == null ? null : showname.trim();
	    }

	    public String getTruename() {
	        return truename;
	    }

	    public void setTruename(String truename) {
	        this.truename = truename == null ? null : truename.trim();
	    }

	    public String getRegistertime() {
	        return registertime;
	    }

	    public void setRegistertime(String registertime) {
	        this.registertime = registertime == null ? null : registertime.trim();
	    }
		
}
