package StepDefinitions;

import PageFactory.SignUpForInsightsElements;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

public class SignUpStepDefinition {

    public static WebDriver driver;

    SignUpForInsightsElements signUpElements = new SignUpForInsightsElements();

    @Before
    public void setUp(){
        //Set properties
        String projectPath = System.getProperty("user.dir");
        System.out.println("Project path is :"+projectPath);
        System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/drivers/chromedriver.exe");

    }

    @Given("user navigates to the Investec website")
    public void user_navigates_to_the_Investec_website() throws InterruptedException{
        //Launch Browser
        driver = new ChromeDriver();

        //Maximise window and close driver in 10 seconds if there's an issue
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        //Navigate to the InvestTec Website
        System.out.println("Navigate to the Investec website");
        driver.navigate().to("https://www.investec.com");

        sleep(3000);

        //verify that the Investec logo is displayed on the homepage
        System.out.println("verify that the Investec logo is displayed on the homepage");
        boolean logo= driver.findElement(By.xpath("//*[@class='injected-svg js-svg-icon svg-icon']")).isDisplayed();
        Assert.assertEquals(logo, true);

        //Close cookies pop up
        driver.findElement(By.xpath(signUpElements.CookiesPopUp())).click();
    }

    @And("user searches for (.*) page")
    public void user_searches_for_Cash_Investment_Rates_information_page(String infoPage) throws InterruptedException{
        //Click on the Search icon
        System.out.println("Click on the Search icon");
        driver.findElement(By.xpath(signUpElements.SearchIcon())).click();

        sleep(2000);

        //verify the search bar has opened
        System.out.println("verify the search bar has opened");
        boolean searchBarStatus= driver.findElement(By.id("searchBarInput")).isDisplayed();
        Assert.assertEquals(searchBarStatus, true);

        //Search for Cash Investment Rates information page
        WebElement search = driver.findElement(By.id("searchBarInput"));
        search.sendKeys(infoPage);
        search.sendKeys(Keys.RETURN);
    }

    @Then("user navigates to Understanding Cash Investment Interest Rates page")
    public void user_navigates_to_Understanding_Cash_Investment_Interest_Rates_page() throws InterruptedException {
        System.out.println("Navigate to Cash Investment Rates information webpage");
        sleep(2000);

        //verify "Understanding Cash Investment" link is on the webpage.
        boolean pageLink = driver.findElement(By.xpath("//a[@href='https://www.investec.com/en_za/focus/money/understanding-interest-rates.html']")).isDisplayed();
        Assert.assertEquals(pageLink, true);

        //Click on the "Understanding Cash Investment" link
        System.out.println("Click on the Understanding Cash Investment link");
        driver.findElement(By.xpath(signUpElements.UnderstandingCashInvestmentLink())).click();
    }

    @When("user is on the Understanding Cash Investment Interest Rates page")
    public void user_is_on_the_Understanding_Cash_Investment_Interest_Rates_page() throws InterruptedException {
        //verify that we have navigated to Cash Investment Rates information webpage
        System.out.println("verify that we have navigated to Cash Investment Rates information webpage");
        sleep(1000);
        String currentURL = driver.getCurrentUrl();
        Assert.assertEquals("https://www.investec.com/en_za/focus/money/understanding-interest-rates.html", currentURL);
    }

    @Then("user clicks on the sign up button")
    public void user_clicks_on_the_sign_up_button() {
        System.out.println("Click sign-up button");

        //Scroll to the sign up button
        WebElement element = driver.findElement(By.xpath("(//div[@class='col-12']//div/button)[1]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(element);
        actions.perform();

        //Click on the sign up button
        element.click();
    }

    @Then("user inputs name (.*)")
    public void user_inputs_name(String name) throws InterruptedException {
        //Input Name
        System.out.println("Input name");
        driver.findElement(By.xpath(signUpElements.InputName())).clear();
        driver.findElement(By.xpath(signUpElements.InputName())).sendKeys(name);
    }

    @And("user inputs surname (.*)")
    public void user_inputs_surname(String surname) throws InterruptedException {
        //Input Surname
        System.out.println("Input surname");
        driver.findElement(By.xpath(signUpElements.InputSurname())).clear();
        driver.findElement(By.xpath(signUpElements.InputSurname())).sendKeys(surname);
    }

    @And("user inputs email (.*)")
    public void user_inputs_email(String email) throws InterruptedException {
        //Input Email address
        System.out.println("Input email address");
        driver.findElement(By.xpath(signUpElements.InputEmailAddress())).clear();
        driver.findElement(By.xpath(signUpElements.InputEmailAddress())).sendKeys(email);
    }

    @And("user clicks on myself radio button")
    public void user_clicks_on_myself_radio_button() throws InterruptedException {
        //Click on the "Myself" radio button
        System.out.println("Click on Myself radio button");
        sleep(1000);
        driver.findElement(By.xpath(signUpElements.MyselfRadioBTN())).click();

    }

    @Then("user clicks the submit button")
    public void user_clicks_the_submit_button() throws InterruptedException {
        //Click the Submit button
        System.out.println("Click the submit button");
        driver.findElement(By.xpath(signUpElements.SubmitBTN())).click();
        sleep(3000);
    }

    @And("user has signed up to receive Focus insights successfully")
    public void user_has_signed_up_to_receive_Focus_insights_successfully(){
        //Verify sign up was successful
        System.out.println("Verify sign up was successful");
        boolean thankYouText = driver.findElement(By.xpath("//h3[@class = 'thank-you__heading']")).isDisplayed();
        Assert.assertEquals("Thank you",thankYouText, true);
    }

    public static void tearDown(){
        // Close browser
        System.out.println("Close browser");
        driver.close();
        driver.quit();
    }
}

