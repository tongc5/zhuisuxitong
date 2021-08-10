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
WebUI.comment('1.进入项目管理-变更管理页面，输入存在的物料编码进行搜索，有预期结果1')

'预期结果1'
WebUI.comment('1.可以查询到正确的数据')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), material_id)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

materialId1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_物料编码第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(materialId1, material_id)

'测试步骤2'
WebUI.comment('2.输入不存在的物料编码，进行搜索，有预期结果2')

'预期结果2'
WebUI.comment('2.查询不到数据')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), material_idNotExsit)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/p_变更管理暂无数据'), 0)

'测试步骤3'
WebUI.comment('3.物料编码支持模糊查询')

'预期结果3'
WebUI.comment('3.物料编码支持模糊查询')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), material_id1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

materialId2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_物料编码第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(materialId2, material_id1)

'测试步骤4'
WebUI.comment('5.对主体编码搜索框重复步骤1、2、3，有预期结果1、2、3')

'预期结果4'
WebUI.comment('5.预期结果1、2、3')

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), main_id)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

mainId1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_主体编码第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(mainId1, main_id)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), main_idNotExsit)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/p_变更管理暂无数据'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), main_id1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

mainId2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_主体编码第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(mainId2, main_id1)

'测试步骤5'
WebUI.comment('5.进行组合查询')

'预期结果5'
WebUI.comment('5.查询成功，数据准确')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_物料编码搜索框'), material_id)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input_主体编码搜索框'), main_id)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'))

WebUI.delay(5)

materialId3 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_物料编码第一行数据'), 'title')

mainId3 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_主体编码第一行数据'), 'title')

CustomKeywords.'custom.sampleKeywords.containStr'(materialId3, material_id)

CustomKeywords.'custom.sampleKeywords.containStr'(mainId3, main_id)

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

