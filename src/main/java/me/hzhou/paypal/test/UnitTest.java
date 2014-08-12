package me.hzhou.paypal.test;

import me.hzhou.paypal.config.MyConfig;
import me.hzhou.paypal.util.GenerateAccessToken;

import org.junit.Test;

import com.jfinal.ext.test.ControllerTestCase;
import com.paypal.core.rest.PayPalRESTException;

public class UnitTest extends ControllerTestCase<MyConfig> {

	@Test
	public void test() throws PayPalRESTException {
		System.out.println("Token = " + GenerateAccessToken.getAccessToken());

	}
	
}
