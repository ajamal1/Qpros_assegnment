package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class FindOwnersPage {

    private static final By FIND_OWNERS_LINK = By.className("glyphicon-search");
    private static final By FIND_OWNERS_BUTTON = By.xpath(".//button[contains(. ,'Find')]");
    private static final By ADD_OWNER_BUTTON = By.xpath(".//a[.= 'Add Owner']");
    private static final By OWNERS_LIST = By.tagName("tr");
    private static final By LAST_NAME_FIELD = By.id("lastName");

    private static final By FIRST_AND_LAST_NAME = By.xpath("//table/tbody/tr[1]/td");
    private static final By ADDRESS = By.xpath("//table/tbody/tr[2]/td");
    private static final By CITY = By.xpath("//table/tbody/tr[3]/td");
    private static final By TELEPHONE = By.xpath("//table/tbody/tr[4]/td");
    private static final By PET_NAME = By.xpath("//table[2]/tbody/tr/td/dl/dd");
    private static final By BIRTH_DATE = By.xpath("//table[2]/tbody/tr/td/dl/dd[2]");
    private static final By TYPE = By.xpath("//table[2]/tbody/tr/td/dl/dd[3]");



    public WebDriver driver;
    private pages.AddOwner AddOwner;

    public FindOwnersPage(WebDriver driver){
        this.driver = driver;
    }

    public FindOwnersPage openFindOwnerPage(){
        driver.findElement(FIND_OWNERS_LINK).click();
        return this;
    }

    public FindOwnersPage findOwner(){
        driver.findElement(FIND_OWNERS_BUTTON).click();
        return this;
    }

    public FindOwnersPage findOwner(String ownerLastName){
        driver.findElement(LAST_NAME_FIELD).sendKeys(ownerLastName);
        driver.findElement(FIND_OWNERS_BUTTON).click();
        return this;
    }


    public FindOwnersPage checkFirstName(String firstName){
        Assert.assertTrue(driver.findElement(FIRST_AND_LAST_NAME).getText().contains(firstName), "First Name is not correct");
        return this;
    }


    public FindOwnersPage checkLastName(String lastName){
        Assert.assertTrue(driver.findElement(FIRST_AND_LAST_NAME).getText().contains(lastName), "Last Name is not correct");
        return this;
    }

    public FindOwnersPage checkAddress(String address){
        Assert.assertTrue(driver.findElement(ADDRESS).getText().contains(address), "Address is not correct");
        return this;
    }

    public FindOwnersPage checkCity(String city){
        Assert.assertTrue(driver.findElement(CITY).getText().contains(city), "City is not correct");
        return this;
    }

    public FindOwnersPage checkTelephone(String telephone){
        Assert.assertTrue(driver.findElement(TELEPHONE).getText().contains(telephone) , "Telephone number is not correct");
        return this;
    }

    public FindOwnersPage checkPetName(String petName){
        Assert.assertTrue(driver.findElement(PET_NAME).getText().contains(petName), "Pet name is not correct");
        return this;
    }

    public FindOwnersPage checkBirthDate(String birthDate){
        Assert.assertTrue(driver.findElement(BIRTH_DATE).getText().contains(birthDate), "Birth Date is not matching the expected one");
        return this;
    }

    public FindOwnersPage checkType(String type){
        Assert.assertTrue(driver.findElement(TYPE).getText().contains(type), "Pet type is not matching the expected type");
        return this;
    }



    public void AddNewOwner(){
        driver.findElement(ADD_OWNER_BUTTON).click();
    }

    public void printAllOwners(){
        int listSize= driver.findElements(OWNERS_LIST).size();
        List<String> ownersList = new ArrayList<>();
        for (int i = 1; i < listSize ;i++){
            ownersList.add(driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText());
        }
        System.out.println(ownersList);
    }


}
