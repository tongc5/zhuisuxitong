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
WebUI.comment('1.产品ID必填确认')

'预期结果1'
WebUI.comment('1.确认为必填项')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/div_报废信息'))

WebUI.delay(10)

WebUI.comment('检查是否已存在报废信息，有则删除')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_查询'))

WebUI.delay(5)

if (CustomKeywords.'custom.sampleKeywords.whetherElementsExist'(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/a_2200000000000001'))) {
    WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input__报废信息全选框'))

    WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_删除'))

    WebUI.delay(3)

    WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/p_报废信息暂无数据'), 0)
}

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/button_录入'))

WebUI.waitForElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input_产品ID输入框'), GlobalVariable.wait_short)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input_产品ID输入框'), GlobalVariable.product_Id)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/div_请输入产品ID'), 0)

'测试步骤2'
WebUI.comment('2.SIM卡号必填确认')

'预期结果2'
WebUI.comment('2.确认为必填项')

WebUI.comment('实际SIM卡号为非必填项')

'测试步骤3'
WebUI.comment('3.新增一条报废信息')

'预期结果3'
WebUI.comment('3.可新增')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input_产品ID输入框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input_SIM卡号输入框'), GlobalVariable.sim_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input__报废地点输入框'), place)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input__报废人员输入框'), person)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/input__报废时间输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/a_今天'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/录入/button_录入-确定'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/a_2200000000000001'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/报废信息/通用脚本/删除报废信息'), [:], FailureHandling.STOP_ON_FAILURE)

