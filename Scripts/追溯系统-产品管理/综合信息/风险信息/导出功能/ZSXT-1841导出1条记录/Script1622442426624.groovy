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
WebUI.comment('1.搜索出1条记录，点击导出按钮')

'预期结果1'
WebUI.comment('1.导出记录成功，导出的excel记录可以成功打开，并且记录正确')

'测试步骤2'
WebUI.comment('2.检查导出字段')

'预期结果2'
WebUI.comment('2.物料编码，产品ID，机种名称，设备机号，单据编号，日期，工时费，交通费，差旅费，其他费，备注，合计，税率，计税，附件下载地址')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/批量导入风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/a_2200000000000001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_导出'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_导出'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.verifyElementPresent(findTestObject('追溯系统/下载/div_风险导出完成'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/风险信息/通用脚本/删除风险信息'), [:], FailureHandling.STOP_ON_FAILURE)

