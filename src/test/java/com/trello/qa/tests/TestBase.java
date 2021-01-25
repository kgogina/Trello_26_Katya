package com.trello.qa.tests;

import com.trello.qa.fm.ApplicationManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() {
        app.start();
    }

    @AfterMethod(enabled = false)
    public void tearDown() {
        app.stop().quit();
    }

}
