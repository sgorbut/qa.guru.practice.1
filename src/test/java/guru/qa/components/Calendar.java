package guru.qa.components;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

public class Calendar {
    public void setDate(String day, String month, String year){
        $("#dateOfBirthInput").clear();                                       // date of birth
        $(".react-datepicker__month-select").selectOption("January");   // month
        $(".react-datepicker__year-select").selectOption("2000");       // year
        $(".react-datepicker__day--001").click();                             // day
        return;
    }
}