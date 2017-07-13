import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class TestRunner extends JUnitStories {

    @Override
    public Configuration configuration(){
        return new MostUsefulConfiguration().
                useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(CustomHtmlOutput.FORMAT));
    }

    @Override
    public InjectableStepsFactory stepsFactory() {
        return new InstanceStepsFactory(configuration(),new MyNumberTestSteps());
    }

    protected List<String> storyPaths() {
        String codeLocation = codeLocationFromClass(this.getClass()).getFile();
        return new StoryFinder().findPaths(codeLocation,asList("**/*.story"),asList(""));
    }
}
