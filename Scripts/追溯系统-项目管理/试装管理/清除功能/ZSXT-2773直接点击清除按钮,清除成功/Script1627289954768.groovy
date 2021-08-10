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
WebUI.comment('1.直接点击清除按钮，清除成功')

'预期结果1'
WebUI.comment('1.可以清除成功')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装编码搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__机种名称搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__开始时间搜索框'), 'value', '', 0)

WebUI.verifyElementText(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_试装状态选择框'), '')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装原因搜索框'), 'value', '', 0)

