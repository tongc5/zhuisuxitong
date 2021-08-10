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
WebUI.comment('1.搜索出1条记录，点击导出按钮')

'预期结果1'
WebUI.comment('1.导出记录成功，导出的excel记录可以成功打开，并且记录正确')

'测试步骤2'
WebUI.comment('2.检查导出字段')

'预期结果2'
WebUI.comment('2.变更编码,评审周,评审时间,状态,实际完成时间,型谱表版本,类别,产品型号,物料编码,主编码,申请部门,申请人,变更人,变更原因,变更点,兼容性,切换方式,变更场景,变更前版本说明,变更后版本说明,计划完成时间,是否试装,备注')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), GlobalVariable.changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

'检查是否查询到索赔信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_202010001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_导出'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_导出'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/下载/svg下载图标'))

WebUI.verifyElementPresent(findTestObject('追溯系统/下载/div_变更导出完成'), 0)

WebUI.click(findTestObject('追溯系统/下载/div_清空下载'))

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

