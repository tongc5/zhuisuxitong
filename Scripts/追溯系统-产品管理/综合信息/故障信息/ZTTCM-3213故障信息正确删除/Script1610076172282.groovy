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
WebUI.comment('1.未选中数据，点击删除')

'预期结果1'
WebUI.comment('1.报错，提示选择数据')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/批量导入'), GlobalVariable.breakdown_info)

'检查是否导入成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/div_导入成功1条'), 0)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/产品ID搜索框'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_查询'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/a_2200000000000001'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_删除'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/span_请选择要删除的记录'), 0)

'测试步骤2'
WebUI.comment('2.选中一条数据，点击删除')

'预期结果2'
WebUI.comment('2.提示删除')

'测试步骤3'
WebUI.comment('3.看列表')

'预期结果3'
WebUI.comment('3.总数据少了一条')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/input__ant-checkbox-input故障信息勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/button_删除'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/故障信息/图片元素/p_暂无数据'), 0)

'测试步骤4'
WebUI.comment('4.查看回收箱')

'预期结果4'
WebUI.comment('4.有刚删除的数据')

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/div_系统管理页签'))

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/a_回收站'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/系统管理/回收站/td_回收站第一行数据为故障信息'), 0)

'测试步骤5'
WebUI.comment('5.确认为逻辑删除而非物理删除')

'预期结果5'
WebUI.comment('5.垃圾箱有数据，且可查询出')

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/a_查看'))

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/系统管理/回收站/input_ID_ant-input回收站信息-产品ID'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/系统管理/回收站/button_关闭'))

