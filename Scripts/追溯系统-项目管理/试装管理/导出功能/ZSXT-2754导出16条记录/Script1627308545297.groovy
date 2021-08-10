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
WebUI.comment('1.搜索出16条记录，点击导出按钮')

'预期结果1'
WebUI.comment('1.导出记录成功，导出的excel记录可以成功打开，并且记录正确')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), trynum)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_导出'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_导出'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.verifyElementPresent(findTestObject('追溯系统/下载/div_试装导出完成'), 0)

