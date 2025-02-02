package utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {

	public static ExtentReports generateExtentReport() {
		ExtentReports extentReport= new ExtentReports();
		File extentReportFile= new File(System.getProperty("user.dir")+"\\test-output\\ExtentReports\\extentReport.html");
		ExtentSparkReporter sparkReporter = new ExtentSparkReporter(extentReportFile);
		
		sparkReporter.config().setTheme(Theme.DARK);
		sparkReporter.config().setReportName("Automation Result");
		sparkReporter.config().setDocumentTitle("Automation Report");
		sparkReporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkReporter);
		
		Properties configProp = new Properties();
		File configPropFile= new File(System.getProperty("user.dir")+"\\src\\main\\java\\config\\Config.properties");
		try {
		FileInputStream fisConfigProp= new FileInputStream(configPropFile);
		configProp.load(fisConfigProp);
		}catch(Throwable e ) {
			e.printStackTrace();
		}
		extentReport.setSystemInfo("Application URL",configProp.getProperty("url"));
		return extentReport;
	}
}
