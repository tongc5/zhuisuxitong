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
WebUI.comment('1.测试信息显示正确')

'预期结果1'
WebUI.comment('1.测试信息显示正确')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-项目管理/测试管理/通用功能/批量导入测试信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理'))

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/查询变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_202010001'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/div_变更控制台'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/div_测试信息'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/div_测试人员tc'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/button_返回'))

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/测试管理/a_测试管理'))

WebUI.callTestCase(findTestCase('追溯系统-项目管理/测试管理/通用功能/删除测试信息'), [:], FailureHandling.STOP_ON_FAILURE)

