package com.TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	@Test(dataProvider="datause")
	public void testCase(String cname,String croll) {
		System.out.println(cname+"from"+croll);
		
	}
	@DataProvider(name="datause")
	public Object[][] getdata() {
		Object obj[][]= {{"ram","1"},
		{"roy","2"},{"yuvi","3"}};
		
		return obj;
	}

}
