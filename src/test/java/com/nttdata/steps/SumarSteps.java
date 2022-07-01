package com.nttdata.steps;

import com.nttdata.page.CalculadoraPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SumarSteps {
    private WebDriver driver;

    public SumarSteps(WebDriver driver){
        this.driver = driver;
    }

    public void typeNumero1(String numero1){
        WebElement userInputElement = driver.findElement(CalculadoraPage.numero1Input);
        userInputElement.sendKeys(numero1);
    }

    public void typeNumero2(String numero2){
        WebElement userInputElement = driver.findElement(CalculadoraPage.numero2Input);
        userInputElement.sendKeys(numero2);
    }


    public void operacion(){
        WebElement operacionSuma = driver.findElement(CalculadoraPage.selectorInput);
        operacionSuma.click();
        Actions actions = new Actions(driver);
        actions.sendKeys("d");
        actions.sendKeys(Keys.ENTER);
        actions.build().perform();
    }

    public void calcular(){
        this.driver.findElement(CalculadoraPage.calculateButton).click();
    }

    public void limpiar(){
        this.driver.findElement(CalculadoraPage.clearButton).click();
    }





}
