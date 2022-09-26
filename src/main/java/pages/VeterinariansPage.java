package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.*;

public class VeterinariansPage {
    private static final By VETERINARIANS = By.className("glyphicon-th-list");

    private static final By VETERINARIANS_LIST = By.tagName("tr");

    private WebDriver driver;

    public VeterinariansPage(WebDriver driver) {
        this.driver = driver;
    }

    public VeterinariansPage openVeterianariansPage(){
        driver.findElement(VETERINARIANS).click();
        return this;
    }

    public void printAllVeterinarians(){
        int listSize= driver.findElements(VETERINARIANS_LIST).size();
        List<String> veterinariansList = new ArrayList<>();
        for (int i = 1; i < listSize ;i++){
            veterinariansList.add(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
        }
        System.out.println(veterinariansList);
    }
}
