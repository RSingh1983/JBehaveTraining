import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class MyNumberTestSteps {
    MyNumber number1;
    MyNumber number2;
    MyNumber result;


    @Given("two numbers")
    public void given_two_numbers(){
        number1 = new MyNumber(10);
        number2 = new MyNumber(20);
    }

    @When("I add the numbers")
    public void add_numbers(){
        result = number1.add(number2);
    }

    @Then("I validate the sum of numbers")
    public void validateSum(){
        Assert.assertTrue(result.getNumber() == 30);
    }
}
