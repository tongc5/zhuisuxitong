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
WebUI.comment('1.输入框未输入，点击清除')

'预期结果1'
WebUI.comment('1.清除，无异常')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/状态搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/更换后产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/是否索赔搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障标签搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障现象搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/代理商搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/标注搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/华兴处理人搜索框'), 'value', '', 0)

'测试步骤2'
WebUI.comment('2.每个输入框，输入，点击清除')

'预期结果2'
WebUI.comment('2.可正常清除')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), GlobalVariable.device_num)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/状态搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_状态勾选框-待更换'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/更换后产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_责任归属-华兴'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/是否索赔搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_是否索赔-未索赔'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障标签搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_故障标签-保养异常'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障现象搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_故障现象-保养提示异常'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/代理商搜索框'), GlobalVariable.supplier_name)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/标注搜索框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/华兴处理人搜索框'), GlobalVariable.username)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.delay(2)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/状态搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/更换后产品ID搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/是否索赔搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障标签搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障现象搜索框 - 第一个选项'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/代理商搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/标注搜索框'), 'value', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/华兴处理人搜索框'), 'value', '', 0)

