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
WebUI.comment('1.在客户流向状态文本框中输入存在的数据,点击查询按钮')

'预期结果1'
WebUI.comment('1.可以查询到正确的数据')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/新增客户流向字典值test001'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_客户流向状态搜索框'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_客户流向状态勾选框-内销仓库'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_客户流向状态_内销仓库'), 5)

'测试步骤2'
WebUI.comment('2.在客户流向状态文本框中输入不存在的数据,点击查询按钮')

'预期结果2'
WebUI.comment('2.查询不到数据')

WebUI.click(findTestObject('追溯系统/首页/li_首页'))

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_客户流向状态搜索框'))

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/li_客户流向状态勾选-test001'))

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品信息暂无数据'), 5)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/删除预置客户流向test001'), [:], FailureHandling.STOP_ON_FAILURE)

