package me.hzhou.paypal.model;

import java.io.IOException;
import java.io.InputStream;


import org.apache.commons.io.IOUtils;

import com.jfinal.plugin.activerecord.Model;
import com.paypal.api.payments.*;

@SuppressWarnings("serial")
public class PayPal extends Model<PayPal> {
	
	public final static PayPal dao = new PayPal();
	
	// Wrap for bill Address
	public Address billAddress(String line1, String line2, String city, String countryCode, String state, String zipCode) {
		Address billingAddress = new Address();
		billingAddress.setCity(city);
		billingAddress.setCountryCode(countryCode);
		billingAddress.setLine1(line1);
		billingAddress.setLine2(line2);
		billingAddress.setPostalCode(zipCode);
		billingAddress.setState(state);
		
		return billingAddress;
	}
	
	public Address billAddress(String line1, String city, String countryCode, String state, String zipCode) {
		return billAddress(line1, "", city, countryCode, state, zipCode);
	}
	
	// Wrap for Credit Card
	public CreditCard creditCard(Address billingAddress, String number, String type, 
			int expireMonth, int expireYear, String cvv2, String firstName, String LastName) {
		
		CreditCard creditCard = new CreditCard(number, type, expireMonth, expireYear);
		creditCard.setBillingAddress(billingAddress);
		creditCard.setCvv2(cvv2);
		creditCard.setFirstName(firstName);
		creditCard.setLastName(LastName);
		
		return creditCard;
	}
	
	public Details details(Object subTotal) {
		Details details = new Details();
		details.setShipping("0");
		details.setSubtotal(String.valueOf(subTotal));
		details.setTax("");
		
		return details;
	}
	
	public void readJson() {
		InputStream in = dao.getClass().getResourceAsStream("/config.json");
		try {
			System.out.println( IOUtils.toString(in));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println( "null");
		}
	}
}
