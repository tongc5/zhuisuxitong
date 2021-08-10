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
WebUI.comment('1.数字页切换查询')

'预期结果1'
WebUI.comment('1.可以成功跳转到对应的数字页')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理页-第二页按钮'))

WebUI.delay(5)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示16-30'), 5)

'测试步骤2'
WebUI.comment('2.点击上一页按钮')

'预期结果2'
WebUI.comment('2.可以成功跳转到对应页')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理页-上一页按钮'))

WebUI.delay(5)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示1-15'), 5)

'测试步骤3'
WebUI.comment('3.点击下一页按钮')

'预期结果3'
WebUI.comment('3.可以成功跳转到对应页')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理页-下一页按钮'))

WebUI.delay(5)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示16-30'), 5)

'测试步骤4'
WebUI.comment('4.点击第一页按钮')

'预期结果4'
WebUI.comment('4.可以成功跳转到第一页')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理页-第一页按钮'))

WebUI.delay(5)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示1-15'), 5)

'测试步骤5'
WebUI.comment('5.点击最后一页按钮')

'预期结果5'
WebUI.comment('5.可以成功跳转到最后一页')

'测试步骤6'
WebUI.comment('6.点击向后5页按钮')

'预期结果6'
WebUI.comment('6.跳转正确')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理页-第一页按钮'))

WebUI.delay(5)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示1-15'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_变更管理页-向后5页按钮'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/li_变更管理页-展示76-90'), 0)

