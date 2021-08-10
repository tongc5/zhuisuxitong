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
WebUI.comment('1.输入存在的开始时间查询')

'预期结果1'
WebUI.comment('1.查询出对应的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/批量导入试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__开始时间搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input_开始时间搜索框输入'), GlobalVariable.try_startTime)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

try_startTime = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/试装管理/td_开始时间第一行数据'), 'title')

WebUI.verifyEqual(try_startTime, GlobalVariable.try_startTime)

'测试步骤2'
WebUI.comment('2.输入不存在的开始时间查询')

'预期结果2'
WebUI.comment('2.查询不出数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__开始时间搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input_开始时间搜索框输入'), GlobalVariable.try_startTime_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/p_试装管理暂无数据'), 5)

WebUI.comment('删除试装信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

