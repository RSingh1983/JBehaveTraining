package net.serenitybdd.demo;

import net.serenitybdd.jbehave.SerenityStories;


public class TestRunner extends SerenityStories {
    public TestRunner() {
        runSerenity().inASingleSession();
    }
}
