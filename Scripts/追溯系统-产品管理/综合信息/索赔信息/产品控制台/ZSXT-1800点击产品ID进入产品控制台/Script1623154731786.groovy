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
WebUI.comment('1.点击产品ID进入产品控制台')

'预期结果1'
WebUI.comment('1.点击产品ID进入产品控制台')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/批量导入索赔信息'), [('productId1') : '22000000000000'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/a_2200000000000001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/a_2200000000000001'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/span_产品控制台'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/产品控制台/产品控制台返回'))

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/删除索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

