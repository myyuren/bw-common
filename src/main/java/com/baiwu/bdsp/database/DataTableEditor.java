/**
 * 
 */
package com.baiwu.bdsp.database;

import java.sql.Types;

/**
 * 
 * 结果集编辑器
 *
 * Create on 2013-10-22 下午4:56:53
 *
 * @author chenbaoyu<myyuren@163.com>. 
 * 
 */
public class DataTableEditor {

	/**
	 * 结果集对象
	 */
	private DataTable dt;

	public DataTableEditor(DataTable dt) {
		super();
		this.dt = dt;
	}

	/**
	 * 动态追加列
	 * @param lable
	 * @param typeName
	 * @param type
	 */
	public void appendCol(String lable) {
		dt.addColumn(lable, Types.VARCHAR, "varchar");
	}

	/**
	 * 添加行数据
	 * @param dr
	 */
	public void addRow(DataRow dr) {
		dt.addRow(dr);
	}
}
