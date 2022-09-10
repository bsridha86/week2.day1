package seleniumJavaWeek2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Week2_day1_Assignment_CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/login");
		driver1.manage().window().maximize();
		driver1.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver1.findElement(By.id("password")).sendKeys("crmsfa");
		driver1.findElement(By.className("decorativeSubmit")).click();
		driver1.findElement(By.linkText("CRM/SFA")).click();
		driver1.findElement(By.linkText("Leads")).click();
		driver1.findElement(By.linkText("Create Lead")).click();
		driver1.findElement(By.id("createLeadForm_companyName")).sendKeys("Bala Ltd");
		driver1.findElement(By.id("createLeadForm_firstName")).sendKeys("Bala");
		driver1.findElement(By.id("createLeadForm_lastName")).sendKeys("Balu");
		driver1.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Bala");
		driver1.findElement(By.id("createLeadForm_departmentName")).sendKeys("Fashion");
		driver1.findElement(By.id("createLeadForm_description")).sendKeys("This company belongs to fashion platform");
		driver1.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("test@gmail.com");
		
		WebElement Stateddown = driver1.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		
		Select sdd = new Select(Stateddown);
		
		sdd.selectByVisibleText("New York");
		
		driver1.findElement(By.name("submitButton")).click();
		System.out.println(driver1.getTitle());
		
		
	}

}
