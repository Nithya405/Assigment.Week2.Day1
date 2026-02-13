package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeaflapsSelectclass {

	private static final int Corporation = 0;

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr2");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("Yazhisai");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry=driver.findElement(By.name("industryEnumId"));
		Select sel=new Select(industry);
	    sel.selectByVisibleText("Computer Software");
	    WebElement ownership=driver.findElement(By.name("ownershipEnumId"));
	    Select ind=new Select(ownership);
	    ind.selectByVisibleText("S-Corporation");
	    WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
	    Select source=new Select(sourceDD);
	    source.selectByValue("LEAD_EMPLOYEE");
	    WebElement campaign =driver.findElement(By.id("marketingCampaignId"));
		Select marketing=new Select(campaign);
		marketing.selectByIndex(6);
		WebElement state=driver.findElement(By.name("generalStateProvinceGeoId"));
	    Select stateDD=new Select(state);
	    stateDD.selectByValue("TX");
	    driver.findElement(By.className("smallSubmit")).click();
	    System.out.println("Account Name:Yazhisai");
	    driver.close();
	    
	    
	    
	    
	    
	    
	    
	}

}
