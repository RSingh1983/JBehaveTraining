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

    @Given("I execute the step before every scenario")
    public void stepBeforeScenario(){
        System.out.println("Before Scenario");
    }

    @Given("I execute the step after every scenario")
    public void stepAfterScenario(){
        System.out.println("After Scenario");
    }

    @Given("two numbers $num1 and $num2")
    public void given_two_numbers(int num1, int num2){
        number1 = new MyNumber(num1);
        number2 = new MyNumber(num2);
    }

    @When("I add the numbers")
    public void add_numbers(){
        result = number1.add(number2);
    }

    @When("I subtract the numbers")
    public void subtract_numbers(){
        result = number2.sub(number1);
    }

    @Then("I validate the sum of numbers as $res")
    public void validateSum(int res){
        Assert.assertTrue(result.getNumber() == res);
    }

    @Then("I validate the diff of numbers as $res")
    public void validateDiff(int res){
        Assert.assertTrue(result.getNumber() == res);
    }
}
