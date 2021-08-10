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
import org.openqa.selenium.Keys as Keys

'测试步骤1'
WebUI.comment('1.在批量下载模板中输入1条记录，所有字段都填写，点击批量导入按钮')

'预期结果1'
WebUI.comment('1.导入成功')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/a_试装管理'))

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_清除'))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), GlobalVariable.tryName1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'))

WebUI.delay(GlobalVariable.wait_short)

if (CustomKeywords.'custom.sampleKeywords.whetherElementsExist'(findTestObject('追溯系统/业务管理/项目管理/试装管理/td_试装名称test0001'))) {
    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'))

    WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'))

    WebUI.delay(2)
}

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path10)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功1条'), 0)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

'测试步骤2'
WebUI.comment('2.在批量下载模板中输入1条记录，必填字段不填，点击批量导入按钮')

'预期结果2'
WebUI.comment('2.提示导入失败')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path11)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_变更编码不能为空'), 0)

'测试步骤3'
WebUI.comment('3.在批量下载模板中输入16条新记录，点击批量导入按钮')

'预期结果3'
WebUI.comment('3.可以成功导入16条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path12)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功16条'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装名称搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

'测试步骤4'
WebUI.comment('4.在批量下载模板中输入5条记录，有一条重复的，点击批量导入按钮')

'预期结果4'
WebUI.comment('4.提示有重复记录，但是导入成功，可以成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path13)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功4条重复1条'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

'测试步骤5'
WebUI.comment('5.批量导入5条记录中，有一条已经存在的，点击批量导入按钮')

'预期结果5'
WebUI.comment('5.提示有已经存在的记录，其他记录导入成功，成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功1条'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path14)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功4条第1行导入出错-变更编码已存在'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

'测试步骤6'
WebUI.comment('6.批量导入5条记录中，有一条记录信息错误，参数超限，点击批量导入按钮')

'预期结果6'
WebUI.comment('6.提示有一条导入失败，其他记录导入成功，成功导入4条记录')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/span_导入成功1条'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/试装管理/批量导入'), GlobalVariable.attempInstall_path15)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/试装管理/div_导入成功4条第1行导入出错-变更编码不能为空'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/input__试装管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/试装管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(GlobalVariable.wait_short)

'测试步骤7'
WebUI.comment('7.在批量下载模板中输入501条新记录，点击批量导入按钮')

'预期结果7'
WebUI.comment('7.可以成功导入501条记录')

'预期结果7'
WebUI.comment('大容量场景，暂不实现')

