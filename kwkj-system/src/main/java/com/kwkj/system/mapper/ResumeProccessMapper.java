package com.kwkj.system.mapper;

import com.kwkj.system.domain.ResumeProccess;
import java.util.List;	

/**
 * 简历面试流程 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface ResumeProccessMapper 
{
	/**
     * 查询简历面试流程信息
     * 
     * @param proccessId 简历面试流程ID
     * @return 简历面试流程信息
     */
	public ResumeProccess selectResumeProccessById(Integer proccessId);
	
	/**
     * 查询简历面试流程列表
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 简历面试流程集合
     */
	public List<ResumeProccess> selectResumeProccessList(ResumeProccess resumeProccess);
	
	/**
     * 新增简历面试流程
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 结果
     */
	public int insertResumeProccess(ResumeProccess resumeProccess);
	
	/**
     * 修改简历面试流程
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 结果
     */
	public int updateResumeProccess(ResumeProccess resumeProccess);
	
	/**
     * 删除简历面试流程
     * 
     * @param proccessId 简历面试流程ID
     * @return 结果
     */
	public int deleteResumeProccessById(Integer proccessId);
	
	/**
     * 批量删除简历面试流程
     * 
     * @param proccessIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteResumeProccessByIds(String[] proccessIds);
	
}