package tests;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.VeterinariansPage;

public class printAllVeterinarians extends BaseTests {

    @Test
    public void main(){
        VeterinariansPage veterinarians = new VeterinariansPage(driver);
        veterinarians.openVeterianariansPage()
                .printAllVeterinarians();

    }
}
