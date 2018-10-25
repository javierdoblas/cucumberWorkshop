package workshop;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class CalculatorSteps {
    private Calculator calc;

    @Given("a calculator I just turned on")
    public void a_calculator_I_just_turned_on() {
        calc = new Calculator();
    }

    @When("I add {int} and {int}")
    public void adding(int arg1, int arg2) {
        calc.push(arg1);
        calc.push(arg2);
        calc.push("+");
    }

    @Then("the result is {int}")
    public void the_result_is(double expected) {
        assertEquals(expected, calc.value());
    }


    @When ("Operation ([^\"]+) is applied on ([^\"]+) and ([^\"]+)")
    public void operation (String operation, String arg1, String arg2) {
        int number1 = Integer.parseInt(arg1);
        int number2 = Integer.parseInt(arg2);
        calc.push(number1);
        calc.push(number2);
        calc.push(operation);
    }

    @Then("the result is ([^\"]*) ")
    public void the_result_is(int answer) {
        assertEquals(answer, calc.value());
    }

}