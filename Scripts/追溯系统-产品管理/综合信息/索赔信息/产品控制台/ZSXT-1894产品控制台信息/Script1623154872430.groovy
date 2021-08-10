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
WebUI.comment('1.包含产品ID，机种名称')

'预期结果1'
WebUI.comment('1.包含产品ID，机种名称')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/批量导入索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/input_产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/button_查询'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/a_2200000000000001'), 5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/a_2200000000000001'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/span_产品控制台'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/产品控制台/span_当前产品ID2200000000000001'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/产品控制台/span_机种名称SEED-10IA-55'), 0)

'测试步骤2'
WebUI.comment('2.包含产品信息')

'预期结果2'
WebUI.comment('2.包含产品信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_制程'), 0)

'测试步骤3'
WebUI.comment('3.整改信息')

'预期结果3'
WebUI.comment('3.整改信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_整改'), 0)

'测试步骤4'
WebUI.comment('4.设备信息')

'预期结果4'
WebUI.comment('4.设备信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_装机'), 0)

'测试步骤5'
WebUI.comment('5.风险信息')

'预期结果5'
WebUI.comment('5.风险信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_风险'), 0)

'测试步骤6'
WebUI.comment('6.故障信息')

'预期结果6'
WebUI.comment('6.故障信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_故障'), 0)

'测试步骤7'
WebUI.comment('7.索赔信息')

'预期结果7'
WebUI.comment('7.索赔信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_索赔'), 0)

'测试步骤8'
WebUI.comment('8.分析信息')

'预期结果8'
WebUI.comment('8.分析信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_分析'), 0)

'测试步骤9'
WebUI.comment('9.对策信息')

'预期结果9'
WebUI.comment('9.对策信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_对策'), 0)

'测试步骤10'
WebUI.comment('10.报废信息')

'预期结果10'
WebUI.comment('10.报废信息')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/产品控制台/div_报废'), 0)

'测试步骤11'
WebUI.comment('11.操作记录')

'预期结果11'
WebUI.comment('11.操作记录')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/索赔信息/产品控制台/产品控制台返回'))

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/索赔信息/通用脚本/删除索赔信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/删除产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

