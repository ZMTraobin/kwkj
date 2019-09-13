package com.kwkj.system.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kwkj.system.domain.ResumeProccess;
import com.kwkj.system.mapper.ResumeProccessMapper;
import com.kwkj.system.service.IResumeProccessService;

/**
 * 简历面试流程 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class ResumeProccessServiceImpl implements IResumeProccessService 
{
	@Autowired
	private ResumeProccessMapper resumeProccessMapper;

	/**
     * 查询简历面试流程信息
     * 
     * @param proccessId 简历面试流程ID
     * @return 简历面试流程信息
     */
    @Override
	public ResumeProccess selectResumeProccessById(Integer proccessId)
	{
	    return resumeProccessMapper.selectResumeProccessById(proccessId);
	}
	
	/**
     * 查询简历面试流程列表
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 简历面试流程集合
     */
	@Override
	public List<ResumeProccess> selectResumeProccessList(ResumeProccess resumeProccess)
	{
	    return resumeProccessMapper.selectResumeProccessList(resumeProccess);
	}
	
    /**
     * 新增简历面试流程
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 结果
     */
	@Override
	public int insertResumeProccess(ResumeProccess resumeProccess)
	{
	    return resumeProccessMapper.insertResumeProccess(resumeProccess);
	}
	
	/**
     * 修改简历面试流程
     * 
     * @param resumeProccess 简历面试流程信息
     * @return 结果
     */
	@Override
	public int updateResumeProccess(ResumeProccess resumeProccess)
	{
	    return resumeProccessMapper.updateResumeProccess(resumeProccess);
	}

	/**
     * 删除简历面试流程对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteResumeProccessByIds(String ids)
	{
		String[] ids1 = ids.split( "," );
		return resumeProccessMapper.deleteResumeProccessByIds(ids1);
	}
	
	
	
	
	
	
	
}
