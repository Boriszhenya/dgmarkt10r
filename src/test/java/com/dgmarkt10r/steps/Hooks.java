package com.dgmarkt10r.steps;

import com.dgmarkt10r.context.TestContext;
import com.dgmarkt10r.utils.ConfigurationReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import static com.dgmarkt10r.context.TestContext.getDriver;
import static com.dgmarkt10r.context.TestContext.removeDriver;

public class Hooks {

    @Before
    public static void set(Scenario scenario) throws URISyntaxException, MalformedURLException {
        String browser = ConfigurationReader.get("browser");
        WebDriver driver;
        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                ChromeOptions chromeOptions = new ChromeOptions();
                if (ConfigurationReader.get("headless").toLowerCase().contains("true")) {
                    chromeOptions.addArguments("--headless");
                    chromeOptions.addArguments("--no-sandbox");
                    chromeOptions.addArguments("--disable-infobars");
                    chromeOptions.addArguments("--disable-popup-blocking");
                    chromeOptions.addArguments("--disable-notifications");
                    chromeOptions.addArguments("--lang=en-en");
                }
                if (ConfigurationReader.get("maximize").toLowerCase().contains("true")) {
                    chromeOptions.addArguments("start-maximized");
                }
                if (ConfigurationReader.get("remote_server").toLowerCase().contains("true")) {
                    chromeOptions.setCapability("platformName", ConfigurationReader.get("remote_server_platform"));
                    chromeOptions.setCapability("se:name", scenario.getName());
                    driver = new RemoteWebDriver(new URI(ConfigurationReader.get("remote_server_url")).toURL(), chromeOptions);
                } else {
                    driver = new ChromeDriver(chromeOptions);
                }
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                FirefoxOptions firefoxOptions = new FirefoxOptions();
                if (ConfigurationReader.get("headless").toLowerCase().contains("true")) {
                    firefoxOptions.addArguments("--headless");
                    firefoxOptions.addArguments("--no-sandbox");
                    firefoxOptions.addArguments("--disable-infobars");
                    firefoxOptions.addArguments("--disable-popup-blocking");
                    firefoxOptions.addArguments("--disable-notifications");
                    firefoxOptions.addArguments("--lang=en-en");
                }
                if (ConfigurationReader.get("maximize").toLowerCase().contains("true")) {
                    firefoxOptions.addArguments("start-maximized");
                }
                if (ConfigurationReader.get("remote_server").toLowerCase().contains("true")) {
                    firefoxOptions.setCapability("platformName", ConfigurationReader.get("remote_server_platform"));
                    firefoxOptions.setCapability("se:name", scenario.getName());
                    driver = new RemoteWebDriver(new URI(ConfigurationReader.get("remote_server_url")).toURL(), firefoxOptions);
                } else {
                    driver = new FirefoxDriver(firefoxOptions);
                }
                break;
            case "edge":
                if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
                    throw new WebDriverException("Ваша операционная система не поддерживает запуск браузера Edge");
                }
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            default:
                throw new WebDriverException("WebDriver не выбран в конфигурационном файле configuration.properties");
        }
        TestContext.setDriver(driver);
        driver.get(ConfigurationReader.get("base_url"));
        TestContext.scenario = scenario;
    }

    @After
    public void afterMethod(Scenario scenario) {
        if (scenario.isFailed()) {
            WebDriver driver = getDriver();
            if (driver != null) {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] src = ts.getScreenshotAs(OutputType.BYTES);
                scenario.attach(src, "image/png", "screenshot");
            }
        }
        closeDriver();
    }

    @BeforeStep
    public void beforeEveryStep(Scenario scenario) {
        WebDriver driver = getDriver();
        if (driver != null) {
            scenario.log("Current URL: " + driver.getCurrentUrl());
        }
    }

    private void closeDriver() {
        WebDriver driver = getDriver();
        if (driver != null) {
            driver.quit();
            removeDriver();
        }
    }
}
