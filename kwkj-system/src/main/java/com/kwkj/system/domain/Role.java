package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 角色表 kwkj_role
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class Role extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer roleId;
	/** 角色名 */
	private String roleName;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 修改人 */
	private Date updateBy;
	/** 修改时间 */
	private Date updateTime;

	public void setRoleId(Integer roleId) 
	{
		this.roleId = roleId;
	}

	public Integer getRoleId() 
	{
		return roleId;
	}
	public void setRoleName(String roleName) 
	{
		this.roleName = roleName;
	}

	public String getRoleName() 
	{
		return roleName;
	}
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(Date updateBy) 
	{
		this.updateBy = updateBy;
	}

	/*public Date getUpdateBy() 
	{
		return updateBy;
	}*/
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("roleId", getRoleId())
            .append("roleName", getRoleName())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
