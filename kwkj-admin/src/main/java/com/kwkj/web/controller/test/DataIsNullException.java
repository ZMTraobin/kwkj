package com.kwkj.web.controller.test;

public class DataIsNullException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
	private Integer code;
	
	private String msg;
	
	public DataIsNullException(ExceptionEnum ex){
		super(ex.getMessage());
		this.code = ex.getCode();
		this.msg = ex.getMessage();
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	

}
