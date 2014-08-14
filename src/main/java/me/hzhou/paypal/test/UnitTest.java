package me.hzhou.paypal.test;

import me.hzhou.paypal.config.MyConfig;
import me.hzhou.paypal.model.PayPal;
import me.hzhou.paypal.util.MoneyFormat;

import org.junit.Ignore;
import org.junit.Test;

import com.jfinal.ext.test.ControllerTestCase;
import com.paypal.api.payments.Payment;


public class UnitTest extends ControllerTestCase<MyConfig> {

	@Ignore
	public void test() {
		System.out.println(MoneyFormat.get(1.232, 1));
	}
	
	@Test
	public void paymentTest() {
		PayPal paypal = new PayPal();
		paypal.setBillAddress("7 WEST ST", "MALDEN", "US", "MA", "02148");
		
		// Never mind, this is a fake information about my card
		// sorry
		paypal.setCreditCard("4117704033495630", "visa", 11, 2017, "855", "Hao", "Zhou");
		System.out.println(paypal.getCreditCard().toJSON());
		paypal.setAmount(0.50);
		Payment payment = paypal.pay();
		System.out.println(payment.toJSON());
		
	}
	
}
