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
WebUI.comment('1.点击对应的数字页')

'预期结果1'
WebUI.comment('1.可以成功跳转到对应的数字页')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2产品信息页-第二页按钮'))

WebUI.delay(10)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 16-30产品信息页-展示16-30'), 5)

'测试步骤2'
WebUI.comment('2.点击上一页按钮')

'预期结果2'
WebUI.comment('2.可以成功跳转到对应页')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/svg产品信息页-上一页按钮'))

WebUI.delay(10)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 1-15产品信息页-展示1-15'), 5)

'测试步骤3'
WebUI.comment('3.点击下一页按钮')

'预期结果3'
WebUI.comment('3.可以成功跳转到对应页')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/svg产品信息页-下一页按钮'))

WebUI.delay(10)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 16-30产品信息页-展示16-30'), 5)

'测试步骤4'
WebUI.comment('4.点击第一页按钮')

'预期结果4'
WebUI.comment('4.可以成功跳转到第一页')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_1产品信息页-第一页按钮'))

WebUI.delay(10)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 1-15产品信息页-展示1-15'), 5)

'测试步骤5'
WebUI.comment('5.点击最后一页按钮')

'预期结果5'
WebUI.comment('5.可以成功跳转到最后一页')

'测试步骤6'
WebUI.comment('6.点击向后5页按钮')

'预期结果6'
WebUI.comment('6.跳转正确')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_1产品信息页-第一页按钮'))

WebUI.delay(10)

'检查是否跳转正确'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 1-15产品信息页-展示1-15'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/span_向后5页'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_ 76-90产品信息页-展示76-90'), 0)

