package democart;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import org.testng.annotations.BeforeClass;


public class Testcase extends Library{
	@BeforeClass

	public void start() throws IOException {
		launchApplication();
     	openWebsite();

	}

	@Test
	public void testing() throws Throwable {
		Democart demo = new Democart(driver);
		demo.clickMyAccount();
		demo.loginButn();
		demo.setEmail();
		demo.setPsw();

		demo.clickLogin();
		demo.clickMyAccount();
		demo.clickLogout();

	}

	@AfterClass
	public void closeapp() {
		quit();
	}


}
