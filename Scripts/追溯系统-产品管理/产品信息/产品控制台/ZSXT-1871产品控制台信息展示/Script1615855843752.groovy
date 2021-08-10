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
WebUI.comment('1.产品管理-产品信息,点击产品ID')

'预期结果1'
WebUI.comment('1.进入产品控制台')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/综合信息/整改信息/通用脚本/导入整改信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2200000000000001'))

WebUI.delay(5)

'测试步骤2'
WebUI.comment('2.标题：产品控制台')

'预期结果2'
WebUI.comment('2.标题：产品控制台')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/span_产品控制台'), 0)

'测试步骤3'
WebUI.comment('3.小标题：展示当前产品ID，机种名称')

'预期结果3'
WebUI.comment('3.小标题：展示当前产品ID，机种名称')

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/span_ID 2200000000000001'), 0)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/span_SEED-10IA-55'), 0)

'测试步骤4'
WebUI.comment('4.时间轴有内容显示蓝色图标，可以点击；其中“风险”时间轴有内容显示红色图标，可以点击')

'预期结果4'
WebUI.comment('4.时间轴有内容显示蓝色图标，可以点击；其中“风险”时间轴有内容显示红色图标，可以点击')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改标签页'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改信息'), 0)

'测试步骤5'
WebUI.comment('5.时间轴没有内容显示灰色图标，可以点击')

'预期结果5'
WebUI.comment('5.时间轴没有内容显示灰色图标，可以点击')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/div_整改信息'))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/a_2200000000000001'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/整改信息勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/整改信息/button_删除'))

WebUI.delay(5)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_2200000000000001'))

WebUI.delay(5)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改标签页'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品控制台/整改/div_整改信息'), 0)

