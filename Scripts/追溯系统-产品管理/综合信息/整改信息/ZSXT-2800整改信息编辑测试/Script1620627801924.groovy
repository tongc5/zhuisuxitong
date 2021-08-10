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
WebUI.comment('1.同录入测试')

'预期结果1'
WebUI.comment('1.同录入测试')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/导入整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/查询整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/整改信息第一行勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_编辑'))

WebUI.delay(GlobalVariable.wait_short)

'测试步骤2'
WebUI.comment('产品ID不允许修改')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input_产品ID输入框'), 'value', GlobalVariable.product_Id, 
    0)

'测试步骤7'
WebUI.comment('查看录入字段机型名称')

'预期结果7'
WebUI.comment('有必填标志')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/input__机种名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/录入/div_请输入机种名称'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_编辑-取消'))

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/删除整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

