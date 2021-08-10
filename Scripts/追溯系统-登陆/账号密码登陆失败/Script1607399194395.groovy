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

WebUI.openBrowser(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.comment('输入登陆信息')

WebUI.click(findTestObject('追溯系统/登陆页/div_账号密码'))

WebUI.setText(findTestObject('追溯系统/登陆页/input__账户密码_loginName'), GlobalVariable.username)

WebUI.setText(findTestObject('追溯系统/登陆页/input_账户密码_password'), GlobalVariable.password)

WebUI.click(findTestObject('追溯系统/登陆页/button_登陆'))

WebUI.waitForPageLoad(5)

'校验是否登陆成功'
WebUI.verifyElementNotPresent(findTestObject('追溯系统/首页/li_首页'), 3)

WebUI.closeBrowser()

