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
WebUI.comment('1.选择生产日期')

'预期结果1'
WebUI.comment('1.可选择，显示正确')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_录入'))

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/生产日期输入框'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/a_今天'), 0)

'测试步骤2'
WebUI.comment('2.设备机号')

'预期结果2'
WebUI.comment('2.可选择，显示正确')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__设备机号输入框'), GlobalVariable.device_num)

'测试步骤3'
WebUI.comment('3.SIM卡号')

'预期结果3'
WebUI.comment('3.可选择，显示正确')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_SIM卡号输入框'), GlobalVariable.sim_Id)

'测试步骤4'
WebUI.comment('4.回司时间')

'预期结果4'
WebUI.comment('4.可选择，显示正确')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/回司日期输入框'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/a_今天'), 0)

'测试步骤5'
WebUI.comment('5.流转接收人')

'预期结果5'
WebUI.comment('5.可选择，显示正确')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__流转接收人'), GlobalVariable.username)

'测试步骤6'
WebUI.comment('6.开机时间')

'预期结果6'
WebUI.comment('6.可选择，显示正确')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/开机日期输入框'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/a_今天'), 0)

'测试步骤7'
WebUI.comment('7.代理商')

'预期结果7'
WebUI.comment('7.可选择，显示正确')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__代理商输入框'), GlobalVariable.username)

'测试步骤8'
WebUI.comment('8.运行系统')

'预期结果8'
WebUI.comment('8.可选择，显示正确')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/运行系统'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/li_动力系统'), FailureHandling.STOP_ON_FAILURE)

'测试步骤9'
WebUI.comment('9.整机运行状态')

'预期结果9'
WebUI.comment('9.可选择，显示正确')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/整机运行状态'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/li_一直存在'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/button_取消'))

