package tests.successTests;

import org.testng.annotations.Test;
import pages.LoginPage;
import tests.BaseTest;

public class SuccessTests extends BaseTest {



    @Test
    public void testStandardUser() {

        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");


    }

    @Test()
    public void testProblemUser() {

        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("problem_user", "secret_sauce");


    }

    @Test
    public void testPerformanceUser() {

        driver.get("https://www.saucedemo.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("performance_glitch_user", "secret_sauce");


    }
}
