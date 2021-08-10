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
WebUI.comment('1.查看列表')

'预期结果1'
WebUI.comment('1.列表字段对照描述')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/导入整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

'测试步骤2'
WebUI.comment('2.查看排序')

'预期结果2'
WebUI.comment('2.默认按照整改时间降序排序')

date1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/整改时间第一行数据'), 'title')

date2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/整改时间第二行数据'), 'title')

result = CustomKeywords.'custom.sampleKeywords.dateCompare'(date2, date1)

WebUI.verifyEqual(result, 1)

'测试步骤3'
WebUI.comment('3.点击其他字段')

'预期结果3'
WebUI.comment('3.按照点击的字段排序')

'测试步骤4'
WebUI.comment('4.点击下方页码')

'预期结果4'
WebUI.comment('4.列表跳转至对应页码数的列表')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/a_整改信息第二页'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/li_显示条目 16-30'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/删除整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

