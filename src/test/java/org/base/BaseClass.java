package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static JavascriptExecutor javascriptExecutor;
	public static Actions actions;
	public void getDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		}
	public void geturl(String url) {
		driver.get(url);
	}
	public void windowmax() {
		driver.manage().window().maximize();
	}
	
	public void sendKeysByJava(WebElement element, String keysToSend) {
		element.sendKeys(keysToSend);
	}
	public void selectByIndex(WebElement selectLocation, int value) {
		Select select = new Select(selectLocation);
		select.selectByIndex(value);
	}
		
		public void selectByVisibleText(WebElement select2, String value) {
			Select select = new Select(select2);
			select.selectByVisibleText(value);
		}
			public void clickByJS(WebElement element) {
				javascriptExecutor = (JavascriptExecutor) driver;
				javascriptExecutor.executeScript("arguments[0].click()", element);
			}
				public void scrollByJS (String scrollType, WebElement scrollelement) {
					
					javascriptExecutor = (JavascriptExecutor) driver;
					
				switch (scrollType) {
					case "Down":
			       
					javascriptExecutor.executeScript("arguments[0].scrollIntoView(true)", scrollelement);

						break;

					case "Up":
						javascriptExecutor.executeScript("arguments[0].scrollIntoView(false)", scrollelement);

						break;

					default:
						break;
					}
			}
				public void sendKeysByJS(WebElement element, String keysToSend) {
					javascriptExecutor = (JavascriptExecutor) driver;
					javascriptExecutor.executeScript("arguments[0].setAttribute('value','" + keysToSend + "')", element);

				}
				public void alertpopup() {
				Alert alert=driver.switchTo().alert();
				alert.accept();
				}
				public void screenCapture() throws IOException {

					TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
					File sourceFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
					File targetFile = new File("D:\\Software Testing\\ErrorImage"
							+ System.currentTimeMillis() + ".png");
					FileUtils.copyFile(sourceFile, targetFile);
				}
				public void navigateTo (String url) {
					driver.navigate().to(url);
				}
				
				public void actionsMouseOver(WebElement element) {
					actions = new Actions(driver);
					actions.moveToElement(element).build().perform();
				}
				public void doubleClick(WebElement element) {
					actions = new Actions(driver);
					actions.moveToElement(element).build().perform();
				}
				public void actionsByDragandDrop(WebElement source, WebElement target) {
					actions = new Actions(driver);
					actions.dragAndDrop(source, target).build().perform();
				}
				public void windowhandling () {
					String parent=driver.getWindowHandle();
					Set<String> allwindow=driver.getWindowHandles();
					for(String s:allwindow) {
						if(!parent.equals(allwindow)) {
							driver.switchTo().window(s);
													}
					}
									
				}
				public String readExcel(int rownum, int cellnum) throws IOException {

					// To Locate File
					File file = new File("DB\\jpet.xlsx");

					// To get File as a Iinput Data
					FileInputStream fileInputStream = new FileInputStream(file);// throws FileNotFoundException

					// To Define Format of Workbook
					Workbook book = new XSSFWorkbook(fileInputStream); // throws IOException

					// To get sheet from Book
					Sheet sheet = book.getSheet("Sheet1");

					// To get Row from Sheet
					Row row = sheet.getRow(rownum);

					// To get Cell From Row
					Cell cell = row.getCell(cellnum);

					// To Define Cell Type
					CellType cellType = cell.getCellType();

					String value=null;

					switch (cellType) {
					case STRING:
						value = cell.getStringCellValue();

						break;

					case NUMERIC:

						if (DateUtil.isCellDateFormatted(cell)) {

							Date dateCellValue = cell.getDateCellValue();
							SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
							value = simpleDateFormat.format(dateCellValue);

						} else {

							double numericCellValue = cell.getNumericCellValue();
							BigDecimal valueOf = BigDecimal.valueOf(numericCellValue);
							value = valueOf.toString();

						}

						break;

					default:
						System.out.println("In Valid Cell Type");

						break;
					}

					return value;
				}

				public String getText(WebElement element) {
					String text = element.getText();
					
					return text;
				}
				public void getWindowMaximize() {
					// TODO Auto-generated method stub
					
				}
				
}
