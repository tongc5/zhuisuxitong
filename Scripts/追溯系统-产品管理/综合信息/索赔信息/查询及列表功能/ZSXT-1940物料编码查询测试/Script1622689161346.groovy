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
WebUI.comment('1.在物料编码文本框中输入存在的物料编码，点击查询按钮')

'预期结果1'
WebUI.comment('1.可以查询到正确的数据')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/批量导入索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_物料编码搜索框'), GlobalVariable.material_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/td_物料编码240703000013A'), 5)

'测试步骤2'
WebUI.comment('2.在物料编码文本框中输入不存在的物料编码，点击查询按钮')

'预期结果2'
WebUI.comment('2.查询不到数据')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_物料编码搜索框'), GlobalVariable.material_Id_notExsit)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/p_索赔信息暂无数据'), 5)

'测试步骤3'
WebUI.comment('3.物料编码支持模糊查询')

'预期结果3'
WebUI.comment('3.物料编码支持模糊查询')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_物料编码搜索框'), GlobalVariable.material_Id1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/td_物料编码包含2407'), 5)

WebUI.comment('删除索赔信息')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/删除索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

