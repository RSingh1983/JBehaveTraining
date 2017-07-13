import org.jbehave.core.annotations.*;
import org.junit.Assert;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class MyNumberTestSteps {
    MyNumber number1;
    MyNumber number2;
    MyNumber result;


    @Given("two numbers as $num1 and $num2")
    @Alias("User is being provided two numbers as $num1 and $num2")
    public void given_two_numbers(int num1, int num2){
        System.out.println("Create Numbers that need to be added");
        number1 = new MyNumber(num1);
        number2 = new MyNumber(num2);
    }

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

    @Then("I validate the diff of numbers as $res")
    public void validateDiff(int res){
        System.out.println("validate whether diff was correct");
        Assert.assertTrue(result.getNumber() == res);
    }

    @BeforeStory // equivalent to @BeforeStory(uponGivenStory=false)
    public void beforeStory() {
        System.out.println("==== This method will execute before every story ====");
    }

    @AfterStory // equivalent to @AfterStory(uponGivenStory=false)
    public void afterStory() {
        System.out.println("==== This method will execute after every story ====");
    }

    /*@BeforeStory(uponGivenStory=true)
    public void beforeGivenStory() {
        System.out.println("==== This method will execute before every Given story ====");
    }

    @AfterStory(uponGivenStory=true)
    public void afterGivenStory() {
        System.out.println("==== This method will execute after every Given story ====");
    }*/

}
