package com.kwkj.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 用户角色关联表 kwkj_user_role
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class UserRole extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 用户id */
	private Integer userId;
	/** 角色id */
	private Integer roleId;

	public void setUserId(Integer userId) 
	{
		this.userId = userId;
	}

	public Integer getUserId() 
	{
		return userId;
	}
	public void setRoleId(Integer roleId) 
	{
		this.roleId = roleId;
	}

	public Integer getRoleId() 
	{
		return roleId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("userId", getUserId())
            .append("roleId", getRoleId())
            .toString();
    }
}
