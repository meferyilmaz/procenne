package com.procenne.step_definitions;

import com.procenne.pages.ProcennePage;
import com.procenne.utilities.ConfigurationReader;
import com.procenne.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class ProcenneStepDefs {

    ProcennePage procennePage = new ProcennePage();

    Actions actions = new Actions(Driver.getDriver());


    @Given("User is on the procenne contact tab")
    public void user_is_on_the_procenne_contact_tab() {
        Driver.getDriver().get(ConfigurationReader.getProperty("procenne.url"));
    }
    @When("User fills in the blanks")
    public void user_fills_in_the_blanks() {
        procennePage.firstNameBox.sendKeys("Efe");
       procennePage.lastNameBox.sendKeys("Eryılmaz");
       procennePage.companyBox.sendKeys("Procenne");
      procennePage.emailBox.sendKeys("meferyilmaz@gmail.com");
        procennePage.messageBox.sendKeys("MERHABA TEST TAKIMI");
        procennePage.click1Box.submit();

    }
    @Then("User should see results")
    public void user_should_see_results() {

    }

}
