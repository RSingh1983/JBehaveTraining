package net.serenity.bdd;

import net.serenitybdd.jbehave.SerenityStories;


public class TestRunner extends SerenityStories {
    public TestRunner() {
        runSerenity().inASingleSession();
    }
}
