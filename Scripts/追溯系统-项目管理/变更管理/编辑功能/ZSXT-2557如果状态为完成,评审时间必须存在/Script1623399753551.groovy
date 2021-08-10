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
import org.openqa.selenium.Keys as Keys

'测试步骤1'
WebUI.comment('1.如果状态为完成，评审时间必须存在')

'预期结果1'
WebUI.comment('1.如果状态为完成，评审时间必须存在')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/查询变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理第一行选择框'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_编辑'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/div_状态选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/li_状态-完成'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/button_编辑-确定'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/div_请输入实际完成时间'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/button_编辑-取消'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

