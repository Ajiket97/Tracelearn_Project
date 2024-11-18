package com.selenimum;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import java.io.File;


public class ScreenShotUsingAshot {
	static WebDriver driver;
	@Test
	public static void usingAShot() throws IOException{
	
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		AShot ashot=new AShot();
		ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000));
		Screenshot sc= ashot.takeScreenshot(driver);
		BufferedImage image= sc.getImage();
		ImageIO.write(image, "jpg", new File("d.jpg"));
		driver.close();
    }
	@Test
	public static void usingRobot() throws AWTException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        Robot robo = new Robot();
        Rectangle rect = new Rectangle();
        rect.width = 1920;
        rect.height = 1080;
        BufferedImage image = robo.createScreenCapture(rect);
        ImageIO.write(image, "jpg", new File("RobotScreenshot1.jpg"));
        driver.close();
    }
	
	public static void usingSelenium() throws IOException {
         driver = new FirefoxDriver();
        driver.get("https://www.myntra.com/");
        //driver.findElement(By.xpath(null))
        driver.manage().window().maximize();
        //File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); if we use Webdriver
        File file=((RemoteWebDriver) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("usingSelenium.jpg"));
        driver.close();

    }
}
