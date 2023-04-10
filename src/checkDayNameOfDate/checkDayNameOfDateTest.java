package checkDayNameOfDate;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

class checkDayNameOfDateTest {

	@Test
	void checkDayNameOfDateTest1() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//*[@id=\"about\"]/div/h1")).getText();
		assertEquals("วันที่คุณเลือกคือ \"วันพฤหัสบดี\"", result);
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestErrorDate() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("32");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result = driver.switchTo().alert().getText();
		assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่วันที่ไม่มีในระบบ ไม่มีวันที่ : 32 ในเดือน : 05 ในปี : 2002", result);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestErrorEmpty() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result =  driver.findElement(By.xpath("//*[@id=\"Date\"]")).getText();
		assertEquals("", result);
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestErrorMonthEmpty() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2002");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result =  driver.findElement(By.xpath("//*[@id=\"Month\"]/option[1]")).getText();
		assertEquals("เลือกเดือนที่ท่านต้องการ", result);
		Thread.sleep(2000);
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestErrorM2_29day() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("29");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2023");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result = driver.switchTo().alert().getText();
		assertEquals("มีบางอย่างที่ผิดพลาดคุณใส่วันที่ไม่มีในระบบ ไม่มีวันที่ : 29 ในเดือน : 02 ในปี : 2023", result);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestM2_29day() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("29");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[3]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2020");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/li[2]/a")).click();
		Thread.sleep(5000);
		String result = driver.findElement(By.xpath("//*[@id=\"about\"]/div/h1")).getText();
		assertEquals("วันที่คุณเลือกคือ \"วันเสาร์\"", result);
		driver.close();
	}
	
	@Test
	void checkDayNameOfDateTestErrorYear() throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.edge.driver", "D:\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("http://localhost/PHPUnit/PHPUnit-shil3aiinuWeb-main/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//calendar
		assertTrue(driver.getTitle().contains("Shil3aiinuWebsite"));
		driver.findElement(By.xpath("//*[@id=\"Date\"]")).sendKeys("30");
		driver.findElement(By.xpath("//*[@id=\"Month\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"Month\"]/option[6]")).click();
		driver.findElement(By.xpath("//*[@id=\"Year\"]")).sendKeys("2024");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"navbar\"]/ul/center/li/a")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"class\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"class\"]/option[2]")).click();
		driver.findElement(By.xpath("//*[@id=\"grade\"]")).sendKeys("99");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"SUBMIT\"]")).click();
		String result = driver.switchTo().alert().getText();
		assertEquals("มีบางอย่างที่ผิดพลาดปีปัจจุบันคือ 2023 คุณใส่ปี : 2024", result);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		driver.close();
	}


}
