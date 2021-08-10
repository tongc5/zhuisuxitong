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
WebUI.comment('1.进入产品管理-综合信息-索赔信息页面，录入索赔信息，有预期结果1')

'预期结果1'
WebUI.comment('1.日期为必填项，默认为当天，可编辑')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/div_索赔信息'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_录入'))

String datestr = new Date().format('yyyy-MM-dd')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/input__索赔日期输入框'), 'value', datestr, 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/编辑/button_编辑-取消'))

'测试步骤2'
WebUI.comment('2.从不同入口进入控制台界面录入索赔信息，有预期结果2')

'预期结果2'
WebUI.comment('2.日期为必填项，默认为当天')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2200000000000001'))

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/索赔/div_索赔'))

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/索赔/button_添加'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/索赔/button_添加'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/索赔/input__索赔日期'), 'value', datestr, 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/索赔/button_录入取消'))

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/产品控制台返回'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/产品控制台返回'))

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/删除产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

