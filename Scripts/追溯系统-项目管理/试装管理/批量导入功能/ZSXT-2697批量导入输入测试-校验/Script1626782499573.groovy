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
WebUI.comment('1.非空校验')

'预期结果1'
WebUI.comment('1.试装编码、试装名称、变更编码')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path4)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_试装编码不能为空'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_试装名称不能为空'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path6)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_变更编码不能为空'), 0)

'测试步骤2'
WebUI.comment('2.是否已存在')

'预期结果2'
WebUI.comment('2.试装编码、试装名称、变更编码')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), GlobalVariable.tryName1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

if (CustomKeywords.'custom.sampleKeywords.whetherElementsExist'(findTestObject('追溯系统/业务管理/项目管理/试装管理/td_试装名称test0001'))) {
    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'))

    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'))

    WebUI.delay(2)
}

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功1条'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path7)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_试装编码已存在'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path8)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_试装名称已存在'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path9)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_变更编码已存在'), 0)

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

