import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
// just adding some comments
    WebDriver driver;

    @Given("^User needs to be on FB Login Page$")
    public void user_needs_2b_on_FB_Login_Page(){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\deeptim\\Downloads\\chromedriver_win32\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://www.facebook.com/");
    }

    @When("^User enters first name$")
    public void user_enters_first_name(){
            driver.findElement(By.xpath("//*[@name=\"firstname\"]")).sendKeys("Tester");
    }

    @Then("^User checks if the first name is present$")
    public void User_checks_if_the_first_name_is_present(){
       // driver.findElement(By.xpath("//*[@name=\"firstname\"]")).getAttribute();
    }

    @But("^User last name field should be blank$")
    public void User_last_name_field_should_be_blank(){

    }
}
