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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

'测试步骤1'
WebUI.comment('1.类别下拉框选择单个类别查询')

'预期结果1'
WebUI.comment('1.可以查询处对应的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_类别选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-应用程序'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

type = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_类别第一行数据'), 'title')

WebUI.verifyMatch(type, type_app, false)

'测试步骤2'
WebUI.comment('2.选择多个类别查询')

'预期结果2'
WebUI.comment('2.可以查询出对应的数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_类别选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-图片'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

type2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_类别第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.betweenTwoString'(type_app, type_picture, type2)

'测试步骤3'
WebUI.comment('3.选择所有类别查询')

'预期结果3'
WebUI.comment('3.可以查询出所有类别的数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/div_类别选择框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-应用程序及图片'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-结构'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-主板'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-PCB'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-底层'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-工艺'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_类别-其他'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

type3 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_类别第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.inStrings'((([type_app, type_picture, type_appAndPictrue, type_stru, type_mainBoard
            , type_PCB, type_bottom, type_tech, type_other]) as String[]), type3)

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

