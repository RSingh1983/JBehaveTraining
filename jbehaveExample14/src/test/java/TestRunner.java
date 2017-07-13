import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.junit.JUnitStories;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.FreemarkerViewGenerator;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import static java.util.Arrays.asList;
import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

/**
 * Created by ravindersingh on 7/9/17.
 */
public class TestRunner extends CoreStories {

    @Override
    public Configuration configuration(){
        /*Properties viewResources = new Properties();
        viewResources.put("decorateHtml", "true");
        return new MostUsefulConfiguration().
                useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE,Format.HTML, Format.IDE_CONSOLE));
                *//*useStoryLoader(new LoadFromClasspath(this.getClass())).
                        useStoryReporterBuilder(
                            new StoryReporterBuilder()
                            .withViewResources(viewResources).withFormats(Format.HTML));*/

        Configuration configuration = super.configuration();
        Properties viewResources = new Properties();
        viewResources.put("reports", "ftl/jbehave-reports.ftl");
        configuration.useViewGenerator(new FreemarkerViewGenerator(this.getClass()));
        return configuration.useStoryReporterBuilder(configuration.storyReporterBuilder()
                .withViewResources(viewResources)
                .withFormats(CustomHtmlOutput.FORMAT));
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
