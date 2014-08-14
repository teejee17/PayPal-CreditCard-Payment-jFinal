package me.hzhou.paypal.test;

import me.hzhou.paypal.config.MyConfig;
import me.hzhou.paypal.config.SystemVariables;
import me.hzhou.paypal.util.MoneyFormat;

import org.junit.Test;

import com.jfinal.ext.test.ControllerTestCase;


public class UnitTest extends ControllerTestCase<MyConfig> {

	@Test
	public void test() {
		System.out.println(MoneyFormat.get(1.232, 1));
	}
	
}
