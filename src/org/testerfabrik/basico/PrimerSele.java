package org.testerfabrik.basico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrimerSele {

    public static void main(String[] args){

        WebDriver driver;

        String baseURL= "http://mercadolibre.com";
        String actualResult = "";
        String expectedResult="Bienvenidos a MercadoLibre";


        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

        driver=new ChromeDriver();

        driver.get(baseURL);

        actualResult = driver.getTitle();

        System.out.println(actualResult.contentEquals(expectedResult)?"TEST OK = " + actualResult : "TEST FAIL");

        driver.manage().window().maximize();
        String titleAR = "Mercado Libre Argentina";
        String titleResult="";
        driver.findElement(By.id("AR")).click();
        titleResult=driver.getTitle();
        System.out.println(titleResult.contentEquals(titleAR)?"TEST OK = " + titleResult : "TEST FAIL");
        //driver.findElement(By.linkText("Ingresá lo que quieras encontrar")).click();

        WebElement busqueda = driver.findElement(By.xpath("/html/body/header/div/form/input"));

        busqueda.sendKeys("xbox one");

        driver.findElement(By.xpath("/html/body/header/div/form/button")).click();

        String TitleXbox = "Xbox One | MercadoLibre.com.ar";
        String titleXboxResult = "";
        titleXboxResult=driver.getTitle();

        System.out.println(titleXboxResult.contentEquals(TitleXbox)?"TEST OK = " + titleXboxResult : "TEST FAIL");

        //driver.close();
    }
}
