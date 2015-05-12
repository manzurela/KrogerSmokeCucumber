package com.kroger;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by Manzur on 5/12/2015.
 */
public class StepDefinitions {
        WebDriver driver;

    @Given("^I am on kroger homepage$")
    public void i_am_on_kroger_homepage() {
        driver =new FirefoxDriver();
       driver.get("http://kroger.com");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @When("^I click on sign in link$")
    public void i_click_on_sign_in_link() {
        driver.findElement(By.xpath("//*[@id='signIn']")).click();

    }

    @Then("^I navigate to sign in page$")
    public void i_navigate_to_sign_in_page() {
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='signInContainer']/div/div/div[2]/h1")).isDisplayed());
    }

    @When("^I enter valid user name, password and click on sign in button$")
    public void i_enter_valid_user_name_password_and_click_on_sign_in_button()  {
        driver.findElement(By.xpath("//*[@id='signin-drawer-email-address']")).sendKeys("qtppnt@gmail.com");
        driver.findElement(By.xpath("//*[@id='signin-drawer-password']")).sendKeys("shibli1");
        driver.findElement(By.xpath("//*[@id='signin-drawer-submit']")).click();
    }

    @Then("^I successfully enter into my account$")
    public void i_successfully_enter_into_my_account(){
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id='signInContainer']/div/a[2]")).isDisplayed());

    }



}
