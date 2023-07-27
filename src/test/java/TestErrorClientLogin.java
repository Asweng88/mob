import forms.*;
import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.URL;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;



@RunWith(Parameterized.class)
public class TestErrorClientLogin {

    AndroidDriver driver = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    private final String phone;
    private final String error;

    public TestErrorClientLogin(String phone, String error) {
        this.phone = phone;
        this.error = error;
    }

    @Parameterized.Parameters
    public static Object[][] testErrorClientLogin() {
        //Сгенерируй тестовые данные
        return new Object[][]{
                {null, "Заполните телефон"},
                {"999999999", "Некорректный формат телефона"},
                {"0000000000", "Ошибка при вводе телефона"},
        };
    }

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

    }


    @Test
    public void removingToBasket() {

        MainForm mainForm = new MainForm(driver);
        mainForm.clickButtonLogin();

        FormLogin formLogin = new FormLogin(driver);
        formLogin.setInputPhone(phone);
        formLogin.clickButtonIn();
        assertEquals(error, formLogin.getErrorText());

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
