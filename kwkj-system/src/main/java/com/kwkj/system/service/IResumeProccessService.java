package com.kwkj.system.service;

import com.kwkj.system.domain.ResumeProccess;
import java.util.List;

/**
 * 简历面试流程 服务层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface IResumeProccessService 
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
     * 删除简历面试流程信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteResumeProccessByIds(String ids);
	
}
