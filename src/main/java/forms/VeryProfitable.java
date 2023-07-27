package forms;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class VeryProfitable {

    private AndroidDriver androidDriver;

    public VeryProfitable(AndroidDriver androidDriver) {
        this.androidDriver = androidDriver;
    }

    private static By nameFirstGoods = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[1]/android.widget.TextView");

    private static By buttonAddFirstGoods = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/androidx.recyclerview.widget.RecyclerView[1]/android.view.ViewGroup[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.view.View");

    public String getNameFirstGoods() {
        String result = androidDriver.findElement(nameFirstGoods).getText();
        return result;
    }
    public void clickButtonAddFirstGoods() {
        androidDriver.findElement(buttonAddFirstGoods).click();
    }

    public Boolean buttonAddFirstGoodsIsDisplayed() {
        Boolean result = androidDriver.findElement(buttonAddFirstGoods).isDisplayed(); return result;
    }


}
