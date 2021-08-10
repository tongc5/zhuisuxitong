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
WebUI.comment('1.选择需要删除的记录，删除成功，在回收站里面可以查看到')

'预期结果1'
WebUI.comment('1.可以看到删除的信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/批量导入风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/删除风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/div_系统管理页签'))

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/a_回收站'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/系统管理/回收站/td_类型名称第一行为风险信息'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/a_第一行数据查看'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/系统管理/回收站/input_回收站第一行数据产品ID为全局变量'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/button_关闭'))

