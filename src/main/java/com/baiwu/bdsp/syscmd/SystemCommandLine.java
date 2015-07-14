/**
 * 
 */
package com.baiwu.bdsp.syscmd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 
 * 系统命令行，命令执行器
 * 
 * Create on May 5, 2014 1:46:53 PM
 * 
 * @author chenbaoyu<myyuren@163.com>.
 * 
 */
public class SystemCommandLine {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	/**
	 * 执行命令行命令
	 * 
	 * @param cmd
	 * @param isWait
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public CommandResult exec(boolean isWait, String[] args) throws IOException, InterruptedException {
		CommandResult cr = new CommandResult();
		if (!isWait) {// 非阻塞的方式执行命令
			Runtime rt = Runtime.getRuntime();
			rt.exec(args);
			cr.setExitCode(0);// 默认为success
			cr.setEcho("sucess");
			return cr;
		} else {
			Runtime rt = Runtime.getRuntime();
			Process proc = rt.exec(args);
			String rs = null;
			if ((rs = console(proc.getInputStream())) != null && !rs.equals("")) {
				logger.info(rs);
			} else {
				logger.error(console(proc.getErrorStream()));
			}
			logger.debug("Process exitValue: " + proc.waitFor());
			cr.setExitCode(proc.exitValue());
			cr.setEcho(rs);
			return cr;
		}
	}

	/**
	 * 执行命令行命令
	 * 
	 * @param cmd
	 * @return
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public CommandResult exec(String[] args) throws IOException, InterruptedException {
		return exec(true, args);
	}

	/**
	 * 获取回显
	 * 
	 * @param input
	 * @return
	 * @throws IOException
	 */
	private String console(InputStream input) throws IOException {
		InputStreamReader isr = new InputStreamReader(input);
		BufferedReader br = new BufferedReader(isr);
		String line = null;
		StringBuffer sb = new StringBuffer();
		while ((line = br.readLine()) != null)
			sb.append(line + "\n");
		input.close();
		return sb.toString();
	}
}
