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
WebUI.comment('1.导入数据试装编码为空，导入成功，检查项目管理-试装管理，对应的试装编码下面')

'预期结果1'
WebUI.comment('1.累计试装数量不增加')

WebUI.comment('如果存在残留产品数据，需删除')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path6)

WebUI.delay(5)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品ID勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_删除'))

WebUI.delay(3)

'校验删除成功'
WebUI.verifyElementNotPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/td_2200000000000001'), 0)

WebUI.comment('导入试装信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path2)

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

count1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title')

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num2)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

count2 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title')

WebUI.comment('导入产品信息')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path6)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功1条'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

'试装编码不增加'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title', count1, 5)

'测试步骤2'
WebUI.comment('2.导入数据含一个试装编码，导入成功，检查项目管理-试装管理，对应的试装编码下面')

'预期结果2'
WebUI.comment('2.累加试装数据加1')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path7)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功1条'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

int num1 = Integer.parseInt(count1)

int num11 = num1 + 1

count11 = Integer.toString(num11)

'试装编码不增加'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title', count11, 5)

'测试步骤3'
WebUI.comment('3.导入数据含多个试装编码，导入成功，检查项目管理-试装管理，对应的试装编码下面')

'预期结果3'
WebUI.comment('3.多个试装编码的累计试装数据都加1')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/删除产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path8)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功1条'), 0)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

'试装编码不增加'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title', count11, 5)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装编码输入框'), GlobalVariable.try_num2)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(5)

int num2 = Integer.parseInt(count2)

int num22 = num2 + 1

count22 = Integer.toString(num22)

'试装编码不增加'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/项目管理/试装管理/试装管理第一行数据-完成总数'), 'title', count22, 5)

