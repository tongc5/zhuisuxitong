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
WebUI.comment('1.产品ID非空校验')

'预期结果1'
WebUI.comment('1.产品ID非空校验')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/div_索赔信息'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_录入'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/button_编辑-确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/录入/div_请输入产品ID'), 0)

'测试步骤2'
WebUI.comment('2.产品ID为只能15或16位校验')

'预期结果2'
WebUI.comment('2.产品ID为只能15或16位校验')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/input_产品ID输入框'), GlobalVariable.product_Id_14)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/录入/div_产品ID必须为15或者16位有效数'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/button_编辑-取消'))

