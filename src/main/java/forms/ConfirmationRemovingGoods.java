package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ConfirmationRemovingGoods {

    private AndroidDriver androidDriver;

    public ConfirmationRemovingGoods(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By buttonRemoving = By.id("android:id/button1");

    private static By buttonCancel = By.id("android:id/button2");

    public void clickButtonRemoving() {
        androidDriver.findElement(buttonRemoving).click();
    }


}
