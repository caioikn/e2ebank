package runner;

import org.openqa.selenium.edge.EdgeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {
	
	public static void iniciarTeste() {
		
		driver = new EdgeDriver();
		
		driver.get("http://52.2.114.98/");
		driver.manage().window().maximize();
		
	}

}
