package elementos;

import org.openqa.selenium.By;

public class ElementosWeb {

	// Elementos Login
	public By btnLogin = By.xpath("//button[@class='login-button']");
	public By username = By.xpath("//input[@name='username']");
	public By password = By.xpath("//input[@name='password']");
	public By btnContinuar = By.xpath("//button[text()='Continuar']");
	public By btnCancelar = By.xpath("//button[text()='Cancelar']");
	
	// Elementos AbrirConta
	public By btnAbrirConta = By.xpath("/button[@class='open-account-button']");
	public By cpf = By.xpath("//input[@id='cpf-input']");
	public By btnContinuarAbrirConta = By.xpath("//button[text()='Continuar']");
	
}
