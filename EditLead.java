package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		// Setup the path using wdm
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
		obj.findElement(By.id("createLeadForm_companyName")).sendKeys("Nitindeesh company");
		obj.findElement(By.id("createLeadForm_firstName")).sendKeys("Divya1");
		obj.findElement(By.id("createLeadForm_lastName")).sendKeys("Siva");
		obj.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Divya");
		obj.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
		obj.findElement(By.id("createLeadForm_description")).sendKeys("creating leads for abc company");
		obj.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("divya.chinnasamy@gmail.com");
		//Lead creation
		obj.findElement(By.name("submitButton")).click();
		System.out.println(obj.getTitle());
		System.out.println("Lead created");
		//Editing the Lead
		obj.findElement(By.linkText("Edit")).click();
		obj.findElement(By.id("updateLeadForm_description")).clear();
		obj.findElement(By.id("updateLeadForm_importantNote")).sendKeys("this is important note field");
		obj.findElement(By.name("submitButton")).click();
		
		System.out.println(obj.getTitle());
		//Edge Browser
//		WebDriverManager.edgedriver().setup();
//		EdgeDriver obj2 = new EdgeDriver();
//		obj2.get("http://leaftaps.com/opentaps/control/main");
//		obj2.manage().window().maximize();
		
	}

}
