package week2.day1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Enter the Username
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click the Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//After Successful login select the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();
		//Select the Leads tab 
		driver.findElement(By.linkText("Leads")).click();
		//Select the Create Lead Link
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter the Company name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL Technologies");
		//Enter the Firstname
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suganya");
		//Enter the Lastname
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Gopinathan");
		//Enter the Firstname (local)
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Preethi");
		//Enter the Department name
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("QA Analyst");
		//Enter the Description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Creating lead account for testing");
		//Enter the Email Address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sampleabc@gmail.com");
		//Select the Data from Source Dropdown
		WebElement ele= driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sel=new Select(ele);
		sel.selectByVisibleText("Conference");
		//Select the State from State/Province
		Select selection=new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		selection.selectByVisibleText("New York");
		//Click the Create Lead Button
		driver.findElement(By.name("submitButton")).click();
		//Get the Page Title
		String title=driver.getTitle();
		System.out.println("The Title is " +title);
		//Close the Browser
		driver.close();


	}

}
