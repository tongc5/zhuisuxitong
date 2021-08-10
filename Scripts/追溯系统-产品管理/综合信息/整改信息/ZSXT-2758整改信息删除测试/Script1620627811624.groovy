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
WebUI.comment('1.点击要删除的信息，点击删除')

'预期结果1'
WebUI.comment('1.删除成功')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/导入整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/查询整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/整改信息勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_删除'))

WebUI.delay(3)

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/图片元素/暂无数据'))

WebUI.verifyImagePresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/图片元素/暂无数据'))

