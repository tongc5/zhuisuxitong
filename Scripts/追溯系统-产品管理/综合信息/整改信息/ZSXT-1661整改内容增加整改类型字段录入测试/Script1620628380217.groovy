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
WebUI.comment('1.打开产品管理-综合信息-整改信息页面，点击录入，有预期结果1')

'预期结果1'
WebUI.comment('1.整改录入页面增加整改类型下列框，该字段为“必填项”，录入模式为“可手动输入、可下拉选择”，可选择项有：“技改”、“整改”“测试”、“调试”、“产品改制”、“试装”、“协调”、“外销”、“信息记录”')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_整改信息'))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_录入'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/button_录入-确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_请选择整改类型'), 0)

'测试步骤2'
WebUI.comment('2.不输入整改类型，点击确定，有预期结果2')

'预期结果2'
WebUI.comment('2.前台有必填校验')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/button_录入-确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_请选择整改类型'), 0)

'测试步骤3'
WebUI.comment('3.下拉选择，有预期结果3')

'预期结果3'
WebUI.comment('3.可选择“技改”、“整改”“测试”、“调试”、“产品改制”、“试装”、“协调”、“外销”、“信息记录”，选择后点击确定可录入')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_整改类型选择框'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_技改'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_整改'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_测试'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_调试'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_产品改制'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_试装'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_协调'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_外销'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/li_信息记录'), 0)

'测试步骤4'
WebUI.comment('4.手工输入，有预期结果4')

'预期结果4'
WebUI.comment('4.只可输入“技改”、“整改”“测试”、“调试”、“产品改制”、“试装”、“协调”、“外销”、“信息记录”几个类型，其他类型输入后不生效')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input__整改类型输入框'), '技改')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/整改类型'), 'title', '技改', 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/svg整改类型清除'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_整改类型选择框'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input__整改类型输入框'), 'test111')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/整改类型'), 'title', '', 0)

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_编辑-取消'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_编辑-取消'))

