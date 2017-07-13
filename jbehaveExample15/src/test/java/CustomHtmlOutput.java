import org.jbehave.core.reporters.HtmlTemplateOutput;

import org.jbehave.core.configuration.Keywords;
import org.jbehave.core.reporters.*;

import java.io.File;

public class CustomHtmlOutput extends HtmlTemplateOutput {

    public CustomHtmlOutput (File file, Keywords keywords){
        super(file, keywords, new FreemarkerProcessor(CustomHtmlOutput.class),"ftl/custom-jbehave-html-output.ftl");
    }

    public static final Format FORMAT = new Format("HTML"){
        @Override
        public StoryReporter createStoryReporter(FilePrintStreamFactory factory, StoryReporterBuilder storyReporterBuilder){
            factory.useConfiguration(storyReporterBuilder.fileConfiguration("html"));
            return new CustomHtmlOutput(factory.getOutputFile(),storyReporterBuilder.keywords())  ;
        }
    };
}
