package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddOwner extends FindOwnersPage{

    private static final By FIRST_NAME_FIELD= By.id("firstName");
    private static final By LAST_NAME_FIELD= By.id("lastName");
    private static final By ADDRESS_FIELD= By.id("address");
    private static final By CITY_FIELD= By.id("city");
    private static final By TELEPHONE_FIELD= By.id("telephone");

    private static final By ADD_OWNER_BUTTON = By.xpath(".//button[contains(. ,'Add Owner')]");

    private static final By ADD_NEW_PET_BUTTON = By.xpath(".//a[contains(., 'New Pet')]");

    private static final By BIRTH_DATE_FIELD = By.id("birthDate");
    private static final By PET_NAME_FIELD= By.id("name");
    private static final By TYPE_FIELD= By.id("type");
    private static final By ADD_PET_BUTTON = By.xpath(".//button[contains(. ,'Add Pet')]");



    public AddOwner(WebDriver driver){
        super(driver);
    }

    public AddOwner fillOwnerInfo(String firstName, String lastName, String address, String city, String telephone){
        driver.findElement(FIRST_NAME_FIELD).sendKeys(firstName);
        driver.findElement(LAST_NAME_FIELD).sendKeys(lastName);
        driver.findElement(ADDRESS_FIELD).sendKeys(address);
        driver.findElement(CITY_FIELD).sendKeys(city);
        driver.findElement(TELEPHONE_FIELD).sendKeys(telephone);
        return this;
    }

    public AddOwner clickAddOwner(){
        driver.findElement(ADD_OWNER_BUTTON).click();
        return this;
    }

    public AddOwner addNewPet(String name, String date , String type){
        driver.findElement(ADD_NEW_PET_BUTTON).click();
        driver.findElement(PET_NAME_FIELD).sendKeys(name);
        driver.findElement(BIRTH_DATE_FIELD).sendKeys(date);
        driver.findElement(TYPE_FIELD).findElement(By.xpath("//*[@id='type']/option[contains(.,'"+type+"')]")).click();
        driver.findElement(ADD_PET_BUTTON).click();
        return this;
    }


}

