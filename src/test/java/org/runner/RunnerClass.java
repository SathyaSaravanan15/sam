package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Wgadmin\\eclipse-workspace\\JPetStorecucumber\\src\\test\\resources\\Feature\\JpetStore.feature",
glue="org.step",
plugin=  "json:target\\jpet.json")
		
public class RunnerClass {
	@AfterClass
	public static void report() {
		ReportClass.generateReport("target\\jPet.json");
	}
	

}
