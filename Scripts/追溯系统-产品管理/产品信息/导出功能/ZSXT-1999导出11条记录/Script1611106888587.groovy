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
WebUI.comment('1.搜索出11条记录,点击导出按钮')

'预期结果1'
WebUI.comment('1.导出记录成功，导出的excel记录可以成功打开，并且记录正确')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path5)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功11条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000001')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000002')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000003')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000004')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000005')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000006')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000007')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000008')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000009')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000010')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), Keys.chord(Keys.ENTER))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/textarea_产品ID批量查询'), '2200000000000011')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_2200000000000001'), 5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_2200000000000002'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_导出按钮'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_导出按钮'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.verifyElementPresent(findTestObject('追溯系统/下载/div_产品导出完成'), 0)

