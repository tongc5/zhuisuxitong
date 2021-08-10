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
WebUI.comment('1.导入模板上传')

'预期结果1'
WebUI.comment('1.可正常上传')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/div_报废信息'))

WebUI.delay(10)

WebUI.comment('检查是否已存在报废信息，没有就导入一个')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_查询'))

WebUI.delay(5)

if (!(CustomKeywords.'custom.sampleKeywords.whetherElementsExist'(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/a_2200000000000001')))) {
    WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/批量导入'), GlobalVariable.Scrap_path)

    '检查是否导入成功'
    WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/span_导入成功1条'), 0)

    WebUI.delay(5)
}

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/a_上传'))

WebUI.waitForElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/附件上传'), GlobalVariable.wait_short)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/附件上传'), GlobalVariable.Scrap_path)

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/span_报废信息导入模板.xlsx'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/button_上传确定'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/报废信息/a_下载'), 0)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/报废信息/通用脚本/删除报废信息'), [:], FailureHandling.STOP_ON_FAILURE)

