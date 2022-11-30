package com.procenne.pages;

import com.procenne.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcennePage {

    public ProcennePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(name = "first_name")
    public WebElement firstNameBox;

    @FindBy(name = "last_name")
    public WebElement lastNameBox;

    @FindBy(name = "company")
    public WebElement companyBox;

    @FindBy(name = "email")
    public WebElement emailBox;

    @FindBy(name = "message")
    public WebElement messageBox;

    @FindBy(xpath = "//input[@type='checkbox']")
    public WebElement click1Box;

    @FindBy(className = "mr-2")
    public WebElement click2Box;

    @FindBy(linkText = "Okudum")
    public WebElement readBox;

}
