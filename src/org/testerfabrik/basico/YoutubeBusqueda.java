package org.testerfabrik.basico;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class YoutubeBusqueda {
    static  WebDriver driver;

    public static void main(String[] args){

        try{
            String baseURL= "https://www.youtube.com/";
            String actualResult = "";
            String expectedResult="YouTube";



            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");

            driver=new ChromeDriver();

            driver.get(baseURL);

            actualResult = driver.getTitle();

            System.out.println(actualResult.contentEquals(expectedResult)?"TEST OK = " + actualResult : "TEST FAIL");

            WebElement modalAceptar= driver.findElement(By.id("search"));
            modalAceptar.sendKeys("xbox one");
            WebElement busqueda= driver.findElement(By.id("search-icon-legacy"));
            busqueda.click();
            Thread.sleep(3000);
            WebElement filtro= driver.findElement(By.xpath("/html/body/ytd-app/div/ytd-page-manager/ytd-search/div[1]/ytd-two-column-search-results-renderer/div/ytd-section-list-renderer/div[1]/div[2]/ytd-search-sub-menu-renderer/div[1]/div/ytd-toggle-button-renderer/a/tp-yt-paper-button/yt-formatted-string"));
            filtro.click();




        }catch (NoSuchElementException NSEE){
            System.err.println("nosuchelementexception" + NSEE);
        }catch (WebDriverException WDE){
            System.err.println("WebDriverException" + WDE);
        }catch (Exception ex){
            System.err.println(ex);
        }finally {
           //driver.close();
        }
    }
}
