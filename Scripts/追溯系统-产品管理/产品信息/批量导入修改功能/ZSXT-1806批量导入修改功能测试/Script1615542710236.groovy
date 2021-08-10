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
WebUI.comment('1.修改记录中的某些字段，点击批量导入修改，导入信息')

'预期结果1'
WebUI.comment('1.记录中的个别字段修改成功')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入修改'), GlobalVariable.productInfo_path2)

WebUI.delay(3)

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品信息第一行数据-底层版本'), 'title', GlobalVariable.baseVersion1, 
    0)

'测试步骤2'
WebUI.comment('2..修改多条记录中的某些字段，点击批量导入修改，导入信息')

'预期结果2'
WebUI.comment('2.多条记录中的个别字段都被修改成功')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入修改'), GlobalVariable.productInfo_path3)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), GlobalVariable.product_Id)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品信息第一行数据-底层版本'), 'title', GlobalVariable.baseVersion1, 
    2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/产品管理/产品信息/input_-产品信息-产品id,SIM卡号'), productId_2200000000000002)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_查询'))

WebUI.delay(10)

'检查是否查询到产品信息'
WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品信息第一行数据-底层版本'), 'title', GlobalVariable.baseVersion1, 
    2)

'测试步骤3'
WebUI.comment('3.修改2条记录，其中一条记录参数修改超限，点击批量导入修改，导入信息')

'预期结果3'
WebUI.comment('3.提示其中一条修改失败，其他记录修改成功')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/产品管理/产品信息/批量导入修改'), GlobalVariable.productInfo_path4)

'检查是否查询到产品信息'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/div_底层版本长度不能超过50位'), 3)

