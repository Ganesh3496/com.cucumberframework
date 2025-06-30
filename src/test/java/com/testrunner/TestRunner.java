package com.testrunner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("featurefiles/LoginWithmultiplesdata.feature") // relative to src/test/resources
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.stepdefinations")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty, html:target/report.html")
//@IncludeTags({"Regression","Sanity"})
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Sanity and not @Regression")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Sanity or @Regression")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Sanity and @Regression")

//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "(@Smoke or @Sanity) and not @Regression")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Smoke and not @Regression")
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Smoke or @Regression")
//@IncludeTags({"Regression","Smoke"})
//@ConfigurationParameter(key = FILTER_TAGS_PROPERTY_NAME,value = "@Regression and @Smoke")
public class TestRunner {
}
