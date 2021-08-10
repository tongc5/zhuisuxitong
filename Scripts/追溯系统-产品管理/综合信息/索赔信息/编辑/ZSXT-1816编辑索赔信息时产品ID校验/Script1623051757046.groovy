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

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/批量导入索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/a_2200000000000001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__索赔信息第一行勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_编辑'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/input_产品ID输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.comment('产品ID不允许修改')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/input_产品ID输入框'), 'value', GlobalVariable.product_Id, 
    0)

'测试步骤2'
WebUI.comment('2.产品ID为只能15或16位校验')

'预期结果2'
WebUI.comment('2.产品ID为只能15或16位校验')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/button_编辑-取消'))

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/删除索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

