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
WebUI.comment('1.产品ID输入框输入存在的产品ID，查询')

'预期结果1'
WebUI.comment('1.列表显示对应产品ID的整改信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/导入整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/a_2200000000000001'), 0)

'测试步骤2'
WebUI.comment('1.输入不存在的产品ID，查询')

'预期结果2'
WebUI.comment('2.列表无数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), GlobalVariable.product_Id_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/p_整改信息暂无数据'), 0)

'测试步骤3'
WebUI.comment('3.输入存在的产品ID的部分，查询')

'预期结果3'
WebUI.comment('3.列表显示包含输入的产品ID的所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), GlobalVariable.product_Id1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/a_包含22000'), 0)

'测试步骤4'
WebUI.comment('4.产品ID不输入，为空，查询')

'预期结果4'
WebUI.comment('4.列表显示所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/li_整改信息展示'), 0)

'测试步骤5'
WebUI.comment('5.设备机号输入框输入存在的设备机号，查询')

'预期结果5'
WebUI.comment('5.列表显示对应设备机号的整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/主机机号搜索框'), GlobalVariable.device_num)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_主机机号第一行数据'), 'title', GlobalVariable.device_num, 
    0)

'测试步骤6'
WebUI.comment('6.输入不存在的设备机号，查询')

'预期结果6'
WebUI.comment('6.列表无数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/主机机号搜索框'), GlobalVariable.device_num_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/p_整改信息暂无数据'), 0)

'测试步骤7'
WebUI.comment('7.输入存在的设备机号的部分，查询')

'预期结果7'
WebUI.comment('7.列表显示包含输入的设备机号的所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/主机机号搜索框'), GlobalVariable.device_num1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_主机机号包含DX'), 0)

'测试步骤8'
WebUI.comment('8.机种名称输入框输入存在的机种名称，查询')

'预期结果8'
WebUI.comment('8.列表显示对应机种名称的整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__机种名称搜索框'), GlobalVariable.model_name)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_机种名称第一行数据'), 'title', GlobalVariable.model_name, 
    0)

'测试步骤9'
WebUI.comment('9.输入不存在的机种名称，查询')

'预期结果9'
WebUI.comment('9.列表无数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__机种名称搜索框'), GlobalVariable.model_name_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/p_整改信息暂无数据'), 0)

'测试步骤10'
WebUI.comment('10.输入存在的机种名称的部分，查询')

'预期结果10'
WebUI.comment('10.列表显示包含输入的机种名称的所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__机种名称搜索框'), GlobalVariable.model_name1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_机种名称包含SEED-10IA'), 0)

'测试步骤11'
WebUI.comment('11.整改人员输入框输入存在的整改人员，查询')

'预期结果11'
WebUI.comment('11.列表显示对应整改人员的整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input_整改人员搜索框'), GlobalVariable.abarbeitungPeople)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_整改人员第一行数据'), 'title', GlobalVariable.abarbeitungPeople, 
    0)

'测试步骤12'
WebUI.comment('12.输入不存在的整改人员，查询')

'预期结果12'
WebUI.comment('12.列表无数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input_整改人员搜索框'), GlobalVariable.abarbeitungPeople_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/p_整改信息暂无数据'), 0)

'测试步骤13'
WebUI.comment('13.输入存在的整改人员的部分，查询')

'预期结果13'
WebUI.comment('13.列表显示包含输入的整改人员的所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input_整改人员搜索框'), GlobalVariable.abarbeitungPeople1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_整改人员包含张'), 0)

'测试步骤14'
WebUI.comment('14.选择整改时间，查询')

'预期结果14'
WebUI.comment('14.列表显示对应整改时间的整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改时间搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__开始时间搜索框输入'), GlobalVariable.RectificationTime)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_31号'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_整改时间第一行数据'), 'title', GlobalVariable.RectificationTime, 
    0)

'测试步骤15'
WebUI.comment('15.整改编码输入框输入存在的整改编码，查询')

'预期结果15'
WebUI.comment('15.列表显示对应整改编码的整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改编码搜索框'), GlobalVariable.RectificationCode)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_整改编码第一行数据'), 'title', GlobalVariable.RectificationCode, 
    0)

'测试步骤16'
WebUI.comment('16.输入不存在的整改编码，查询')

'预期结果16'
WebUI.comment('16.列表无数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改编码搜索框'), GlobalVariable.RectificationCode_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/p_整改信息暂无数据'), 0)

'测试步骤17'
WebUI.comment('17.输入存在的整改编码的部分，查询')

'预期结果17'
WebUI.comment('17.列表显示包含输入的整改编码的所有整改信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/input__整改编码搜索框'), GlobalVariable.RectificationCode1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/td_整改编码包含test'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/删除整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

