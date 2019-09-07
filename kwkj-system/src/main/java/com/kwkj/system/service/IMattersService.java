package com.kwkj.system.service;

import com.kwkj.system.domain.Matters;
import java.util.List;

/**
 * 在职人员 服务层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface IMattersService 
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
     * 删除在职人员信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMattersByIds(String ids);
	
}
