package pages;

import base.BaseTests;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private static final By IMAGE = By.className("img-responsive");
    private static final By FIND_OWNERS_LINK = By.className("glyphicon-search");

    private WebDriver driver;
    public HomePage(WebDriver driver){
        this.driver = driver;

    }
    public HomePage verifyHomePageImage(String src){
        String imgSrc = driver.findElement(IMAGE).getAttribute("src");
        Assert.assertTrue(imgSrc.contains(src), "Image is not exist or it's changed");
        return this;
    }
}
