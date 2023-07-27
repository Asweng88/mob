package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class FormBasket {

    private AndroidDriver androidDriver;

    public FormBasket(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By nameFirstGoods = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[3]/android.widget.TextView");

    private static By buttonRemovingFirstGoods = By.id("ru.ozon.app.android:id/removeButton");

    private static By textGoodsEmpty = By.id("ru.ozon.app.android:id/emptyStateTitleTv");

    public String getNameFirstGoods() {
        String result = androidDriver.findElement(nameFirstGoods).getText();
        return result;
    }

    public void clickButtonRemovingFirstGoods() {
        androidDriver.findElement(buttonRemovingFirstGoods).click();
    }

    public Boolean removingFirstGoodsIsDisplayed() {
        Boolean result = androidDriver.findElement(buttonRemovingFirstGoods).isDisplayed();
        return result;
    }

    public Boolean textGoodsEmptyIsDisplayed() {
        Boolean result = androidDriver.findElement(textGoodsEmpty).isDisplayed();
        return result;
    }

}
