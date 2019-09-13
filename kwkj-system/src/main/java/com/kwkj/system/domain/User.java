package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 用户表 kwkj_user
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class User extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer userId;
	/** 姓名 */
	private String userName;
	/** 登录名 */
	private String loginName;
	/** 密码 */
	private String password;
	/** 状态 */
	private String status;
	/** 年龄 */
	private Integer age;
	/** 手机 */
	private String phone;
	/** 身份证 */
	private String idCard;
	/** 地址 */
	private String addr;
	/** 邮箱 */
	private String eamil;

	public void setUserId(Integer userId) 
	{
		this.userId = userId;
	}

	public Integer getUserId() 
	{
		return userId;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}

	public String getUserName() 
	{
		return userName;
	}
	public void setLoginName(String loginName) 
	{
		this.loginName = loginName;
	}

	public String getLoginName() 
	{
		return loginName;
	}
	public void setPassword(String password) 
	{
		this.password = password;
	}

	public String getPassword() 
	{
		return password;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setAge(Integer age) 
	{
		this.age = age;
	}

	public Integer getAge() 
	{
		return age;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setIdCard(String idCard) 
	{
		this.idCard = idCard;
	}

	public String getIdCard() 
	{
		return idCard;
	}
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}

	public String getAddr() 
	{
		return addr;
	}
	public void setEamil(String eamil) 
	{
		this.eamil = eamil;
	}

	public String getEamil() 
	{
		return eamil;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("userName", getUserName())
            .append("loginName", getLoginName())
            .append("password", getPassword())
            .append("status", getStatus())
            .append("age", getAge())
            .append("phone", getPhone())
            .append("idCard", getIdCard())
            .append("addr", getAddr())
            .append("eamil", getEamil())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
