import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Lesson02_HomeWork {

    @BeforeAll
    static void setup() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.startMaximized = true;
    }

    @Test
    void positiveFillTest() {
        open("/automation-practice-form");
        $("#firstName").setValue("FirstName");          // firstName
        $("#lastName").setValue("LastName");            // lastName
        $("#userEmail").setValue("any_email@test.mm");  // email
        $(byText("Male")).click();                     // gender
        $("#userNumber").setValue("1234567890");        // mobile
        $(byText("Submit")).scrollTo();                // scroll
        $("#submit").click();                           // click Submit
        // Assertions
        $(".modal-body").shouldHave(text("FirstName"));
        $(".modal-body").shouldHave(text("LastName"));
        $(".modal-body").shouldHave(text("Male"));
        $(".modal-body").shouldHave(text("any_email@test.mm"));
        $(".modal-body").shouldHave(text("1234567890"));
    }

}
