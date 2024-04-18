package DemoPack;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;

import io.appium.java_client.android.AndroidDriver;

public class A1AppiumBasicsApp1 {
	static AndroidDriver driver;
	
	public void testBasicFlow() {
		driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='App']")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@resource-id='android:id/text1' and @text='Alarm Service']")).click();
	//	driver.findElement(By.xpath("//android.widget.TextView[@cintent-desc='Animation']")).click();
		//android.widget.TextView[@resource-id='android:id/text1' and @text='Text']
		
		driver.navigate().back();
		//driver.navigate().back();
	//	driver.navigate().back();
	}
	public static void main(String[] args) throws MalformedURLException {
		A0UIAutomator2Options option=new A0UIAutomator2Options();
			
		driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"), option.getApiDemoApkOptions());
		A1AppiumBasicsApp1 obj=new A1AppiumBasicsApp1();
		obj.testBasicFlow();
		System.out.println("==============Run Finished===================");
	}
}
