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
WebUI.comment('1.风险编号支持模糊搜索')

'预期结果1'
WebUI.comment('1.风险编号支持模糊搜索')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/批量导入风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险编号搜索框'), GlobalVariable.risk_num1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/td_风险编号2020'), 5)

'测试步骤2'
WebUI.comment('2.输入存在的风险编号可以搜索到数据')

'预期结果2'
WebUI.comment('2.输入存在的风险编号可以搜索到数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险编号搜索框'), GlobalVariable.risk_num)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/td_风险编号20201031'), 5)

'测试步骤3'
WebUI.comment('3.输入不存在的风险编号搜索不到数据')

'预期结果3'
WebUI.comment('3.输入不存在的风险编号搜索不到数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险编号搜索框'), GlobalVariable.risk_num_NotExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/p_风险信息暂无数据'), 5)

WebUI.comment('删除风险信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/删除风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

