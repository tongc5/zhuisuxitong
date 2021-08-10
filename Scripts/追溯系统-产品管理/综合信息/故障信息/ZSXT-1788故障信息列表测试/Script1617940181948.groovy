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
WebUI.comment('1.查看输入框下方列表')

'预期结果1'
WebUI.comment('1.展示正常，字段无错位')

'测试步骤2'
WebUI.comment('2.查看显示字段')

'预期结果2'
WebUI.comment('2.与描述里的表格一致')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/th_产品ID列'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_产品类别列'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_机种名称列'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_故障类别列'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_故障标签列'), 0)

'测试步骤3'
WebUI.comment('3.查看默认排序')

'预期结果3'
WebUI.comment('3.按故障日期降序排序')

date1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障日期第一行数据'), 'title')

date2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障日期第二行数据'), 'title')

int flag = CustomKeywords.'custom.sampleKeywords.dateCompare'(date2, date1)

WebUI.verifyEqual(flag, 1)

'测试步骤4'
WebUI.comment('4.点击其他字段')

'预期结果4'
WebUI.comment('4.按照点击的字段排序')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/svg工作时间排序'))

WebUI.delay(2)

count1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/工作时间第一行数据'), 'title')

count2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/工作时间第二行数据'), 'title')

int num1 = Integer.parseInt(count1)

int num2 = Integer.parseInt(count2)

WebUI.verifyLessThanOrEqual(num1, num2)

'测试步骤5'
WebUI.comment('5.点击页码')

'预期结果5'
WebUI.comment('5.列表数据转到相应页面')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/a_2第二页'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/li_ 16-30'), 0)

