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
WebUI.comment('1.录入产品ID和设备机号不存在的数据')

'预期结果1'
WebUI.comment('1.产生两条数据，一条为故障信息，另一条为设备信息，且此设备信息的故障来源为故障录入')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_录入'))

WebUI.delay(2)

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'))

WebUI.verifyImagePresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/工作时间必填'))

'测试步骤2'
WebUI.comment('2.录入更换后ID和设备机号不存在的数据')

'预期结果2'
WebUI.comment('2.产生两条数据，一条为故障信息，另一条为设备信息，且此设备信息的故障来源为故障录入')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), '1')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/div_请输入工作时间'), 0)

'测试步骤3'
WebUI.comment('3.录入产品数据状态不为已报废更换后ID')

'预期结果3'
WebUI.comment('3.产品信息的状态更新为装机')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), string_10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障地点输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), 'value', '9999999.99', 0)

'测试步骤4'
WebUI.comment('4.输入产品ID已存在故障信息')

'预期结果4'
WebUI.comment('4.改产品ID的所有故障信息，故障状态更新为该条故障信息的状态，操作日志记录产品变更日志，故障变更日志')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), string_9)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障地点输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), 'value', '9999999.99', 0)

'测试步骤5'
WebUI.comment('5.确认故障码')

'预期结果5'
WebUI.comment('5.故障码根据运行系统+整机运行状态+故障标签+故障现象+故障规律自动生成')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), string_11)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__故障地点输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/录入/input__工作时间输入框'), 'value', '9999999.99', 0)

