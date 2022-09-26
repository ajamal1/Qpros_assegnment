package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.FindOwnersPage;

public class printAllOwners extends BaseTests {

    @Test
    public void main(){
        FindOwnersPage findOwnersPage = new FindOwnersPage(driver);

        findOwnersPage.openFindOwnerPage()
                .findOwner()
                .printAllOwners();

    }
}
