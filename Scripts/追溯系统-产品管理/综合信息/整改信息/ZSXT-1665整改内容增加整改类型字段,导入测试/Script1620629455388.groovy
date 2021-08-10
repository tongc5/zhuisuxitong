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
WebUI.comment('1.打开产品管理-综合信息-整改信息页面，点击模板下载，有预期结果1')

'预期结果1'
WebUI.comment('1.模板里新增“整改类型”字段，该字段为“必填项”，有必填标志')

'测试步骤2'
WebUI.comment('2.模板里不输入整改类型，其余必填项均已输入合理值，点击导入，有预期结果2')

'预期结果2'
WebUI.comment('2.导入失败，报错信息明确')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_整改信息'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/批量导入'), GlobalVariable.rectification_info1)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/span_整改类型为空'), 0)

WebUI.delay(3)

'测试步骤3'
WebUI.comment('3.输入错误的整改类型，点击导入，有预期结果3')

'预期结果3'
WebUI.comment('3.导入失败，报错信息明确')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/批量导入'), GlobalVariable.rectification_info2)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/span_整改类型数据字典值不存在'), 0)

WebUI.delay(3)

'测试步骤4'
WebUI.comment('4.输入正确的整改类型，点击导入，有预期结果4')

'预期结果4'
WebUI.comment('4.导入成功，查看整改信息有新增数据')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/批量导入'), GlobalVariable.rectification_info)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_导入成功1条'), 0)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/删除整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

