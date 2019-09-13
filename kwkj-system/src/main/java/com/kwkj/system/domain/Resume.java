package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 简历表 kwkj_resume
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class Resume extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer resId;
	/** 姓名 */
	private String name;
	/** 年龄 */
	private Integer age;
	/** 应聘职位 */
	private String post;
	/** 工作年限 */
	private String workYear;
	/** 学历 */
	private String edu;
	/** 电话 */
	private String phone;
	/** 专业 */
	private String major;
	/** 学校 */
	private String school;
	/** 邮箱 */
	private String email;
	/** 住址 */
	private String addr;
	/** 状态 */
	private String status;
	/** 面试次数 */
	private Integer count;
	/** 面试时间 */
	private String interview;
	/** 技能 */
	private String skill;
	/** 工作经验 */
	private String workExperience;
	/** 薪资 */
	private String salary;
	/** 项目主键 */
	private Integer proId;

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
	public void setAge(Integer age) 
	{
		this.age = age;
	}

	public Integer getAge() 
	{
		return age;
	}
	public void setPost(String post) 
	{
		this.post = post;
	}

	public String getPost() 
	{
		return post;
	}
	public void setWorkYear(String workYear) 
	{
		this.workYear = workYear;
	}

	public String getWorkYear() 
	{
		return workYear;
	}
	public void setEdu(String edu) 
	{
		this.edu = edu;
	}

	public String getEdu() 
	{
		return edu;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getPhone() 
	{
		return phone;
	}
	public void setMajor(String major) 
	{
		this.major = major;
	}

	public String getMajor() 
	{
		return major;
	}
	public void setSchool(String school) 
	{
		this.school = school;
	}

	public String getSchool() 
	{
		return school;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}

	public String getAddr() 
	{
		return addr;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setCount(Integer count) 
	{
		this.count = count;
	}

	public Integer getCount() 
	{
		return count;
	}
	public void setInterview(String interview) 
	{
		this.interview = interview;
	}

	public String getInterview() 
	{
		return interview;
	}
	public void setSkill(String skill) 
	{
		this.skill = skill;
	}

	public String getSkill() 
	{
		return skill;
	}
	public void setWorkExperience(String workExperience) 
	{
		this.workExperience = workExperience;
	}

	public String getWorkExperience() 
	{
		return workExperience;
	}
	public void setSalary(String salary) 
	{
		this.salary = salary;
	}

	public String getSalary() 
	{
		return salary;
	}
	public void setProId(Integer proId) 
	{
		this.proId = proId;
	}

	public Integer getProId() 
	{
		return proId;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("resId", getResId())
            .append("name", getName())
            .append("age", getAge())
            .append("post", getPost())
            .append("workYear", getWorkYear())
            .append("edu", getEdu())
            .append("phone", getPhone())
            .append("major", getMajor())
            .append("school", getSchool())
            .append("email", getEmail())
            .append("addr", getAddr())
            .append("status", getStatus())
            .append("count", getCount())
            .append("interview", getInterview())
            .append("skill", getSkill())
            .append("workExperience", getWorkExperience())
            .append("salary", getSalary())
            .append("proId", getProId())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
