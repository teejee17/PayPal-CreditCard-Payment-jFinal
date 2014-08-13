package me.hzhou.paypal.test;

import me.hzhou.paypal.config.MyConfig;
import me.hzhou.paypal.config.SystemVariables;

import org.junit.Test;

import com.jfinal.ext.test.ControllerTestCase;


public class UnitTest extends ControllerTestCase<MyConfig> {

	@Test
	public void test() {
		System.out.println(SystemVariables.get("taxRate"));
	}
	
}
