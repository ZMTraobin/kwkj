package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 菜单表 kwkj_menu
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class Menu extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer menuId;
	/** 目录名称 */
	private String menuName;
	/** 父级目录 */
	private Integer menuParentId;
	/** 类型 */
	private String menuType;
	/** 路由 */
	private String menuUrl;
	/** 状态 */
	private String menuStatus;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 修改人 */
	private String updateBy;
	/** 修改时间 */
	private Date updateTime;

	public void setMenuId(Integer menuId) 
	{
		this.menuId = menuId;
	}

	public Integer getMenuId() 
	{
		return menuId;
	}
	public void setMenuName(String menuName) 
	{
		this.menuName = menuName;
	}

	public String getMenuName() 
	{
		return menuName;
	}
	public void setMenuParentId(Integer menuParentId) 
	{
		this.menuParentId = menuParentId;
	}

	public Integer getMenuParentId() 
	{
		return menuParentId;
	}
	public void setMenuType(String menuType) 
	{
		this.menuType = menuType;
	}

	public String getMenuType() 
	{
		return menuType;
	}
	public void setMenuUrl(String menuUrl) 
	{
		this.menuUrl = menuUrl;
	}

	public String getMenuUrl() 
	{
		return menuUrl;
	}
	public void setMenuStatus(String menuStatus) 
	{
		this.menuStatus = menuStatus;
	}

	public String getMenuStatus() 
	{
		return menuStatus;
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
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
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
            .append("menuId", getMenuId())
            .append("menuName", getMenuName())
            .append("menuParentId", getMenuParentId())
            .append("menuType", getMenuType())
            .append("menuUrl", getMenuUrl())
            .append("menuStatus", getMenuStatus())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
