package com.skbr;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class CallbackWithInterface implements InitializingBean, DisposableBean{

	@Override
	public void destroy() throws Exception {
		System.out.println("Inside CallbackWithInterface.destroy");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Inside CallbackWithInterface.afterPropertiesSet");		
	}

}
