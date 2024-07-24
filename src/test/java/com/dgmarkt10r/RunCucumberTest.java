package com.dgmarkt10r;

import org.junit.platform.suite.api.*;

import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com.dgmarkt10r")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "com.dgmarkt10r")
@ExcludeTags("ignored")
public class RunCucumberTest {
}