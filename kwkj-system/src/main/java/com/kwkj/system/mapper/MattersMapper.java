package com.kwkj.system.mapper;

import com.kwkj.system.domain.Matters;
import java.util.List;	

/**
 * 在职人员 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface MattersMapper 
{
	/**
     * 查询在职人员信息
     * 
     * @param id 在职人员ID
     * @return 在职人员信息
     */
	public Matters selectMattersById(Integer id);
	
	/**
     * 查询在职人员列表
     * 
     * @param matters 在职人员信息
     * @return 在职人员集合
     */
	public List<Matters> selectMattersList(Matters matters);
	
	/**
     * 新增在职人员
     * 
     * @param matters 在职人员信息
     * @return 结果
     */
	public int insertMatters(Matters matters);
	
	/**
     * 修改在职人员
     * 
     * @param matters 在职人员信息
     * @return 结果
     */
	public int updateMatters(Matters matters);
	
	/**
     * 删除在职人员
     * 
     * @param id 在职人员ID
     * @return 结果
     */
	public int deleteMattersById(Integer id);
	
	/**
     * 批量删除在职人员
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMattersByIds(String[] ids);
	
}