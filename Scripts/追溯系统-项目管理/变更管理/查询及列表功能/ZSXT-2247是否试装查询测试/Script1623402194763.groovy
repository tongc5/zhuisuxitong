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
WebUI.comment('1.是否试装下拉框选择单个查询')

'预期结果1'
WebUI.comment('1.查询出对应的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_是否试装选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_是否试装-是'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

try1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_是否试装第一行数据'), 'title')

WebUI.verifyMatch(try1, try_yes, false)

'测试步骤2'
WebUI.comment('2.选择多个查询')

'预期结果2'
WebUI.comment('2.可以查询出对应的数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_是否试装选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_是否试装-否'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

try2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_是否试装第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.betweenTwoString'(try_yes, try_no, try2)

'测试步骤3'
WebUI.comment('3.选择所有查询')

'预期结果3'
WebUI.comment('3.可以查询出所有的数据')

'预期结果3'
WebUI.comment('是/否已包含全部条件')

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

