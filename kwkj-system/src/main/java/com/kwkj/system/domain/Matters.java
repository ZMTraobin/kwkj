package com.kwkj.system.domain;

import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import com.kwkj.common.base.BaseEntity;

/**
 * 在职人员表 kwkj_matters
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public class Matters extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Integer id;
	/** 姓名 */
	private String name;
	/** 负责人 */
	private String personCharge;
	/** 入职日期 */
	private Date inTime;
	/** 转正日期 */
	private Date regularTime;
	/** 合同结束时间 */
	private Date contractEndTime;
	/** 身份证 */
	private String idCard;
	/** 出生日期 */
	private Date birthDate;
	/** 年龄 */
	private Integer age;
	/** 电话 */
	private String phone;
	/** 邮箱 */
	private String email;
	/** qq */
	private String qq;
	/** 性别 */
	private String sex;
	/** 婚姻状况 */
	private String marryInfo;
	/** 籍贯 */
	private String addr;
	/** 学历 */
	private String edu;
	/** 专业 */
	private String major;
	/** 学校 */
	private String school;
	/** 项目id */
	private Integer proId;
	/** 职位 */
	private String post;
	/** 薪资 */
	private String salary;
	/** 银行卡号 */
	private Integer bankCardNo;
	/** 简历id/用户id */
	private Integer connectId;
	/** 人事类别 */
	private String type;
	/** 状态 */
	private String status;
	/** 备注 */
	private String remark;
	/** 工作交接日 */
	private String handover;
	/** 离职日期 */
	private String quit;
	/** 创建人 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 修改人 */
	private Date updateBy;
	/** 修改时间 */
	private Date updateTime;

	public void setId(Integer id) 
	{
		this.id = id;
	}

	public Integer getId() 
	{
		return id;
	}
	public void setName(String name) 
	{
		this.name = name;
	}

	public String getName() 
	{
		return name;
	}
	public void setPersonCharge(String personCharge) 
	{
		this.personCharge = personCharge;
	}

	public String getPersonCharge() 
	{
		return personCharge;
	}
	public void setInTime(Date inTime) 
	{
		this.inTime = inTime;
	}

	public Date getInTime() 
	{
		return inTime;
	}
	public void setRegularTime(Date regularTime) 
	{
		this.regularTime = regularTime;
	}

	public Date getRegularTime() 
	{
		return regularTime;
	}
	public void setContractEndTime(Date contractEndTime) 
	{
		this.contractEndTime = contractEndTime;
	}

	public Date getContractEndTime() 
	{
		return contractEndTime;
	}
	public void setIdCard(String idCard) 
	{
		this.idCard = idCard;
	}

	public String getIdCard() 
	{
		return idCard;
	}
	public void setBirthDate(Date birthDate) 
	{
		this.birthDate = birthDate;
	}

	public Date getBirthDate() 
	{
		return birthDate;
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
	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getEmail() 
	{
		return email;
	}
	public void setQq(String qq) 
	{
		this.qq = qq;
	}

	public String getQq() 
	{
		return qq;
	}
	public void setSex(String sex) 
	{
		this.sex = sex;
	}

	public String getSex() 
	{
		return sex;
	}
	public void setMarryInfo(String marryInfo) 
	{
		this.marryInfo = marryInfo;
	}

	public String getMarryInfo() 
	{
		return marryInfo;
	}
	public void setAddr(String addr) 
	{
		this.addr = addr;
	}

	public String getAddr() 
	{
		return addr;
	}
	public void setEdu(String edu) 
	{
		this.edu = edu;
	}

	public String getEdu() 
	{
		return edu;
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
	public void setProId(Integer proId) 
	{
		this.proId = proId;
	}

	public Integer getProId() 
	{
		return proId;
	}
	public void setPost(String post) 
	{
		this.post = post;
	}

	public String getPost() 
	{
		return post;
	}
	public void setSalary(String salary) 
	{
		this.salary = salary;
	}

	public String getSalary() 
	{
		return salary;
	}
	public void setBankCardNo(Integer bankCardNo) 
	{
		this.bankCardNo = bankCardNo;
	}

	public Integer getBankCardNo() 
	{
		return bankCardNo;
	}
	public void setConnectId(Integer connectId) 
	{
		this.connectId = connectId;
	}

	public Integer getConnectId() 
	{
		return connectId;
	}
	public void setType(String type) 
	{
		this.type = type;
	}

	public String getType() 
	{
		return type;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}

	public String getStatus() 
	{
		return status;
	}
	public void setRemark(String remark) 
	{
		this.remark = remark;
	}

	public String getRemark() 
	{
		return remark;
	}
	public void setHandover(String handover) 
	{
		this.handover = handover;
	}

	public String getHandover() 
	{
		return handover;
	}
	public void setQuit(String quit) 
	{
		this.quit = quit;
	}

	public String getQuit() 
	{
		return quit;
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
            .append("id", getId())
            .append("name", getName())
            .append("personCharge", getPersonCharge())
            .append("inTime", getInTime())
            .append("regularTime", getRegularTime())
            .append("contractEndTime", getContractEndTime())
            .append("idCard", getIdCard())
            .append("birthDate", getBirthDate())
            .append("age", getAge())
            .append("phone", getPhone())
            .append("email", getEmail())
            .append("qq", getQq())
            .append("sex", getSex())
            .append("marryInfo", getMarryInfo())
            .append("addr", getAddr())
            .append("edu", getEdu())
            .append("major", getMajor())
            .append("school", getSchool())
            .append("proId", getProId())
            .append("post", getPost())
            .append("salary", getSalary())
            .append("bankCardNo", getBankCardNo())
            .append("connectId", getConnectId())
            .append("type", getType())
            .append("status", getStatus())
            .append("remark", getRemark())
            .append("handover", getHandover())
            .append("quit", getQuit())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
