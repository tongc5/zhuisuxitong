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
WebUI.comment('1.输入14位产品ID')

'预期结果1'
WebUI.comment('1.提示必须输入15或者16位的数字')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_录入'))

WebUI.delay(2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), GlobalVariable.product_Id_14)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_更换后ID长度为15-16位'), 0)

'测试步骤2'
WebUI.comment('2.输入15位产品ID')

'预期结果2'
WebUI.comment('2.没有错误提示，正常提交')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), GlobalVariable.product_Id_15)

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_更换后ID长度为15-16位'), 0)

'测试步骤3'
WebUI.comment('3.输入16位产品ID')

'预期结果3'
WebUI.comment('3.没有错误提示，正常提交')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), GlobalVariable.product_Id)

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_更换后ID长度为15-16位'), 0)

'测试步骤4'
WebUI.comment('4.输入17位产品ID')

'预期结果4'
WebUI.comment('4.提示必须输入15或者16位的数字')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), GlobalVariable.profuct_Id_17)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input_更换后ID输入框'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/button_取消'))

