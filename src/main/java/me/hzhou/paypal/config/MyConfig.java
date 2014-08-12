package me.hzhou.paypal.config;


import java.io.InputStream;

import me.hzhou.paypal.controller.*;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;
import com.paypal.core.rest.PayPalRESTException;
import com.paypal.core.rest.PayPalResource;


public class MyConfig  extends JFinalConfig{

	@Override
	public void configConstant(Constants me) {
		me.setDevMode(true);
	}
	
	@Override
	public void configRoute(Routes me) {
		me.add("/", Crtl.class);
		
	}

	@Override
	public void configHandler(Handlers me) { }

	@Override
	public void configInterceptor(Interceptors me) { }

	@Override
	public void configPlugin(Plugins me) { }
	
	/**
	 * Call back after JFinal start
	 * 
	 * Load Configuration
	 * Load SDK configuration for the resource.  
	 */
	public void afterJFinalStart(){
		InputStream is = MyConfig.class.getResourceAsStream("/sdk_config.properties");
		try {
			PayPalResource.initConfig(is);
		} catch (PayPalRESTException e) {
			
		}

	}

	/**
	 * Call back before JFinal stop
	 * 
	 */
	public void beforeJFinalStop(){}
	
	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/", 5);
	}
}
