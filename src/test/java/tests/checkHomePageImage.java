package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.HomePage;

public class checkHomePageImage extends BaseTests {

    private static String imageSrc = "/resources/images/pets.png";

    @Test
    public void main(){
        HomePage homePage = new HomePage(driver);
        homePage.verifyHomePageImage(imageSrc);
    }
}
