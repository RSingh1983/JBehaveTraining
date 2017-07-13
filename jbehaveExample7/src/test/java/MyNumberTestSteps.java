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

    @BeforeScenario
    public void beforeEachScenario() {
        System.out.println(" ====== This method will execute before every scenario ======");
    }

    @AfterScenario
    public void afterEachScenario() {
        System.out.println(" ====== This method will execute after every scenario ======");
    }

    /*@BeforeScenario(uponType=ScenarioType.EXAMPLE)
    public void beforeEachExampleScenario() {
        System.out.println(" ====== This method will execute before every scenario of type Examples ======");
    }*/

   /* @AfterScenario(uponType=ScenarioType.EXAMPLE)
    public void afterEachExampleScenario() {
        System.out.println(" ====== This method will execute after every scenario of type Examples ======");
    }*/

    /*@AfterScenario(uponOutcome = AfterScenario.Outcome.SUCCESS)
    public void afterEachSuccessScenario() {
        System.out.println(" ====== This method will execute after every successful scenario ======");
    }*/
}
