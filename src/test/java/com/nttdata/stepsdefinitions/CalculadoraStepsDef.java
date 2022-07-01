package com.nttdata.stepsdefinitions;

import com.nttdata.steps.CalculadoraSteps;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculadoraStepsDef {

    private WebDriver driver;
    private Scenario scenario;

    @Before(order = 0)
    public void setUp(){
        //setUp
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Usuario\\IdeaProjects\\ex-web-cristhian-tambraico\\drivers\\chromedriver.exe");
        //crear el driver
        driver = new ChromeDriver();
        //max
        driver.manage().window().maximize();
    }

    @Before(order = 1)
    public void setScenario(Scenario scenario){
        this.scenario = scenario;
    }

    @After
    public void quitDriver(){
        driver.quit();
    }
    @Dado("que me encuentro en la pagina de BasicCalculator")
    public void que_me_encuentro_en_la_pagina_de_basic_calculator() {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        screenShot();
    }
    @Cuando("ingreso los numeros numero1 : {string} Y numero2: {string} y opcion: {string}")
    public void ingreso_los_numeros_numero1_y_numero2_y_opcion(String numero1, String numero2, String opcion) {
        CalculadoraSteps calculadoraSteps = new CalculadoraSteps(driver);
        calculadoraSteps.limpiar();
        calculadoraSteps.typeNumero1(numero1);
        calculadoraSteps.typeNumero2(numero2);
        calculadoraSteps.operacion(opcion);
        calculadoraSteps.calcular();

    }
    @Entonces("valido que el resultado sea {string}")
    public void valido_que_el_resultado_sea(String resul) {
        CalculadoraSteps calculadoraSteps = new CalculadoraSteps(driver);
        String resultado = calculadoraSteps.getResultado();
        screenShot();

        Assertions.assertTrue(resultado != resul,"El resultado es correctos");

    }

    public void screenShot(){
        byte[] evidencia = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
        this.scenario.attach(evidencia, "image/png", "evidencias");
    }


}
