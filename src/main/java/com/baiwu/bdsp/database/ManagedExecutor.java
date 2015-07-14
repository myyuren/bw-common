/**
 * 
 */
package com.baiwu.bdsp.database;

/**
 * 
 * SQL执行接口
 *
 * Create on 2013-10-24 下午4:18:23
 *
 * @author chenbaoyu<myyuren@163.com>. 
 * 
 */
public interface ManagedExecutor {

	/**
	 * 释放连接
	 */
	public void release();

	/**
	 * 返回托管对象ID
	 * @return
	 */
	public String getId();

	/**
	 * 运行时长
	 * @return
	 */
	public long runningTime();

}
