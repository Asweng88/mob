package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class MainForm {

    private AndroidDriver androidDriver;

    public MainForm(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By basket = By.xpath("//android.view.ViewGroup[@content-desc=\"Корзина\"]");

    private static By touchOutside = By.id("ru.ozon.app.android:id/touch_outside");

    private static By buttonVeryProfitable = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");

    private static By buttonLogin = By.id("ru.ozon.app.android:id/bannerImageIv");

    public void clickBasket() {
        androidDriver.findElement(basket).click();
    }

    public void clickTouchOutside() {
        androidDriver.findElement(touchOutside).click();
    }

    public void clickButtonVeryProfitable() {
        androidDriver.findElement(buttonVeryProfitable).click();
    }

    public void clickButtonLogin() {
        androidDriver.findElement(buttonLogin).click();
    }


}
