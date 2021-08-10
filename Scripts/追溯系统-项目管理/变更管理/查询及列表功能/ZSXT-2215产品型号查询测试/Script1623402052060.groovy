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
WebUI.comment('1.输入存在的产品型号查询')

'预期结果1'
WebUI.comment('1.查询出对应的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_产品型号搜索框'), GlobalVariable.product_model)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

'检查是否查询到变更信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_产品型号第一行数据包含product_model'), 0)

'测试步骤2'
WebUI.comment('2.输入不存在的产品型号查询')

'预期结果2'
WebUI.comment('2.查询不出数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_产品型号搜索框'), GlobalVariable.model_name_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

'检查是否查询到变更信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/p_变更管理暂无数据'), 5)

'测试步骤3'
WebUI.comment('3.产品型号支持模糊查询')

'预期结果3'
WebUI.comment('3.产品型号支持模糊查询')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_产品型号搜索框'), GlobalVariable.model_name1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

'检查是否查询到变更信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_产品型号第一行数据包含product_model'), 5)

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

