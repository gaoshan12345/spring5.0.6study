/**
 * 元年软件
 * @author 王亚平
 * @date 2018年7月18日 下午2:08:47
 * @version V1.0
 */
package com.epoch.listener;



import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/** 
 * 监听每一次请求 
 * @author 王亚平
 * @date 2018年7月18日 下午2:08:47 
 *  
 */
public class RequestListener implements ServletRequestListener{
	protected final Log logger = LogFactory.getLog(getClass());
	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		logger.info("Thread id = " + Thread.currentThread().getId() + ",name = " + Thread.currentThread().getName() + ",requestDestroyed");
	}

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		//Do Nothing
		logger.info("Thread id = " + Thread.currentThread().getId() + ",name = " + Thread.currentThread().getName() + ",requestInitialized");
	}

}
