package com.ema;

public class Glasses {

private Integer gid;
private String gbrand;
private String gcolor;


public Glasses() {
}

public Glasses(Integer gid, String gbrand, String gcolor) {
	this.setGid(gid);
	this.setGbrand(gbrand);
	this.setGcolor(gcolor);
	
}

public Integer getGid() {
	return gid;
}

public void setGid(Integer gid) {
	this.gid = gid;
}

public String getGbrand() {
	return gbrand;
}

public void setGbrand(String gbrand) {
	this.gbrand = gbrand;
}

public String getGcolor() {
	return gcolor;
}

public void setGcolor(String gcolor) {
	this.gcolor = gcolor;
}

}