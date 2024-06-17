import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BookMyShow {
	@Test
	public void selectCity() {
		ChromeDriver d = new ChromeDriver();
		d.get("https://in.bookmyshow.com/");
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List <WebElement> list = d.findElements(By.xpath("//div[@class=\"bwc__sc-ttnkwg-4 Ettpg\"][1]/ul/li"));
		for (WebElement AllList : list) {
		String text =	AllList.getText();
			System.out.println(text);
			if (text.contains("Hyderabad")) {
				AllList.click();
				
				String title = d.getCurrentUrl();
				System.out.println(title);
				

				d.findElement(By.xpath("//div[@class=\"sc-lnhrs7-4 dDgeSF\"]/child::div/a/descendant::div[@class=\"sc-133848s-3 cZuToi\"]/child::div[@class=\"sc-133848s-2 sc-133848s-12 hxPdAO\"]/child::div[text()='Chandu Champion']")).click();
//				for (WebElement name : list) {
//
//					String Names = name.getText();
//					System.out.println(Names);
//					System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
//				}
//				
			} else {

			}
		}
		
	}
}
