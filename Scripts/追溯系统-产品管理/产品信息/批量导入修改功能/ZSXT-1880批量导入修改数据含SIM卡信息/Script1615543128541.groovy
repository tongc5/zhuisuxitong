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
WebUI.comment('1.导入数据的SIM卡信息为存在的，检查SIM卡管理-详细信息处')

'预期结果1'
WebUI.comment('1.需要将导入数据中的产品信息中的产品ID、SIM卡号，机种名称，供应商信息更新到SIM卡信息中')

WebUI.comment('批量导入SIM卡信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/span_SIM卡管理'))

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/a_详细信息'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/SIM管理/详细信息/批量导入'), GlobalVariable.simInfo_path)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/SIM管理/详细信息/导入成功一条'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入修改'), GlobalVariable.productInfo_path)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/span_SIM卡管理'))

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/a_详细信息'))

WebUI.delay(5)

WebUI.setText(findTestObject('追溯系统/业务管理/SIM管理/详细信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/SIM管理/详细信息/ICCID搜索框'), GlobalVariable.sim_Id)

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/button_查询按钮'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/SIM管理/详细信息/td_第一行数据对应的机种名称列'), 'title', GlobalVariable.model_name, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/SIM管理/详细信息/第一行数据对应的供应商名称列'), 'title', GlobalVariable.supplier_name, 
    0)

'测试步骤2'
WebUI.comment('2.导入数据中SIM卡信息为新的，检查SIM卡管理-详细信息处')

'预期结果2'
WebUI.comment('2.自动新增一条SIM卡信息')

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/SIM卡信息全选框'))

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/button_删除按钮'))

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/SIM管理/详细信息/a_2200000000000001'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入修改'), GlobalVariable.productInfo_path)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/span_SIM卡管理'))

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/a_详细信息'))

WebUI.delay(5)

WebUI.setText(findTestObject('追溯系统/业务管理/SIM管理/详细信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.setText(findTestObject('追溯系统/业务管理/SIM管理/详细信息/ICCID搜索框'), GlobalVariable.sim_Id)

WebUI.click(findTestObject('追溯系统/业务管理/SIM管理/详细信息/button_查询按钮'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/SIM管理/详细信息/a_2200000000000001'), 0)

