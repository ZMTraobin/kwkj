package com.kwkj.system.mapper;

import com.kwkj.system.domain.Resume;
import java.util.List;	

/**
 * 简历 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface ResumeMapper 
{
	/**
     * 查询简历信息
     * 
     * @param resId 简历ID
     * @return 简历信息
     */
	public Resume selectResumeById(Integer resId);
	
	/**
     * 查询简历列表
     * 
     * @param resume 简历信息
     * @return 简历集合
     */
	public List<Resume> selectResumeList(Resume resume);
	
	/**
     * 新增简历
     * 
     * @param resume 简历信息
     * @return 结果
     */
	public int insertResume(Resume resume);
	
	/**
     * 修改简历
     * 
     * @param resume 简历信息
     * @return 结果
     */
	public int updateResume(Resume resume);
	
	/**
     * 删除简历
     * 
     * @param resId 简历ID
     * @return 结果
     */
	public int deleteResumeById(Integer resId);
	
	/**
     * 批量删除简历
     * 
     * @param resIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteResumeByIds(String[] resIds);
	
}