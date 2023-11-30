package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_COOKIE = "//button[@data-cookiebanner='accept_button']";
    public static final String XPATH_REGISTRATION = "//a[@data-testid=\"open-registration-form-button\"]";
    public static final String XPATH_CHOOSE_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_CHOOSE_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_CHOOSE_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.FIREFOX);
        driver.get("https://www.facebook.com/");

        while (!driver.findElement(By.xpath(XPATH_COOKIE)).isDisplayed());
        WebElement cookieButton = driver.findElement(By.xpath(XPATH_COOKIE));
        cookieButton.click();

        while (!driver.findElement(By.xpath(XPATH_REGISTRATION)).isDisplayed());
        WebElement registrationButton = driver.findElement(By.xpath(XPATH_REGISTRATION));
        registrationButton.click();

        Thread.sleep(2000);

        WebElement chooseDay = driver.findElement(By.xpath(XPATH_CHOOSE_DAY));
        Select selectDay = new Select(chooseDay);
        selectDay.selectByIndex(10);

        WebElement chooseMonth = driver.findElement(By.xpath(XPATH_CHOOSE_MONTH));
        Select selectMonth = new Select(chooseMonth);
        selectMonth.selectByIndex(5);

        WebElement chooseYear = driver.findElement(By.xpath(XPATH_CHOOSE_YEAR));
        Select selectYear = new Select(chooseYear);
        selectYear.selectByIndex(60);

    }
}