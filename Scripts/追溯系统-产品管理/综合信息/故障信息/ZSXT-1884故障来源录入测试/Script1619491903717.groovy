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
WebUI.comment('1.查看故障来源输入项')

'预期结果1'
WebUI.comment('1.有必填标志')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_录入'))

WebUI.delay(2)

'测试步骤2'
WebUI.comment('2.为空录入')

'预期结果2'
WebUI.comment('2.提示必填')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_故障来源选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/li_故障来源-电话故障'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/svg故障来源清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_请输入故障来源'), 0)

'测试步骤3'
WebUI.comment('3.下拉框中选择')

'预期结果3'
WebUI.comment('3.可选中')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_故障来源选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/li_故障来源-电话故障'), FailureHandling.STOP_ON_FAILURE)

'测试步骤4'
WebUI.comment('4.输入下拉框中不存在')

'预期结果4'
WebUI.comment('4.不能输入')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/svg故障来源清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_故障来源选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障来源输入框'), 'test001')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__客户类别输入框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_故障来源选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障来源输入框'), 'value', '', 0)

'测试步骤5'
WebUI.comment('5.输入下拉框中已存在的字段')

'预期结果5'
WebUI.comment('5.支持模糊查询')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_故障来源选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障来源输入框'), '电话')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/li_故障来源-电话故障'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/button_取消'), FailureHandling.STOP_ON_FAILURE)

