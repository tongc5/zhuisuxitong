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
WebUI.comment('1.在SIM卡类型下拉框中选择物联网卡,点击查询按钮')

'预期结果1'
WebUI.comment('1.可以查询到正确的数据')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_SIM卡类型搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_物联网卡'))

WebUI.getAttribute(findTestObject(null), '')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_11111111111_SIM卡元素'), 5)

'测试步骤2'
WebUI.comment('2.在SIM卡类型下拉框中选择车联网卡,点击查询按钮')

'预期结果2'
WebUI.comment('2.可以查询到正确的数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.sim_Id_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品信息暂无数据'), 5)

'测试步骤3'
WebUI.comment('3.在SIM卡类型下拉框中选择消费卡,点击查询按钮')

'预期结果3'
WebUI.comment('3.可以查询到正确的数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.sim_Id1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否模糊查询成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_181111115_SIM卡元素2'), 5)

'测试步骤4'
WebUI.comment('4.在SIM卡类型下拉框中选择物联网卡、车联网卡,点击查询按钮')

'预期结果4'
WebUI.comment('4.可以查询到正确的数据')

'测试步骤5'
WebUI.comment('5.在SIM卡类型下拉框中选择物联网卡、消费卡,点击查询按钮')

'预期结果5'
WebUI.comment('5.可以查询到正确的数据')

'测试步骤6'
WebUI.comment('6.在SIM卡类型下拉框中选择车联网卡、消费卡,点击查询按钮')

'预期结果6'
WebUI.comment('6.可以查询到正确的数据')

