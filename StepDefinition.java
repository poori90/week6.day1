package steps;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public ChromeDriver driver;
	String leadID ;
	List <String>allhandles;
	@Given("Open the Crome Browser")
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	

	}
	@Given("Load the Application Url")
	public void loadApplication() {
		driver.get("http://leaftaps.com/opentaps/control/main");

	}
	@Given("Enter the Username as {string}")
	public void enterUsername(String uName) {
		driver.findElement(By.id("username")).sendKeys(uName);

	}
	@Given("Enter the Password as {string}")
	public void enterPassword(String pwd) {
		driver.findElement(By.id("password")).sendKeys(pwd);
	}
	@When("click on Login button")
	public void clickLoginButton() {
		driver.findElement(By.className("decorativeSubmit")).click();

	}
	@Then("HomePage should be displayed")
	public void homePageDisplayed() {
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equals("Leaftaps - TestLeaf Automation Platform")) {
			System.out.println("Logged in successfully");
		}
		else
			System.out.println("Not Logged in");

	}
	@But("Error Message should be displayed")
	public void verifyErrorMessage() {
		System.out.println("Error message should be displayed");

	}
	@When("Click on CRMSFA link")
	public void clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@Given("Click on Leads")
	public void clickLead() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@Given("Click Create Lead")
	public void createLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the Company name {string}")
	public void company(String company) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(company);
	}

	@Given("Enter the First Name {string}")
	public void firstName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);

	}

	@Given("Enter the Last Name {string}")
	public void lastName(String lastname) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);

	}

	@Given("Enter the phone number {string}")
	public void phone(String phno) {
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
	}

	@When("Click on submit button")
	public void submit() {
		driver.findElement(By.name("submitButton")).click();

	}

	@Then("Lead created successfully")
	public void successMsg() {
		System.out.println("Lead created successfully");

	}
	
	@Given("Click on Find Leads")
	public void click_on_find_leads() {
		driver.findElement(By.linkText("Find Leads")).click();

	}

	@Given("Click on Phone")
	public void click_on_phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}

	@Given("Enter the phone {string}")
	public void enter_the_phone_number(String phone) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phone);

	}

	@Given("Click on Search Leads")
	public void click_Search_leads() {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

	}

	@Given("Click on the Lead Record")
	public void click_on_the_lead_record() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
	}

	@Given("Click on the Edit Button")
	public void click_on_the_edit_button() {
		driver.findElement(By.linkText("Edit")).click();

	}

	@Then("Update the company name {string}")
	public void update_the_company_name(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
	}

	@Then("Click on Update Button")
	public void click_on_update_button() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Given("Click on the Duplicate Button")
	public void click_on_duplicate_button() {
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
}
	
	@Given("Get the lead id")
	public void get_lead_id() throws InterruptedException {
		Thread.sleep(5000);
		leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
	}
	
	@Given("Enter the LeadID")
	public void enter_lead_id() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	}
	
	@Then ("Verify the lead is deleted")
	public void verify_lead() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	@Then ("Verify the lead is merged")
	public void verify_merge() {
		String text = driver.findElement(By.className("x-paging-info")).getText();
		if (text.equals("No records to display")) System.out.println("Record Merged");
		else System.out.println("Record not merged");
	}
	
	@When ("Click on the Delete Button")
	public void click_on_delete_button() {
		driver.findElement(By.linkText("Delete")).click();
	}
	
	@Given("Click on Merge Leads")
	public void click_on_merge_leads() {
		driver.findElement(By.linkText("Merge Leads")).click();
	   
	}
	@Given("Click on first lookup")
	public void click_on_first_lookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
	}
	@Given("Go to the new window")
	public void go_to_the_new_window() {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
	}
	@Given("Enter the lead first name {string}")
	public void enter_the_lead_first_name(String name) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(name);
	}
	@Given("Go to main window")
	public void go_to_main_window() {
		driver.switchTo().window(allhandles.get(0));
	}
	@Given("Click on second lookup")
	public void click_on_second_lookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	}
	@Then("Click on Merge Button")
	public void click_on_merge_button() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
	}
	@Then("Accept the Alert")
	public void accept_the_alert() {
		driver.switchTo().alert().accept();
	}
	
}
