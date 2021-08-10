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
WebUI.comment('1.点击列表的变更编码')

'预期结果1'
WebUI.comment('1.跳转变更控制台')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/批量导入试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

'校验可以查询到数据'
WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_变更编码超链接'), FailureHandling.STOP_ON_FAILURE)

'校验可以查询到数据'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_变更控制台'), 3)

'校验可以查询到数据'
WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_返回'), FailureHandling.STOP_ON_FAILURE)

'测试步骤2'
WebUI.comment('2.点击列表的试装编码')

'预期结果2'
WebUI.comment('2.跳转单个试装控制台')

'校验可以查询到数据'
WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装编码超链接'), FailureHandling.STOP_ON_FAILURE)

'校验可以查询到数据'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_试装控制台'), 3)

'校验可以查询到数据'
WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_返回'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('删除试装信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

