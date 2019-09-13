package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 简历面试流程表 kwkj_resume_proccess
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class ResumeProccess extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 流水主键 */
	private Integer proccessId;
	/** 上级流水编号 */
	private Integer parentId;
	/** 简历id */
	private Integer resId;
	/** 姓名 */
	private String name;
	/** 状态 */
	private String status;
	/** 简历反馈 */
	private String resFeedback;
	/** 面试反馈 */
	private String interviewFeedback;
	/** 项目主键 */
	private Integer proId;
	/** 类型 */
	private String type;
	/** 备注 */
	private String remark;

	public void setProccessId(Integer proccessId) 
	{
		this.proccessId = proccessId;
	}

	public Integer getProccessId() 
	{
		return proccessId;
	}
	public void setParentId(Integer parentId) 
	{
		this.parentId = parentId;
	}

	public Integer getParentId() 
	{
		return parentId;
	}
	public void setResId(Integer resId) 
	{
		this.resId = resId;
	}

	public Integer getResId() 
	{
		return resId;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setResFeedback(String resFeedback) 
	{
		this.resFeedback = resFeedback;
	}

	public String getResFeedback() 
	{
		return resFeedback;
	}
	public void setInterviewFeedback(String interviewFeedback) 
	{
		this.interviewFeedback = interviewFeedback;
	}

	public String getInterviewFeedback() 
	{
		return interviewFeedback;
	}
	public void setProId(Integer proId) 
	{
		this.proId = proId;
	}

	public Integer getProId() 
	{
		return proId;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("proccessId", getProccessId())
            .append("parentId", getParentId())
            .append("resId", getResId())
            .append("name", getName())
            .append("status", getStatus())
            .append("resFeedback", getResFeedback())
            .append("interviewFeedback", getInterviewFeedback())
            .append("proId", getProId())
            .append("type", getType())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
