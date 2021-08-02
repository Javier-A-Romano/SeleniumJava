package org.testerfabrik.basico;

import org.openqa.selenium.WebDriver;
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


        driver.close();
    }
}
