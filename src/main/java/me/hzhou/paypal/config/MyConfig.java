package me.hzhou.paypal.config;

import me.hzhou.paypal.controller.*;

import com.jfinal.config.*;
import com.jfinal.core.JFinal;


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

	public static void main(String[] args) {
		JFinal.start("src/main/webapp", 80, "/", 5);
	}
}
