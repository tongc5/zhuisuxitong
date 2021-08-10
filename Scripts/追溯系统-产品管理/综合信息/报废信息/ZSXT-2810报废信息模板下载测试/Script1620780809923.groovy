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
import org.openqa.selenium.Keys as Keys

'测试步骤1'
WebUI.comment('1.点击模板下载，打开下载文件')

'预期结果1'
WebUI.comment('1.可正常打开')

'测试步骤2'
WebUI.comment('2.确认模板内字段')

'预期结果2'
WebUI.comment('2.与列表一致')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/div_报废信息'))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_模板下载'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.waitForImagePresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/图片元素/报废信息下载成功'), 0)

WebUI.verifyImagePresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/图片元素/报废信息下载成功'))

