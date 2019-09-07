package com.kwkj.web.controller.test;

public enum ExceptionEnum {
	
	IS_NULL(2000,"the param can not be null"),
	NOT_NULL(9999,"profect,it is right");
	
    private Integer code;
	
	private String message;

	private ExceptionEnum(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	

}
