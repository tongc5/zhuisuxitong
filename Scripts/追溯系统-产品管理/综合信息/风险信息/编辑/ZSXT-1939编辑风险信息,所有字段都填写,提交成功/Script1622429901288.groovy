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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
'测试步骤1'
WebUI.comment('1.所有信息都是必填项，直接提交成功')

'预期结果1'
WebUI.comment('1.编辑成功，产品ID输入该ID可以查询到该条数据')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/批量导入风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/a_2200000000000001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险信息第一行勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_编辑'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input__机种名称输入框'), GlobalVariable.model_name1)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input_风险原因输入框'), risk_reason2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input__对策情况输入框'), countermeasureCondition2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input__风险编号输入框'), risk_num2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input__故障现象输入框'), breakdownPhenomenon2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/input__对策内容输入框'), countermeasureContent2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/录入/button_录入确定'))

WebUI.delay(3)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/a_2200000000000001'), 5)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/删除风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

