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
WebUI.comment('1.设备机号输入框输入存在的设备机号，点击查询')

'预期结果1'
WebUI.comment('1.下方结果列表显示对应设备机号的信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/批量导入'), GlobalVariable.breakdown_info)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_导入成功1条'), 0)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), GlobalVariable.device_num)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/td_DX10001'), 0)

'测试步骤2'
WebUI.comment('2.在设备机号输入框输入不存在的设备机号,点击查询')

'预期结果2'
WebUI.comment('2.无结果')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), GlobalVariable.device_num_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/p_暂无数据'), 0)

'测试步骤3'
WebUI.comment('3.输入字母数字以外的字符')

'预期结果3'
WebUI.comment('3.无结果')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), '._')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/p_暂无数据'), 0)

'测试步骤4'
WebUI.comment('4.输入存在的设备机号的部分，点击查询')

'预期结果4'
WebUI.comment('4.下方结果列表显示部分对应设备机号的信息(模糊查询)')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/设备机号搜索框'), GlobalVariable.device_num1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/td_DX'), 0)

WebUI.comment('清除故障信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/a_2200000000000001'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__ant-checkbox-input故障信息勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_删除'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/p_暂无数据'), 0)

