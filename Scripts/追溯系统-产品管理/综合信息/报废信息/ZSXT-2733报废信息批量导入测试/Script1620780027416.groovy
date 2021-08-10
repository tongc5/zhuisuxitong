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
WebUI.comment('1.导入一条')

'预期结果1'
WebUI.comment('1.可正常导入')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/div_报废信息'))

WebUI.delay(10)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/报废信息/通用脚本/删除报废信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/批量导入'), GlobalVariable.Scrap_path)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/span_导入成功1条'), 0)

WebUI.delay(5)

'测试步骤2'
WebUI.comment('2.导入多条')

'预期结果2'
WebUI.comment('2.可正常导入')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/批量导入'), GlobalVariable.Scrap_path1)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/span_导入成功3条'), 0)

WebUI.delay(5)

WebUI.comment('删除导入的报废信息')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input_产品ID搜索框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), GlobalVariable.product_Id)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), GlobalVariable.product_Id002)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), GlobalVariable.product_Id003)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/textarea_产品ID批量输入框'), GlobalVariable.product_Id004)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_查询'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input__报废信息全选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_删除'))

