package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.example.pages.LoginPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class Main {
    static WebDriver driver;

    public static void main(String[] args) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://platform.impetusz0.de/auth/login");
        LoginPage loginPage = new LoginPage(driver);
        TakesScreenshot takesScreenshot =(TakesScreenshot) driver;
        File src = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File dest = new File("C:\\ScreenshotTest\\screenshot.png");
        FileUtils.copyFile(src,dest);

        loginPage.setUserNameField("coe1@gofynd.com");
        loginPage.setPasswordField("SecretSauce@2389BC!");
        loginPage.clickOnLoginButton();
    }
}