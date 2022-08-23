package modularFW;

import java.util.concurrent.TimeUnit;

public class Genprg {

	System.setProperty("webdriver.chrome.driver","./Driver\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get(baseUrl);
	driver.manage().window().maximize();

	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	System.out.println("Application opened");
	}

	public void tearDown() {
	//driver.quit();
	System.out.println("Application and Browser are closed");
	
	}
	
	public void adminLogin() throws InterruptedException {

	driver.findElement(By.name("username")).sendKeys(uid);

	driver.findElement(By.name("password")).sendKeys(pwd);

	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

	Thread.sleep(5000);

	System.out.println("Admin login operation successful");
	}
	
	public void adminLogout() throws InterruptedException {

	driver.findElement(By.partialLinkText("partiallink_Welcome_Admin")).click();
	
	Thread.sleep(3000);

	driver.findElement(By.linkText("link_logout")).click();

	System.out.println("Admin logout");
	}
	
	

	public void addEmp() {
	System.out.println("Added new Employee");
	}
	
	
	public void delEmp() {
	System.out.println("Deleted employee");
	}

}
