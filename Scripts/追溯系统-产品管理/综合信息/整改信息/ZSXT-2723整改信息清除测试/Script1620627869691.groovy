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
WebUI.comment('1.输入框清除')

'预期结果1'
WebUI.comment('1.输入框清除')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_整改信息'))

WebUI.delay(10)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), variable_test)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/主机机号搜索框'), variable_test)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__机种名称搜索框'), variable_test)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input_整改人员搜索框'), variable_test)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改时间搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/span_今天'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改编码搜索框'), variable_test)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.comment('检查搜索框是否清空')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/主机机号搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__机种名称搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input_整改人员搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改时间搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改编码搜索框'), 'value', '', 0)

