package com.dataprovider;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener extends UsingDataProvdier implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) {
		String exp = "Please enter a valid pincode";

		System.out.println("excutiing listener");
		System.out.println("hiii");
		UsingDataProvdier u = new UsingDataProvdier();
		Alert al = u.d.switchTo().alert();
		String popsmsg = al.getText();

		Assert.assertEquals(popsmsg, exp);

	}

}
