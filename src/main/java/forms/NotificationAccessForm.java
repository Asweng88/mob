package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationAccessForm {

    private AndroidDriver androidDriver;

    public NotificationAccessForm(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By remindLater = By.xpath("//android.widget.FrameLayout[2]");

    public void clickRemindLater() {
        androidDriver.findElement(remindLater).click();
    }


}
