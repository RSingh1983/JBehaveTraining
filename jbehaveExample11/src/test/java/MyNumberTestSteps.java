import org.jbehave.core.annotations.*;
import org.junit.Assert;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class MyNumberTestSteps {
    MyNumber number1;
    MyNumber number2;
    MyNumber result;


    @Given("two integer numbers as $num1 and $num2")
    @Alias("User is being provided two numbers as $num1 and $num2")
    public void given_two_numbers(@Named("num2")int input2, @Named("num1") int input1){  //Order is immaterial in case of @Named parameters
        System.out.println("Create Numbers that need to be added");
        number1 = new MyNumber(input1);
        System.out.println("First Number is = " + number1.getNumber());
        number2 = new MyNumber(input2);
        System.out.println("Second Number is = " + number2.getNumber());
    }

    @Given("one number is $num")
    public void buildOneNumber(int num) {
        System.out.println("Number is " + num);
        number1 = new MyNumber(num);
    }

    @Given("one number is $num1 and another number is $num2")
    public void buildBothNumbers(int num1, int num2) {
        System.out.println("Number 1 = " + num1 + " Number 2 = " + num2);
        number1 = new MyNumber(num1);
        number2 = new MyNumber(num2);
    }

   /* @Given(value="one number is $num1 and another number is $num2", priority=1)
    public void buildBothNumber(int num1, int num2) {
        System.out.println("Number 1 = " + num1 + " Number 2 = " + num2);
        number1 = new MyNumber(num1);
        number2 = new MyNumber(num2);
    }*/

    @When("I add the numbers")
    @Aliases(values = {"User adds the given numbers",
                        "Add the given numbers"})
    public void add_numbers(){
        System.out.println("Adding the Numbers");
        result = number1.add(number2);
    }

    @When("I subtract the numbers")
    public void subtract_numbers(){
        System.out.println("Subtracting the Numbers");
        result = number2.sub(number1);
    }

    @Then("I validate the sum of numbers as $res")
    public void validateSum(int res){
        System.out.println("validate whether sum was correct");
        Assert.assertTrue(result.getNumber() == res);
    }

    @Then("I validate the diff of numbers as zero")
    public void validateDiffZero(int res){
        System.out.println("validate whether diff was correct");
        Assert.assertTrue(result.getNumber() == 0);
    }

    @Then(value="I validate the diff of numbers as $res",priority=1)
    public void validateDiff(int res){
        System.out.println("validate whether diff was correct");
        System.out.println("Difference is " + result.getNumber());
        Assert.assertTrue(result.getNumber() == res);
    }



}
