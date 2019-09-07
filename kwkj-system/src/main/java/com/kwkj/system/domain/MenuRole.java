package com.kwkj.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 菜单角色关联表 kwkj_menu_role
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class MenuRole extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 目录id */
	private Integer menuId;
	/** 角色id */
	private Integer roleId;

	public void setMenuId(Integer menuId) 
	{
		this.menuId = menuId;
	}

	public Integer getMenuId() 
	{
		return menuId;
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
            .append("menuId", getMenuId())
            .append("roleId", getRoleId())
            .toString();
    }
}
