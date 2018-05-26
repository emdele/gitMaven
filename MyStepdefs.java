package Steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyStepdefs {
             WebDriver driver = null;



    @Given("^I am on the home page with the url$")
    public void iAmOnTheHomePageWithTheUrl() throws Throwable {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ayodeji\\Desktop\\chromedriver.exe\\");
         driver = new ChromeDriver();
        driver.get("https://www.florida4less111.co.uk/");

    }

    @When("^I click the link$")
    public void iClickTheLink() throws Throwable {

        driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[1]/a"));

    }

    @And("^Another links$")
    public void anotherLinks() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"layout\"]/div[1]/header/div[4]/nav/ul/li[2]/a"));


    }

    @Then("^I should be on the page$")
    public void iShouldBeOnThePage() throws Throwable {
        driver.close();

    }



}
