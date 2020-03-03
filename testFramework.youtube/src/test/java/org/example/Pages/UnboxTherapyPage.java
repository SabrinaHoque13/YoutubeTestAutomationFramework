package org.example.Pages;

import org.openqa.selenium.WebDriver;

public class UnboxTherapyPage {
    private WebDriver driver;
    private String UnboxTherapyUrl = "https://www.youtube.com/user/unboxtherapy";

    public UnboxTherapyPage (WebDriver driver) {
        this.driver = driver;
    }

    public void goToUnboxTherapyURL(){
        driver.navigate().to(UnboxTherapyUrl);
    }

}
