/**
 * 
 */
package com.baiwu.bdsp.database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * 
 * 释放数据库资源
 *
 * Create on 2013-10-21 下午7:26:09
 *
 * @author chenbaoyu<myyuren@163.com>. 
 * 
 */
public abstract class ReleaseResource {

	/**
	 * 资源关闭
	 * 
	 * @param o
	 */
	protected void attemptClose(ResultSet o) {
		try {
			if (o != null)
				o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 资源关闭
	 * 
	 * @param o
	 */
	protected void attemptClose(Statement o) {
		try {
			if (o != null)
				o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 资源关闭
	 * 
	 * @param o
	 */
	protected void attemptClose(Connection o) {
		try {
			if (o != null)
				o.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
