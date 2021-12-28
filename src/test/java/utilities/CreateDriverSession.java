package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static void  androidDriverSession(String deviceName, String udId, String appPath) throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
        caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        caps.setCapability(MobileCapabilityType.UDID, udId);
        //caps.setCapability(MobileCapabilityType.APP, appPath);
        caps.setCapability("appPackage", "com.google.android.apps.nexuslauncher");
        caps.setCapability("appActivity", "com.google.android.apps.nexuslauncher.NexusLauncherActivity");
        //caps.setCapability("avd", "Pixel 5");
        //caps.setCapability("avdLaunchTimeout", 180000);

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AppiumDriver driver = new AppiumDriver(url, caps);

    }
}
