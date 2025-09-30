package com.bubblesort;

public enum StatusCode {

	SUCCESS(200), NOTFOUND(404), BADREQUEST(400);

	int code;
	StatusCode(int i) {
		// TODO Auto-generated constructor stub
		this.code = i;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
}
