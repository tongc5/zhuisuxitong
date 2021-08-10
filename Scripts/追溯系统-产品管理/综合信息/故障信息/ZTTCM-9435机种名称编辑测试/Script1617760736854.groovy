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
WebUI.comment('1.机种名称不能为空')

'预期结果1'
WebUI.comment('1.机种名称不能为空')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/故障信息/通用脚本/导入故障信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/故障信息/通用脚本/查询故障信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/故障信息第一行勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_编辑'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__productName机种名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.delay(2)

WebUI.verifyImagePresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/请选择机种名称'), FailureHandling.STOP_ON_FAILURE)

'测试步骤2'
WebUI.comment('2.修改机种名称')

'预期结果2'
WebUI.comment('2.修改成功')

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__productName机种名称输入框'), GlobalVariable.model_name2)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__workTime工作时间'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__workTime工作时间'), '100')

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_编辑-确定按钮'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_编辑-确定按钮'))

WebUI.delay(3)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/td_第一行机种名称数据'), 'title', 'SEED-70IA-55', 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/故障信息/通用脚本/删除故障信息'), [:], FailureHandling.STOP_ON_FAILURE)

