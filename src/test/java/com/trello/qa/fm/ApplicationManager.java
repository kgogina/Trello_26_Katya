package com.trello.qa.fm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    Properties properties ;
    WebDriver wd;
    UserHelper userHelper;



    public void start() throws IOException {
        wd = new ChromeDriver();
       properties = new Properties();
        String target = System.getProperty("targer", "katya");
        properties.load(new FileReader(new File(String.format("src/test/resources/%s.properties", target))));
        wd = new ChromeDriver();
        wd.navigate().to(properties.getProperty("web.url"));
        wd.manage().window().maximize();
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        userHelper = new UserHelper(wd);


    }

    public String setEmail (){
        return properties.getProperty("web.email");


    }

    public String setPassword (){
        return properties.getProperty("web.password");


    }



    public WebDriver stop() {
        return wd;
    }

    public UserHelper user() {
        return userHelper;
    }

}
