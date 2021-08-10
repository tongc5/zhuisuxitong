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
WebUI.comment('1.查看华兴故障核对输入项')

'预期结果1'
WebUI.comment('1.有必填标志')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_录入'))

WebUI.delay(2)

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), FailureHandling.STOP_ON_FAILURE)

'测试步骤2'
WebUI.comment('2.为空录入')

'预期结果2'
WebUI.comment('2.提示必填')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), '1')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_请输入华兴故障核对'), 0)

'测试步骤3'
WebUI.comment('3.输入5000位')

'预期结果3'
WebUI.comment('3.可填')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), string_5000)

'测试步骤4'
WebUI.comment('4.输入4999位')

'预期结果4'
WebUI.comment('4.可填')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), string_4999)

'测试步骤5'
WebUI.comment('5.输入5001位')

'预期结果5'
WebUI.comment('5.提示位数小于等于5000')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/textarea__华兴故障核对输入框'), string_5001)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_华兴故障核对长度不超过5000位'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/button_取消'), FailureHandling.STOP_ON_FAILURE)

