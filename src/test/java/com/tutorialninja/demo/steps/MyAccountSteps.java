package com.tutorialninja.demo.steps;

import com.tutorialninja.demo.pages.AccountLoginPage;
import com.tutorialninja.demo.pages.AccountRegisterPage;
import com.tutorialninja.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyAccountSteps {
    @And("I click on My Account link")
    public void iClickOnMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }
    @And("call the method selectMyAccountOptions method with parameter {string}")
    public void callTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0) {
        new HomePage().selectMyAccountOptions("Register");
    }

    @And("I enter First Name and I enter Last Name and I enter Email and I enter Telephone and I enter Password and I " +
            "enter Password Confirm and I select Subscribe Yes radio button and I click on Privacy Policy check box and I click on Continue button")
    public void iEnterFirstNameAndIEnterLastNameAndIEnterEmailAndIEnterTelephoneAndIEnterPasswordAndIEnterPasswordConfirmAndISelectSubscribeYesRadioButtonAndIClickOnPrivacyPolicyCheckBoxAndIClickOnContinueButton() {
        new AccountRegisterPage().enterFirstName("Smart");
        new AccountRegisterPage().enterLastName("Tester");
        new AccountRegisterPage().enterEmail("smarttester@gmail.com");
        new AccountRegisterPage().enterTelephone("07778889999");
        new AccountRegisterPage().enterPassword("phronimos");
        new AccountRegisterPage().enterConfirmPassword("phronimos");
        new AccountRegisterPage().selectSubscription("Yes");
        new AccountRegisterPage().clickOnPrivacyPolicyCheckBox();
        new AccountRegisterPage().clickOnContinueButton();
    }
    @Then("I can see the message {string}")
    public void iCanSeeTheMessageYourAccountHasBeenCreated() {
        Assert.assertEquals(new AccountRegisterPage().getRegisterAccountText(), "Your Account Has Been Created!", "Error message");
    }

    @And("I click on Continue button")
    public void iClickOnContinueButton() {
        new AccountRegisterPage().clickOnContinueButton();

    }
    @And("I click on my Accounts Link.")
    public void iClickOnMyAccountsLink() {
        new HomePage().clickOnMyQAccountTab();

    }

    @And("I call the method “selectMyAccountOptions” method and pass the parameter “Logout”")
    public void iCallTheMethodSelectMyAccountOptionsMethodAndPassTheParameterLogout() {
        new HomePage().selectMyAccountOptions("Logout");
    }

    @And("I click on the continue button")
    public void iClickOnTheContinueButton() {
        new AccountLoginPage().clickOnLoginButton();

    }

    @And("I can call the method selectMyAccountOptions method with the parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithTheParameter(String arg0) {
        new HomePage().selectMyAccountOptions("Login");
    }

    @And("I enter Email address and and I enter Password and I click on Login button")
    public void iEnterEmailAddressAndAndIEnterPasswordAndIClickOnLoginButton() {
        new AccountLoginPage().enterEmailAddress("Smart007@yahoo.co.in");
        new AccountLoginPage().enterPassword("Tester002!");
    }
    @Then("I can see the text “My Account”")
    public void iCanSeeTheTextMyAccount() {
        Assert.assertEquals(new AccountLoginPage().getNewCustomerText(), "My Account", "Error message");
    }

    @And("I click on the My Account Link.")
    public void iClickOnTheMyAccountLink() {
        new HomePage().clickOnMyQAccountTab();
    }

    @Then("I can see text “Account Logout”")
    public void iCanSeeTextAccountLogout() {
        Assert.assertEquals(new AccountLoginPage().getNewCustomerText(), "Account Logout", "Error Message");
    }

    @And("I call the method selectMyAccountOptions method with parameter {string}")
    public void iCallTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0) {
    }

    @And("I can call the method selectMyAccountOptions method with parameter {string}")
    public void iCanCallTheMethodSelectMyAccountOptionsMethodWithParameter(String arg0) {
    }
}
