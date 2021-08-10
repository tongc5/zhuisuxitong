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
WebUI.comment('1.查询列输入所有信息，点击清除按钮，清除成功')

'预期结果1'
WebUI.comment('1.可以清除成功')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/div_索赔信息'))

WebUI.delay(5)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_物料编码搜索框'), GlobalVariable.material_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__机种名称搜索框'), GlobalVariable.model_name)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__设备机号搜索框'), GlobalVariable.device_num)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__单据编号搜索框'), bill_num)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__开始日期搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__开始日期输入框'), GlobalVariable.start_date)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/div_31'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_清除'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_物料编码搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__机种名称搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__设备机号搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__单据编号搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input__开始日期搜索框'), 'value', '', 0)

