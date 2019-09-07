package com.kwkj.system.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kwkj.system.mapper.ResumeMapper;
import com.kwkj.system.domain.Resume;
import com.kwkj.system.service.IResumeService;

/**
 * 简历 服务层实现
 * 
 * @author kwkj
 * @date 2019-08-20
 */
@Service
public class ResumeServiceImpl implements IResumeService 
{
	@Autowired
	private ResumeMapper resumeMapper;

	/**
     * 查询简历信息
     * 
     * @param resId 简历ID
     * @return 简历信息
     */
    @Override
	public Resume selectResumeById(Integer resId)
	{
	    return resumeMapper.selectResumeById(resId);
	}
	
	/**
     * 查询简历列表
     * 
     * @param resume 简历信息
     * @return 简历集合
     */
	@Override
	public List<Resume> selectResumeList(Resume resume)
	{
	    return resumeMapper.selectResumeList(resume);
	}
	
    /**
     * 新增简历
     * 
     * @param resume 简历信息
     * @return 结果
     */
	@Override
	public int insertResume(Resume resume)
	{
	    return resumeMapper.insertResume(resume);
	}
	
	/**
     * 修改简历
     * 
     * @param resume 简历信息
     * @return 结果
     */
	@Override
	public int updateResume(Resume resume)
	{
	    return resumeMapper.updateResume(resume);
	}

	/**
     * 删除简历对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteResumeByIds(String[] ids)
	{
		return resumeMapper.deleteResumeByIds(ids);
	}
	
}
