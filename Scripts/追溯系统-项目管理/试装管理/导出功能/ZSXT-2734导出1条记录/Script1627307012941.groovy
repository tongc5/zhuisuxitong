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
WebUI.comment('1.搜索出1条记录，点击导出按钮')

'预期结果1'
WebUI.comment('1.导出记录成功，导出的excel记录可以成功打开，并且记录正确')

'测试步骤2'
WebUI.comment('2.检查导出字段')

'预期结果2'
WebUI.comment('2.变更编码\n产品型号\n变更人\n变更点\n计划完成时间\n实际完成时间\n测试申请时间\n测试结果名称\n测试人员\n状态\n备注')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/批量导入试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), GlobalVariable.tryName1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

tryName1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/试装管理/td_试装名称第一行数据'), 'title')

WebUI.verifyEqual(tryName1, GlobalVariable.tryName1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_导出'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_导出'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.verifyElementPresent(findTestObject('追溯系统/下载/div_试装导出完成'), 0)

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

