package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 项目表 kwkj_project
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class Project extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer proId;
	/** 项目名 */
	private String proName;
	/** 项目开始时间 */
	private Date starTime;
	/** 项目状态 */
	private String proStatus;
	/** 项目描述 */
	private String proDis;
	/** 项目负责人id */
	private Integer proPersonId;
	/** 项目备注 */
	private String proRemark;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 修改人 */
	private String updateBy;
	/** 修改时间 */
	private Date updateTime;

	public void setProId(Integer proId) 
	{
		this.proId = proId;
	}

	public Integer getProId() 
	{
		return proId;
	}
	public void setProName(String proName) 
	{
		this.proName = proName;
	}

	public String getProName() 
	{
		return proName;
	}
	public void setStarTime(Date starTime) 
	{
		this.starTime = starTime;
	}

	public Date getStarTime() 
	{
		return starTime;
	}
	public void setProStatus(String proStatus) 
	{
		this.proStatus = proStatus;
	}

	public String getProStatus() 
	{
		return proStatus;
	}
	public void setProDis(String proDis) 
	{
		this.proDis = proDis;
	}

	public String getProDis() 
	{
		return proDis;
	}
	public void setProPersonId(Integer proPersonId) 
	{
		this.proPersonId = proPersonId;
	}

	public Integer getProPersonId() 
	{
		return proPersonId;
	}
	public void setProRemark(String proRemark) 
	{
		this.proRemark = proRemark;
	}

	public String getProRemark() 
	{
		return proRemark;
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
            .append("proId", getProId())
            .append("proName", getProName())
            .append("starTime", getStarTime())
            .append("proStatus", getProStatus())
            .append("proDis", getProDis())
            .append("proPersonId", getProPersonId())
            .append("proRemark", getProRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
