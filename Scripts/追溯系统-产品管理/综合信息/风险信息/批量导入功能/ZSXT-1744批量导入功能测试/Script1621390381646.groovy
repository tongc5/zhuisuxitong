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
WebUI.comment('1.在批量下载模板中输入11条新记录，点击批量导入按钮')

'预期结果1'
WebUI.comment('1.可以成功导入11条记录')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_产品管理'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/a_综合信息'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/div_风险信息'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path1)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/div_导入成功11条'), 0)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input_产品ID搜索框'), productId1)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险信息全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤2'
WebUI.comment('2.批量导入501条记录')

'预期结果2'
WebUI.comment('2.可以成功导入501条记录')

WebUI.comment('大批量场景暂不自动化')

'测试步骤3'
WebUI.comment('3.批量导入5条记录中，有一条重复的')

'预期结果3'
WebUI.comment('3.提示有重复记录，但是导入成功，可以成功导入4条记录')

WebUI.comment('实际不做重复性校验')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path2)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_导入成功5条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险信息全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'测试步骤4'
WebUI.comment('4.批量导入5条记录中，有一条已经存在的')

'预期结果4'
WebUI.comment('4.成功导入5条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_导入成功5条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险信息全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'测试步骤5'
WebUI.comment('5.批量导入5条记录中，有一条记录信息错误，参数超限')

'预期结果5'
WebUI.comment('5.提示有一条导入失败，其他记录导入成功，成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path4)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_风险编号格式不正确'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/input__风险信息全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

'测试步骤6'
WebUI.comment('6.批量导入1条记录，必填字段不填')

'预期结果6'
WebUI.comment('6.提示导入失败')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path5)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_风险编号为空'), 0)

'测试步骤7'
WebUI.comment('7.产品ID必填')

'预期结果7'
WebUI.comment('7.产品ID必填')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path6)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_产品ID不能为空'), 0)

'测试步骤8'
WebUI.comment('8.产品ID为15-16位校验')

'预期结果8'
WebUI.comment('8.产品ID为15-16位校验')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/批量导入'), GlobalVariable.risk_path7)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/综合信息/风险信息/span_产品ID长度为15位或16位'), 0)

