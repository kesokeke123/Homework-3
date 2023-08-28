import com.codeborne.selenide.Condition;
import com.codeborne.selenide.commands.Click;
import org.testng.annotations.Test;
import utils.ChromeRunner;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;

public class SECONDPROJECTSELENIDE extends ChromeRunner {
    @Test
    public void mytest2() {
        $(".btn-cart").click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(".add_to_cart", 0).click();
        sleep(5000);
        $(byClassName("cart-count")).click();
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);


    }

    @Test
    public void mytest3() {
        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byText("ვერ მოიძებნა")).should(Condition.visible);
        $("#search_list").setValue("კომპიუტერი").pressEnter();
        $(".add_to_cart", 0).click();
        $(byClassName("cart-count")).click();
        $(byClassName("redButton")).click();
        $(byText("შენახული ნივთები")).click();
        $(byText("შენახული ნივთები")).shouldNotBe(Condition.empty);
        $(byClassName("cart-count")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byText("შენახული ნივთები")).click();
        $(byClassName("fa-times"), 0).click();
        $(byText("ვერ მოიძებნა")).should(Condition.visible);
        sleep(5000);


    }
}
