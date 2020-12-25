import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Manimala/Desktop/ChromeDriver/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://localhost:4200/");
		WebElement username=driver.findElement(By.xpath("//input[@id='username']"));
		username.sendKeys("admin");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("pass");
		WebElement login_button=driver.findElement(By.xpath("//button[text()='Login']"));
		login_button.click();
		Thread.sleep(5000);
		WebElement add_student=driver.findElement(By.xpath("//a[contains(text(),'Add Student')]"));
		add_student.click();
        WebElement name=driver.findElement(By.xpath("//input[@id='name']"));
        System.out.println("Entering the Name of the Student");
		name.sendKeys("RaghuRam");
		WebElement subject_01=driver.findElement(By.xpath("//app-create-student/div/form/div[2]/input"));
		System.out.println("Entering the Subject 1 Mark");
		subject_01.sendKeys("80");
		WebElement subject_02=driver.findElement(By.xpath("//app-create-student/div/form/div[3]/input"));
		System.out.println("Entering the Subject 2 Mark");
		subject_02.sendKeys("90");
		WebElement subject_03=driver.findElement(By.xpath("//app-create-student/div/form/div[4]/input"));
		System.out.println("Entering the Subject 3 Mark");
		subject_03.sendKeys("76");
		WebElement subject_04=driver.findElement(By.xpath("//app-create-student/div/form/div[5]/input"));
		System.out.println("Entering the Subject 4 Mark");
		subject_04.sendKeys("89");
		WebElement subject_05=driver.findElement(By.xpath("//app-create-student/div/form/div[6]/input"));
		System.out.println("Entering the Subject 5 Mark");
		subject_05.sendKeys("89");
		Select select=new Select(driver.findElement(By.xpath("//select[@id='passpercentage']")));
		select.selectByIndex(0);
		WebElement submit_button=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		submit_button.submit();
		Thread.sleep(5000);
		WebElement student_list=driver.findElement(By.partialLinkText("Student List"));
		student_list.click();
		driver.navigate().refresh();
		WebElement logout=driver.findElement(By.linkText("Logout"));
		logout.click();
		System.out.println("Logged out successfully");
		driver.close();
		
	
		
	}

}
