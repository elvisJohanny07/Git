package NewTurs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistroUsuario {
    public static void main(String[] args) {

        //Se establece la ruta del driver ejecutable
        System.setProperty("webDriver.chrome.driver", ".src/main/resources/driver/chromedriver.exe");

        //Se crea una instancia
        WebDriver webDriver = new ChromeDriver();

        //Ruta para abrir página
        webDriver.get("https://demo.guru99.com/test/newtours/register.php");

        webDriver.findElement(By.name("firstName")).sendKeys("Johanny");
        webDriver.findElement(By.name("lastName")).sendKeys("Estupiñan");
        webDriver.findElement(By.name("phone")).sendKeys("3103100000");
        webDriver.findElement(By.id("userName")).sendKeys("Johanny07@gmail.com");
        webDriver.findElement(By.name("address1")).sendKeys("CRA 01 # 01-01");
        webDriver.findElement(By.name("state")).sendKeys("Bogotá");
        webDriver.findElement(By.name("postalCode")).sendKeys("010010010");
        webDriver.findElement(By.name("country")).sendKeys("Colombia");
        webDriver.findElement(By.id("email")).sendKeys("");
        webDriver.findElement(By.name("password")).sendKeys("12345");
        webDriver.findElement(By.name("confirmPassword")).sendKeys("12345");
        webDriver.findElement(By.name("submit")).click();

        System.out.println("Registro completado");

        webDriver.quit();
    }

}
