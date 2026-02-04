package ie.code.testing.Utils;

import org.openqa.selenium.WebDriver;

public class WindowsUtils {

    public static WebDriver getNewWindowHandle(WebDriver chromeDriver){
        String parentWindow = chromeDriver.getWindowHandle();
        for (String windowHandle : chromeDriver.getWindowHandles()
        ) {
            if (!windowHandle.equals(parentWindow)){
                chromeDriver.switchTo().window(windowHandle);
                break;
            }
        }
        return chromeDriver;
    }
}
