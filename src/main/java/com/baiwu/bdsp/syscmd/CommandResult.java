/**
 * 
 */
package com.baiwu.bdsp.syscmd;

/**
 * 
 * 命令行执行返回值
 * 
 * Create on 2014-5-27 上午10:36:13
 * 
 * @author chenbaoyu<myyuren@163.com>.
 * 
 */
public class CommandResult {

	private int exitCode;

	private String echo;

	/**
	 * @return the exitCode
	 */
	public int getExitCode() {
		return exitCode;
	}

	/**
	 * @param exitCode
	 *            the exitCode to set
	 */
	public void setExitCode(int exitCode) {
		this.exitCode = exitCode;
	}

	/**
	 * @return the echo
	 */
	public String getEcho() {
		return echo;
	}

	/**
	 * @param echo
	 *            the echo to set
	 */
	public void setEcho(String echo) {
		this.echo = echo;
	}

}
