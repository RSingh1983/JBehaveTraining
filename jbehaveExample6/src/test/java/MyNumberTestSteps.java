import org.jbehave.core.annotations.*;
import org.junit.Assert;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class MyNumberTestSteps {
    MyNumber number1;
    MyNumber number2;
    MyNumber result;


    @Given("two numbers")
    @Alias("User is being provided two numbers")
    public void given_two_numbers(){
        System.out.println("Create Numbers that need to be added");
        number1 = new MyNumber(10);
        number2 = new MyNumber(20);
    }

    @When("I add the numbers")
    @Aliases(values = {"User adds the given numbers",
                        "Add the given numbers"})
    public void add_numbers(){
        System.out.println("Adding the Numbers");
        result = number1.add(number2);
    }

    @When("I subtract the numbers")
    @Pending
    public void subtract_numbers(){
        System.out.println("Subtracting the Numbers");
        result = number2.sub(number1);
    }

    @Then("I validate the sum of numbers")
    public void validateSum(){
        System.out.println("validate whether sum was correct");
        Assert.assertTrue(result.getNumber() == 30);
    }

    @Then("I validate the diff of numbers")
    public void validateDiff(){
        System.out.println("validate whether diff was correct");
        Assert.assertTrue(result.getNumber() == 10);
    }
}
