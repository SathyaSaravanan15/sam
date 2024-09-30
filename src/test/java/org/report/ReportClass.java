package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportClass {
	public static void generateReport(String json) {
		File file = new File ("target");
		Configuration config = new Configuration (file,"JpetWebPage");
		config.addClassifications("User", "Sathya");
		config.addClassifications("User_storyNo","2025");
		config.addClassifications("Tools","BDD_cucumber_JUnit");
		List<String>list =new LinkedList<String>();
		list.add(json);
		ReportBuilder reportBuilder = new ReportBuilder(list,config);
		reportBuilder.generateReports();

}
}
