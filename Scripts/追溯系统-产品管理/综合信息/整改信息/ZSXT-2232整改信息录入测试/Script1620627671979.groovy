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
WebUI.comment('1.查看录入字段产品ID')

'预期结果1'
WebUI.comment('1.有必填标志')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_整改信息'))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_录入'))

'测试步骤2'
WebUI.comment('2.产品ID不填')

'预期结果2'
WebUI.comment('2.报错，提示必须录入')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/button_录入-确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_请输入产品ID'), 0)

'测试步骤3'
WebUI.comment('3.输入14位产品ID')

'预期结果3'
WebUI.comment('3.报错，提示产品ID为15位或16位')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), GlobalVariable.product_Id_14)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_产品ID必须为15或16位'), 0)

'测试步骤4'
WebUI.comment('4.输入15位产品ID')

'预期结果4'
WebUI.comment('4.可录入')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), GlobalVariable.product_Id_15)

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_产品ID必须为15或16位'), 0)

'测试步骤5'
WebUI.comment('5.输入16位产品ID')

'预期结果5'
WebUI.comment('5.可录入')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), GlobalVariable.product_Id)

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_产品ID必须为15或16位'), 0)

'测试步骤6'
WebUI.comment('6.输入17位产品ID')

'预期结果6'
WebUI.comment('6.报错，提示产品ID为15位或16位')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), GlobalVariable.profuct_Id_17)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_产品ID必须为15或16位'), 0)

'测试步骤7'
WebUI.comment('7.查看录入字段机型名称')

'预期结果7'
WebUI.comment('7.有必填标志')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/button_录入-取消'))

