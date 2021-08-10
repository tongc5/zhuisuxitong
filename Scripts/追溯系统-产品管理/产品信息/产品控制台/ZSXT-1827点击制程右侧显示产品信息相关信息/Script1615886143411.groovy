import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

'测试步骤1'
WebUI.comment('1.制程下方显示产品信息相关信息')

'预期结果1'
WebUI.comment('1.制程下方显示产品信息相关信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2200000000000001'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_制程'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_制程信息'), 0)

