package me.hzhou.paypal.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;

public class Test {
	public static void main(String[] args) {
		String str = "";
		InputStream in = new Test().getClass().getResourceAsStream("/config.json");
		try {
			str = IOUtils.toString(in);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println( "null");
		}
		
		JSONObject obj = new JSONObject(str);
		
		for(Object i : obj.keySet()) {
			System.out.println(i.toString());
		}
		
	}
}
