package com.kwkj.system.domain;


import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 离职人员交接表 kwkj_matters_quit
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class MattersQuit extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer kwkjMattersQuitid;
	/** 人员id */
	private Integer id;
	/** 部门工作 */
	private String department;
	/** 交接内容 */
	private String content;
	/** 办理情况 */
	private String situation;
	/** 交接人 */
	private String handover;
	/** 接收人 */
	private String receive;

	public void setKwkjMattersQuitid(Integer kwkjMattersQuitid) 
	{
		this.kwkjMattersQuitid = kwkjMattersQuitid;
	}

	public Integer getKwkjMattersQuitid() 
	{
		return kwkjMattersQuitid;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setDepartment(String department) 
	{
		this.department = department;
	}

	public String getDepartment() 
	{
		return department;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}

	public String getContent() 
	{
		return content;
	}
	public void setSituation(String situation) 
	{
		this.situation = situation;
	}

	public String getSituation() 
	{
		return situation;
	}
	public void setHandover(String handover) 
	{
		this.handover = handover;
	}

	public String getHandover() 
	{
		return handover;
	}
	public void setReceive(String receive) 
	{
		this.receive = receive;
	}

	public String getReceive() 
	{
		return receive;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("kwkjMattersQuitid", getKwkjMattersQuitid())
            .append("id", getId())
            .append("department", getDepartment())
            .append("content", getContent())
            .append("situation", getSituation())
            .append("handover", getHandover())
            .append("receive", getReceive())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
