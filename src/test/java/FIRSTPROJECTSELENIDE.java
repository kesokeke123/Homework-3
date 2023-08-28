import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utils.ChromeRunner;


import java.time.Duration;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class FIRSTPROJECTSELENIDE extends ChromeRunner {
    @Test
    public void mytest() {
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("keso").shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("გავაშელიშვილი").shouldNotBe(Condition.empty);
        $(byId("email")).setValue("kkedo448@gmail.com").shouldNotBe(Condition.empty);
        $(byId("password")).setValue("Tbilisi9");
        $(byId("confirmPassword")).setValue("Tbilisi9");
        $(byId("singup")).shouldBe(Condition.enabled);

        sleep(5000);
    }

    @Test
    public void mytest1() {
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.disabled);
        $(byId("email")).setValue("keso").shouldNotBe(Condition.disappear);
        $(byId("password")).setValue("Tb").shouldNotBe(Condition.disappear);
        $(byId("confirmPassword")).setValue("Tbi").shouldNotBe(Condition.disappear);
        sleep(5000);


    }


}






