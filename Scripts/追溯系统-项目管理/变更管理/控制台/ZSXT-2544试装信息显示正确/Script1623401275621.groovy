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
WebUI.comment('1.试装信息显示正确')

'预期结果1'
WebUI.comment('1.试装信息显示正确')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), try_name)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

if (CustomKeywords.'custom.sampleKeywords.whetherElementsExist'(findTestObject('追溯系统/业务管理/项目管理/试装管理/td_试装名称test0001'))) {
    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'))

    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'))

    WebUI.delay(2)
}

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功1条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理'))

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/查询变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_202010001'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/div_变更控制台'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/div_试装信息'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/td_试装编码S202010001'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/变更控制台/button_返回'))

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.comment('删除试装信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), GlobalVariable.changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

