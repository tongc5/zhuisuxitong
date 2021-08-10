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

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/div_系统管理页签'))

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/数据字典/a_数据字典'))

WebUI.delay(10)

WebUI.setText(findTestObject('追溯系统/业务管理/系统管理/数据字典/input__code数据字典代码搜索框'), GlobalVariable.dataDict_code)

WebUI.setText(findTestObject('追溯系统/业务管理/系统管理/数据字典/input__name数据字典名称搜索框'), GlobalVariable.dataDict_name)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/数据字典/button_查询按钮'))

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/数据字典/input__数据字典勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/数据字典/button_删除按钮'))

