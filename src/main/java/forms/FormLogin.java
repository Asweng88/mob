package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FormLogin {

    private AndroidDriver androidDriver;

    public FormLogin(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By inputPhone = By.id("ru.ozon.app.android:id/inputEditText");

    private static By buttonIn = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout");

    private static By errorText = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView");

    public void setInputPhone(String phone) {
        if (phone!=null) {
            androidDriver.findElement(inputPhone).sendKeys(phone);
        }

    }

    public void clickButtonIn() {
        androidDriver.findElement(buttonIn).click();
    }

    public Boolean errorTextIsDisplayed() {
        Boolean result = androidDriver.findElement(errorText).isDisplayed();
        return result;
    }

    public String getErrorText() {
        String result = androidDriver.findElement(errorText).getText();
        return result;
    }
}
