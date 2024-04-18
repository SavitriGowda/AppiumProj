package DemoPack;

import java.io.File;

import io.appium.java_client.android.options.UiAutomator2Options;

public class A0UIAutomator2Options {
	public UiAutomator2Options getApiDemoApkOptions() {
		System.out.println("================Started: Api Demo Apk=================");
		ClassLoader classLoader=getClass().getClassLoader();
		File file=new File(classLoader.getResource("builds/ApiDemos-debug.apk").getFile());
		String apkPath=file.getAbsolutePath();
		
		UiAutomator2Options options=new UiAutomator2Options();
		options
			.setPlatformName("Andriod")
			.setPlatformVersion("5.1")
			.setAutomationName("UiAutomator2")
			.setDeviceName("emulator-5554")
			.setAppPackage("com.example.android.apis")
			.setAppActivity(".ApiDemos")
			.setApp(apkPath)
			.setNoReset(false);
		
		return options;
	}
}
