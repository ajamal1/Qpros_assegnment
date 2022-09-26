package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AddOwner;
import pages.FindOwnersPage;

import java.util.UUID;

public class addOwner extends BaseTests {
    private static final String FIRST_NAME = "Test123";
    private static final String LAST_NAME = UUID.randomUUID().toString().substring(0,6);
    private static final String ADDRESS = "Jordan st";
    private static final String CITY = "Amman";
    private static final String TELEPHONE = "0123456789";
    private static final String PET_NAME = "L1";
    private static final String BIRTH_DATE = "2020-08-11";
    private static final String TYPE = "cat";

    @Test
    public void main(){
        FindOwnersPage findOwnersPage = new FindOwnersPage(driver);
        AddOwner addOwner = new AddOwner(driver);
        findOwnersPage.openFindOwnerPage()
                .AddNewOwner();
        addOwner.fillOwnerInfo(FIRST_NAME, LAST_NAME, ADDRESS, CITY , TELEPHONE)
                .clickAddOwner()
                .addNewPet(PET_NAME , BIRTH_DATE, TYPE);
        findOwnersPage.openFindOwnerPage()
                .findOwner(LAST_NAME)
                .checkFirstName(FIRST_NAME)
                .checkLastName(LAST_NAME)
                .checkCity(CITY)
                .checkAddress(ADDRESS)
                .checkTelephone(TELEPHONE)
                .checkPetName(PET_NAME)
                .checkBirthDate(BIRTH_DATE)
                .checkType(TYPE);
    }

}
