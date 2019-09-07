package com.kwkj.system.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.ProjectMapper;
import com.kwkj.system.domain.Project;
import com.kwkj.system.service.IProjectService;

/**
 * 项目 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class ProjectServiceImpl implements IProjectService 
{
	@Autowired
	private ProjectMapper projectMapper;

	/**
     * 查询项目信息
     * 
     * @param proId 项目ID
     * @return 项目信息
     */
    @Override
	public Project selectProjectById(Integer proId)
	{
	    return projectMapper.selectProjectById(proId);
	}
	
	/**
     * 查询项目列表
     * 
     * @param project 项目信息
     * @return 项目集合
     */
	@Override
	public List<Project> selectProjectList(Project project)
	{
	    return projectMapper.selectProjectList(project);
	}
	
    /**
     * 新增项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	@Override
	public int insertProject(Project project)
	{
	    return projectMapper.insertProject(project);
	}
	
	/**
     * 修改项目
     * 
     * @param project 项目信息
     * @return 结果
     */
	@Override
	public int updateProject(Project project)
	{
	    return projectMapper.updateProject(project);
	}

	/**
     * 删除项目对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteProjectByIds(String[] ids)
	{   
		return projectMapper.deleteProjectByIds(ids);
	}
	
}
