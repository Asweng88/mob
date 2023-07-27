import forms.*;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class TestRemovingGoodsFromBasket {

    AndroidDriver driver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    @Before
    public void setUp() throws Exception {

        capabilities.setCapability("deviceName", "Pixel 6 API 33");
        capabilities.setCapability("app", "C:\\Users\\p_evg\\Downloads\\ozon-16-13-0.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        NotificationAccessForm notificationAccessForm = new NotificationAccessForm(driver);
        notificationAccessForm.clickRemindLater();
        MainForm mainForm = new MainForm(driver);
        mainForm.clickTouchOutside();
        mainForm.clickButtonVeryProfitable();
        VeryProfitable veryProfitable = new VeryProfitable(driver);
        veryProfitable.buttonAddFirstGoodsIsDisplayed();
        veryProfitable.clickButtonAddFirstGoods();

    }


    @Test
    public void removingToBasket() {

        MainForm mainForm = new MainForm(driver);
        mainForm.clickBasket();

        FormBasket formBasket = new FormBasket(driver);
        formBasket.removingFirstGoodsIsDisplayed();
        formBasket.clickButtonRemovingFirstGoods();

        ConfirmationRemovingGoods confirmationRemovingGoods = new ConfirmationRemovingGoods(driver);
        confirmationRemovingGoods.clickButtonRemoving();

        formBasket.textGoodsEmptyIsDisplayed();

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
