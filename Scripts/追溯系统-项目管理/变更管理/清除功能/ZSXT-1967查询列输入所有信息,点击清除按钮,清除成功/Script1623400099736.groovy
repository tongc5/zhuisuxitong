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

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理'))

WebUI.delay(5)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), GlobalVariable.changeId1)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), GlobalVariable.material_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), GlobalVariable.material_Id)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_类别选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-应用程序'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_状态选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-紧急变更'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_变更人搜索框'), GlobalVariable.change_person)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_产品型号搜索框'), GlobalVariable.product_model)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_是否试装选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_是否试装-是'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__开始日期'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__开始日期输入框'), change_time)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_10'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), 'value', '', 0)

WebUI.verifyElementText(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_类别选择框'), '')

WebUI.verifyElementText(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_状态选择框'), '')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_变更人搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_产品型号搜索框'), 'value', '', 0)

WebUI.verifyElementText(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_是否试装选择框'), '')

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__开始日期'), 'value', '', 0)

