package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FormAttention {

    private AndroidDriver androidDriver;

    public FormAttention(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By buttonGet = By.xpath("//android.widget.TextView[contains(@text,'Забрать')]");

    public void clickButtonGet() {
        androidDriver.findElement(buttonGet).click();
    }


}
