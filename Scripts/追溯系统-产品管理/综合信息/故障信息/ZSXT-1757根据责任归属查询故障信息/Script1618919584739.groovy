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
WebUI.comment('1.依次选择每个责任归属，点击查询')

'预期结果1'
WebUI.comment('1.下方结果列表显示对应责任归属的信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/批量导入'), GlobalVariable.breakdown_info)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_导入成功1条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_华兴'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属第一行数据'), 'title', '华兴', 0)

'测试步骤2'
WebUI.comment('2.点击多个责任归属，点击查询')

'预期结果2'
WebUI.comment('2.下方结果列表显示对应多个责任归属的信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_华兴'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_供方'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(5)

status1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属第一行数据'), 'title')

status2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属第二行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.betweenTwoString'('华兴', '供方', status1)

CustomKeywords.'custom.sampleKeywords.betweenTwoString'('华兴', '供方', status2)

'测试步骤3'
WebUI.comment('3.输入不存在的责任归属')

'预期结果3'
WebUI.comment('3.下拉框无责任归属可供选择')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框-输入'), 'test001')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/p_状态栏暂无数据'), 0)

'测试步骤4'
WebUI.comment('4.输入存在的责任归属，比如华兴')

'预期结果4'
WebUI.comment('4.下拉框显示输入字符的责任归属，比如华兴，非华兴')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/责任归属搜索框-输入'), '华兴')

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_华兴'), 0)

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

