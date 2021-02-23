import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Booking {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "/home/aman/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		// Website
		driver.get("https://iiscgym.iisc.ac.in/gfr/");
		
		// LogIn Details
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("amansachan@iisc.ac.in");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("4d524e4734");
		
		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt();
		}
		
		driver.findElement(By.xpath("//*[@id=\"login\"]")).click(); // Logging in...
		
		// Waiting for the next web-page
		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt();
		}
		
		
		if(!(driver.findElement(By.xpath("//*[@id=\"con_set_fac\"]")).getText()).equals("Bookings for the next day, is allowed only till 17:00 hrs !")) {
		
			// Selecting the SELF button
			driver.findElement(By.xpath("//*[@id=\"deps\"]/label")).click();
			
			// Selecting the facility
			
			// For Gymnasium
			driver.findElement(By.xpath("//*[@id=\"fac_rad_grp\"]/label[1]")).click();
			// Waiting for the slots availability
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			    Thread.currentThread().interrupt();
			}
						
			if(!(driver.findElement(By.xpath("//*[@id=\"msg_box\"]")).getText()).equals("Facility already booked for .. 15:00")) {
							
				// Select Timing - Staring: 6 & Closing: 20 (in 2400 hrs)
				driver.findElement(By.xpath("//*[@id=\"15\"]/div[1]")).click();
							
				// Selecting the BOOK button
				driver.findElement(By.xpath("//*[@id=\"btn_chk\"]")).click();
							
				// Waiting for acknowledge
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
							
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[1]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[2]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[3]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[4]/div/label")).click();
				
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
					    Thread.currentThread().interrupt();
					}
							
					driver.findElement(By.xpath("//*[@id=\"btn_add\"]")).click();
					
					try{
					    Thread.sleep(1000);
					}
					catch(InterruptedException ex){
					    Thread.currentThread().interrupt();
					}
					
					driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
					
				}
				
			else {
				
				//If facility is already booked
				driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
				
			}
			
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			    Thread.currentThread().interrupt();
			}
			
			
			// For Badminton
			driver.findElement(By.xpath("//*[@id=\"fac_rad_grp\"]/label[2]")).click();
			// Waiting for the slots availability
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			    Thread.currentThread().interrupt();
			}
								
			if(!(driver.findElement(By.xpath("//*[@id=\"msg_box\"]")).getText()).equals("Facility already booked for .. 17:00")) {
							
				// Select Timing - Staring: 6 & Closing: 21(in 2400 hrs)
				driver.findElement(By.xpath("//*[@id=\"17\"]/div[1]")).click();
								
				// Selecting the BOOK button
				driver.findElement(By.xpath("//*[@id=\"btn_chk\"]")).click();
							
				// Waiting for acknowledge
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
									
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[1]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[2]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[3]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[4]/div/label")).click();
						
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
					    Thread.currentThread().interrupt();
				}
									
				driver.findElement(By.xpath("//*[@id=\"btn_add\"]")).click();
							
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
							
				driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
						
			}
						
			else {
				//If facility is already booked
				driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
			}
					
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex){
				Thread.currentThread().interrupt();
			}
			
			
			// For Table Tennis
			driver.findElement(By.xpath("//*[@id=\"fac_rad_grp\"]/label[3]")).click();
			
			// Waiting for the slots availability
			try{
			    Thread.sleep(1000);
			}
			catch(InterruptedException ex){
			    Thread.currentThread().interrupt();
			}
			
			if(!(driver.findElement(By.xpath("//*[@id=\"msg_box\"]")).getText()).equals("Facility already booked for .. 15:00")) {
				
				// Select Timing - Staring: 6 & Closing: 18 (in 2400 hrs)
				driver.findElement(By.xpath("//*[@id=\"15\"]/div[1]")).click();
				
				// Selecting the BOOK button
				driver.findElement(By.xpath("//*[@id=\"btn_chk\"]")).click();
				
				// Waiting for acknowledge
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
				
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[1]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[2]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[3]/div/label")).click();
				driver.findElement(By.xpath("//*[@id=\"rls_cnf_mdl\"]/div/div/div[2]/ul/li[4]/div/label")).click();
				
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
				
				driver.findElement(By.xpath("//*[@id=\"btn_add\"]")).click();
				
				try{
				    Thread.sleep(1000);
				}
				catch(InterruptedException ex){
				    Thread.currentThread().interrupt();
				}
				
				driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
				
			}
			
			else {
				//If facility is already booked
				driver.findElement(By.xpath("//*[@id=\"mdl_msg_box\"]/div/div/div[1]/button/span")).click();
			}
		}
		
		// Waiting for Logout
		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt();
		}
		
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/button")).click();
		driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
		
		try{
		    Thread.sleep(1000);
		}
		catch(InterruptedException ex){
		    Thread.currentThread().interrupt();
		}
		
		//Close the webdriver object
		driver.quit();
	}
}
