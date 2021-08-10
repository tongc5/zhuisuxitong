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
WebUI.comment('1.状态下拉框选择单个状态查询')

'预期结果1'
WebUI.comment('1.可以查询处对应的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_状态选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-紧急变更'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

status1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_状态第一行数据'), 'title')

WebUI.verifyMatch(status1, status_jinji, false)

'测试步骤2'
WebUI.comment('2.选择多个状态查询')

'预期结果2'
WebUI.comment('2.可以查询出对应的数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_状态选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-评审通过'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

status2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_状态第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.betweenTwoString'(status_jinji, status_pingshen, status2)

'测试步骤3'
WebUI.comment('3.选择所有状态查询')

'预期结果3'
WebUI.comment('3.可以查询出所有状态的数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_状态选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-测试中'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-试装中'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-完成'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-跟踪'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_状态-中止'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

status3 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_状态第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.inStrings'((([status_jinji, status_pingshen, status_ceshi, status_shizhuang, status_wancheng
            , status_genzong, status_zhongzhi]) as String[]), status3)

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

