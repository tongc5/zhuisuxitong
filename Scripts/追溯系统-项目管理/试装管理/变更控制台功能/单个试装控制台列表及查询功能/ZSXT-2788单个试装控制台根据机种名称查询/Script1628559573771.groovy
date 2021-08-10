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
WebUI.comment('1.输入存在的机种名称')

'预期结果1'
WebUI.comment('1.查询结果正确')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/批量导入试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_S202010001)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功3条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.waitForPageLoad(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装编码搜索框'), GlobalVariable.tryNum1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装编码超链接'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/input_机种名称搜索框'), GlobalVariable.model_name)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/td_试装控制台第一行机种名称数据'), 'title', GlobalVariable.model_name, 
    0)

'测试步骤2'
WebUI.comment('2.输入不存在的机种名称')

'预期结果2'
WebUI.comment('2.查询无结果')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/input_机种名称搜索框'), GlobalVariable.model_name_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/p_试装控制台暂无数据'), 0)

'测试步骤3'
WebUI.comment('3.模糊查询')

'预期结果3'
WebUI.comment('3.查询结果正确')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/input_机种名称搜索框'), GlobalVariable.model_name1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

modelName = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/td_试装控制台第一行机种名称数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(modelName, GlobalVariable.model_name1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装控制台/button_返回'))

WebUI.comment('删除试装信息')

WebUI.delay(2)

WebUI.callTestCase(findTestCase('追溯系统-项目管理/试装管理/通用功能/删除试装信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/删除产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

