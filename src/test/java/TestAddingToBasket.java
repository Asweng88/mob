import forms.*;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class TestAddingToBasket {

    AndroidDriver driver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    String nameGoods;
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
        nameGoods = veryProfitable.getNameFirstGoods();
        veryProfitable.clickButtonAddFirstGoods();

    }


    @Test
    public void addingToBasket() {

        MainForm mainForm = new MainForm(driver);
        mainForm.clickBasket();

        FormBasket formBasket = new FormBasket(driver);
        String basketNameGoods = formBasket.getNameFirstGoods();
        assertEquals(nameGoods,basketNameGoods);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
