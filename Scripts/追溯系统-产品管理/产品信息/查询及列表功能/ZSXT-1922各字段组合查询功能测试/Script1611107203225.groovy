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
WebUI.comment('1.在物料编码文本框中输入对应的物料编码,在产品ID输入对应的产品ID,点击查询按钮')

'预期结果1'
WebUI.comment('1.可以查询到正确的数据')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.product_Id)

WebUI.delay(2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input__ant-input物料编码搜索框'), GlobalVariable.material_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_2200000000000001'), 5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_240703000013A物料编码元素'), 0)

'测试步骤2'
WebUI.comment('2.物料编码、机种名称、SIM卡类型、客户流向等各种组合查询')

'预期结果2'
WebUI.comment('2.可以查询到正确的数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input__ant-input物料编码搜索框'), GlobalVariable.material_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input__ant-input机种名称搜索框'), GlobalVariable.model_name)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.sim_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_240703000013A物料编码元素'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_SEED-10IA-55机种名称元素'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_11111111111_SIM卡元素'), 0)

