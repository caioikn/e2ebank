package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Elementos Login
	By btnLogin = By.xpath("//button[@class='login-button']");
	By username = By.xpath("//input[@name='username']");
	By password = By.xpath("//input[@name='password']");
	By btnContinuar = By.xpath("//button[text()='Continuar']");
	By btnCancelar = By.xpath("//button[text()='Cancelar']");
	
	// Elementos AbrirConta
	By btnAbrirConta = By.xpath("/button[@class='open-account-button']");
	By cpf = By.xpath("//input[@id='cpf-input']");
	By btnContinuarAbrirConta = By.xpath("//button[text()='Continuar']");
	
}
