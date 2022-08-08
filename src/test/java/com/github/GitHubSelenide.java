package com.github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class GitHubSelenide {
    @BeforeAll
static void configure(){
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;

    }
@Test
void searchGithub(){
        open("https://github.com/");
    $(byText("Pricing")).hover();
    $(byText("Compare plans")).click();
    $(".application-main").shouldHave(text("Choose the plan that’s right for you.")).scrollTo();
}
}
