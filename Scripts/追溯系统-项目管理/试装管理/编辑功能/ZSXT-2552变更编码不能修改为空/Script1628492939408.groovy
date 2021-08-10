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
WebUI.comment('1.变更编码不能修改为空')

'预期结果1'
WebUI.comment('1.变更编码不能修改为空')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/批量导入试装信息'), [('try_name') : 'test0001'], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), GlobalVariable.tryName1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理第一行数据勾选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_编辑'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/试装管理/编辑/input__变更编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/编辑/button_ 编辑-确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/编辑/div_请输入变更编码'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/编辑/button_编辑-取消'))

WebUI.comment('删除试装信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

