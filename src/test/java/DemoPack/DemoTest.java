package DemoPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.AutomationName;

public class DemoTest {
	 AndroidDriver driver;
	@Test
	  void androidLaunchTest() throws MalformedURLException, InterruptedException {
		 UiAutomator2Options options = new UiAutomator2Options();
//		    options.setPlatformName("Android"); //optional
//		    options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);//optional
		    options.setDeviceName("");
		    options.setApp(System.getProperty("user.dir") + "/Apps/Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");
		    options.setDeviceName("");
		    driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//    driver.findElement(AppiumBy.accessibilityId("open menu")).click();
//	    WebElement openMenu = driver.findElement(AppiumBy.accessibilityId("open menu"));
//	    tap(driver, openMenu);
//	    //Assertion
		   // driver.quit();
	  }
	@Test
	  void iosLaunchTest() throws MalformedURLException, InterruptedException {
	    XCUITestOptions options = new XCUITestOptions();
	    options.setDeviceName("iPhone 13");
	    options.setApp(System.getProperty("user.dir") + "/Apps/iOS-Simulator-MyRNDemoApp.1.3.0-162.zip");

	    IOSDriver driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
	    Thread.sleep(4000);
	    driver.findElements(By.name("store item text")).get(0).click();
	    
	  }
	
	
}
