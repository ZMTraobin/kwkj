package com.kwkj.system.mapper;

import com.kwkj.system.domain.MattersQuit;
import java.util.List;	

/**
 * 离职人员交接 数据层
 * 
 * @author kwkj
 * @date 2019-08-20
 */
public interface MattersQuitMapper 
{
	/**
     * 查询离职人员交接信息
     * 
     * @param kwkjMattersQuitid 离职人员交接ID
     * @return 离职人员交接信息
     */
	public MattersQuit selectMattersQuitById(Integer kwkjMattersQuitid);
	
	/**
     * 查询离职人员交接列表
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 离职人员交接集合
     */
	public List<MattersQuit> selectMattersQuitList(MattersQuit mattersQuit);
	
	/**
     * 新增离职人员交接
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 结果
     */
	public int insertMattersQuit(MattersQuit mattersQuit);
	
	/**
     * 修改离职人员交接
     * 
     * @param mattersQuit 离职人员交接信息
     * @return 结果
     */
	public int updateMattersQuit(MattersQuit mattersQuit);
	
	/**
     * 删除离职人员交接
     * 
     * @param kwkjMattersQuitid 离职人员交接ID
     * @return 结果
     */
	public int deleteMattersQuitById(Integer kwkjMattersQuitid);
	
	/**
     * 批量删除离职人员交接
     * 
     * @param kwkjMattersQuitids 需要删除的数据ID
     * @return 结果
     */
	public int deleteMattersQuitByIds(String[] kwkjMattersQuitids);
	
}