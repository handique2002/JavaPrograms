package Drivers;

public class check2 {

	public static void main(String[] args) {
		
		

		webdriver driver=new safariDriver(); // safari browser
		driver.get(); // new get

		driver.get(); // launch url or navigate
		driver.findElement(); //webelement

		driver.findElements(); // List of webelements
		driver.quit(); // quit browser instead of close
		
		
				
	}
	
	

}
