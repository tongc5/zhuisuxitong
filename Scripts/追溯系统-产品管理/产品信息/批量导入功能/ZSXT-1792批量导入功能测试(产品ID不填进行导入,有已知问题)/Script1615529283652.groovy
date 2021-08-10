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

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/a_产品信息'))

WebUI.delay(15)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path9)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功11条'), 0)

WebUI.delay(3)

'测试步骤2'
WebUI.comment('2.在批量下载模板中输入501条新记录，点击批量导入按钮')

'预期结果2'
WebUI.comment('2.可以成功导入501条记录')

WebUI.comment('大批量场景暂不实现自动化')

'测试步骤3'
WebUI.comment('3.在批量下载模板中输入5条记录，有一条重复的，点击批量导入按钮')

'预期结果3'
WebUI.comment('3.提示有重复记录，但是导入成功，可以成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功4条,重复1条'), 0)

WebUI.delay(3)

'测试步骤4'
WebUI.comment('4.在批量下载模板中输入5条记录，有一条已经存在的，点击批量导入按钮')

'预期结果4'
WebUI.comment('4.导入成功，更新已经存在的记录，成功导入5条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path11)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功5条'), 0)

WebUI.delay(3)

'测试步骤5'
WebUI.comment('5.在批量下载模板中输入5条记录，有一条记录信息错误，参数超限，点击批量导入按钮')

'预期结果5'
WebUI.comment('5.提示有一条导入失败，其他记录导入成功，成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path12)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功4条第1行导入出错'), 0)

WebUI.delay(3)

'测试步骤6'
WebUI.comment('6.在批量下载模板中输入1条记录，必填字段不填，点击批量导入按钮')

'预期结果6'
WebUI.comment('6.提示导入失败')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path13)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功0条,机种名称不填'), 0)

WebUI.delay(3)

'测试步骤7'
WebUI.comment('7.产品ID和物料编码必填')

'预期结果7'
WebUI.comment('7.产品ID和物料编码必填')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path14)

WebUI.delay(3)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path15)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功0条,物料编码不填'), 0)

WebUI.delay(3)

'测试步骤8'
WebUI.comment('8.产品ID为15-16位校验')

'预期结果8'
WebUI.comment('8.产品ID为15-16位校验')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入'), GlobalVariable.productInfo_path16)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/导入成功0条,产品ID长度为15位或16位'), 0)

WebUI.delay(3)

'测试步骤9'
WebUI.comment('9.点击批量导入模块下载，查看下载的Excel，列名')

'预期结果9'
WebUI.comment('9.批量导入模板列名显示与页面一致')

WebUI.comment('外网禁止下载')

