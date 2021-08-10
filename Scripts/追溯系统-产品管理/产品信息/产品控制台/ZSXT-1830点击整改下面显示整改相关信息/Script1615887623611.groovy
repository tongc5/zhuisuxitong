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
WebUI.comment('1.点击整改下面显示整改相关信息')

'预期结果1'
WebUI.comment('1.点击整改下面显示整改相关信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2200000000000001'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改标签页'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改信息'), 0)

'测试步骤2'
WebUI.comment('2.增加整改信息成功')

'预期结果2'
WebUI.comment('2.增加整改信息成功')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_整改-添加'))

WebUI.delay(2)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/input__整改后物料编码'), GlobalVariable.materialId_modify)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/input__整改原因'), GlobalVariable.rectification_reason)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/input__整改地点'), GlobalVariable.rectification_site)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改类型'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/li_技改'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_新增-确定'))

WebUI.delay(3)

'测试步骤3'
WebUI.comment('3.编辑整改信息成功')

'预期结果3'
WebUI.comment('3.编辑整改信息成功')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/整改信息第一行勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_整改-编辑'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/input__整改原因'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/input__整改原因'), GlobalVariable.rectification_reason2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_新增-确定'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/td_整改原因reason002'), 0)

'测试步骤5'
WebUI.comment('5.导出整改信息成功')

'预期结果5'
WebUI.comment('5.导出整改信息成功')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_整改-导出'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改导出完成'), 0)

'测试步骤4'
WebUI.comment('4.删除整改信息成功')

'预期结果4'
WebUI.comment('4.删除整改信息成功')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/整改信息勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/button_整改-删除'))

WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/td_整改原因reason002'), 0)

