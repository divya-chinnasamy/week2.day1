package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		//Launch the browser
		ChromeDriver obj = new ChromeDriver();
		obj.get("http://leaftaps.com/opentaps/control/main");
		//maxime the browser
		obj.manage().window().maximize();
		System.out.println(obj.getTitle());
		obj.findElement(By.id("username")).sendKeys("Demosalesmanager");
		obj.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		obj.findElement(By.className("decorativeSubmit")).click();
		obj.findElement(By.linkText("CRM/SFA")).click();
		//now click leads
		
		obj.findElement(By.linkText("Leads")).click();
		obj.findElement(By.linkText("Create Lead")).click();
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("UHG");
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya");
		obj.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva");
		obj.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divya");
		obj.findElement(By.id("createLeadForm_departmentName")).sendKeys("Healthcare Testing");
		obj.findElement(By.id("createLeadForm_description")).sendKeys("This is claim processing system");
		obj.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divya.chinnasamy@uhc.com");
		//Lead creation
		obj.findElement(By.name("submitButton")).click();
		System.out.println(obj.getTitle());
		System.out.println("Lead created");
		//Editing the Lead
		obj.findElement(By.linkText("Duplicate Lead")).click();
		obj.findElement(By.id("createLeadForm_companyName")).clear();
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("UnitedHeathcare Corporation");
		obj.findElement(By.id("createLeadForm_firstName")).clear();
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Divyaprabha");
		obj.findElement(By.name("submitButton")).click();
		System.out.println(obj.getTitle());
	
	}

}
