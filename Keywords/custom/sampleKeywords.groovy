package custom
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable


import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class sampleKeywords {
	/**
	 * Refresh browser
	 */
	@Keyword
	def refreshBrowser() {
		KeywordUtil.logInfo("Refreshing")
		WebDriver webDriver = DriverFactory.getWebDriver()
		webDriver.navigate().refresh()
		KeywordUtil.markPassed("Refresh successfully")
	}

	/**
	 * Click element
	 * @param to Katalon test object
	 */
	@Keyword
	def clickElement(TestObject to) {
		try {
			WebElement element = WebUiBuiltInKeywords.findWebElement(to);
			KeywordUtil.logInfo("Clicking element")
			element.click()
			KeywordUtil.markPassed("Element has been clicked")
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markFailed("Element not found")
		} catch (Exception e) {
			KeywordUtil.markFailed("Fail to click on element")
		}
	}

	/**
	 * Get all rows of HTML table
	 * @param table Katalon test object represent for HTML table
	 * @param outerTagName outer tag name of TR tag, usually is TBODY
	 * @return All rows inside HTML table
	 */
	@Keyword
	def List<WebElement> getHtmlTableRows(TestObject table, String outerTagName) {
		WebElement mailList = WebUiBuiltInKeywords.findWebElement(table)
		List<WebElement> selectedRows = mailList.findElements(By.xpath("./" + outerTagName + "/tr"))
		return selectedRows
	}
	/**
	 * Compare date
	 * @param  date1
	 * @param  date2
	 * date1<=date2,return 1
	 */
	@Keyword
	def dateCompare(String date1,String date2) {
		try {
			String[] str1,str2
			str1 = date1.split('-')
			str2 = date2.split('-')
			KeywordUtil.logInfo("Compare date")
			int date1_year = Integer.parseInt(str1[0])
			int date1_month = Integer.parseInt(str1[1])
			int date1_day = Integer.parseInt(str1[2])
			int date2_year = Integer.parseInt(str2[0])
			int date2_month = Integer.parseInt(str2[1])
			int date2_day = Integer.parseInt(str2[2])
			if (date1_year<date2_year){
				KeywordUtil.markPassed("compare success")
				return 1
			}
			if(date1_year==date2_year){
				if (date1_month<date2_month){
					KeywordUtil.markPassed("compare success")
					return 1
				}
				if(date1_month==date2_month){
					if(date1_day<=date2_day){
						KeywordUtil.markPassed("compare success")
						return 1
					}
				}
			}
			KeywordUtil.markPassed("compare success")
			return 0
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop("compare failed")
		}
	}
	/**
	 * Determine whether the string is between two strings
	 * @param  str1
	 * @param  str2
	 * @param  toBeCompared
	 */
	@Keyword
	def betweenTwoString(String str1,String str2,String toBeCompared) {
		try {
			if (str1==toBeCompared||str2==toBeCompared){
				KeywordUtil.markPassed(toBeCompared + 'is equal ' + str1 + ' or '+ str2)
			}
			else{
				KeywordUtil.markFailedAndStop(toBeCompared + ' not equal ' + str1 + ' or '+ str2)
			}
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop(toBeCompared + ' not equal ' + str1 + ' or '+ str2)
		}
	}
	/**
	 * Determine whether the string is between two strings
	 * @param  str1[]
	 * @param  str
	 */
	@Keyword
	def inStrings(String[] str1,String str) {
		try {
			if (str in str1){
				KeywordUtil.markPassed(str + '在 '+ str1 + '里')
			}
			else{
				KeywordUtil.markFailedAndStop(str + '不在 '+ str1 + '里')
			}
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop(str + '不在 '+ str1 + '里')
		}
	}
	/**
	 * Determine whether the string in strings
	 * @param str1 string1
	 * @param st1 the string which contains in string1 
	 */
	@Keyword
	def containStr(String str1,String st1) {
		try {
			if (str1.indexOf(st1)!=-1){
				KeywordUtil.markPassed(str1 + 'contains ' + st1)
			}
			else{
				KeywordUtil.markFailedAndStop(str1 + 'not contains ' + st1)
			}
		} catch (Exception e) {
			KeywordUtil.markFailedAndStop(str1 + 'not contains ' + st1)
		}
	}
	/**
	 * Determine whether page elements exist
	 * @param to Determine
	 */
	@Keyword
	def whetherElementsExist(TestObject obj) {
		try {
			WebElement elements = WebUiBuiltInKeywords.findWebElement(obj)
			KeywordUtil.logInfo("111")
			KeywordUtil.logInfo("元素存在")
			KeywordUtil.markPassed("元素存在，返回true")
			return true
		} catch (WebElementNotFoundException e) {
			KeywordUtil.markPassed("元素不存在,返回false")
			return false
		} catch (Exception e) {
			KeywordUtil.markPassed("元素不存在,返回false")
			return false
		}
	}
}