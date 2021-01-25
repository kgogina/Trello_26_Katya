package com.trello.qa.fm;

import com.trello.qa.model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends  HelperBase{


    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void initLogin() {
        click(By.cssSelector("[href='/login']"));
    }

    public void fillLoginFrom(User user) throws InterruptedException {
        type(By.id("user"),user.getEmail());
        Thread.sleep(2000);
        click(By.id("login"));
        type(By.id("password"), user.getPasswrod());

    }

    public void confirmLogin() {
        click(By.id("login-submit"));
    }

    public boolean isAvatarPresent() throws InterruptedException {
        Thread.sleep(3000);
        return isElementPresent(By.cssSelector("[data-test-id='header-member-menu-button']"));
    }


}
