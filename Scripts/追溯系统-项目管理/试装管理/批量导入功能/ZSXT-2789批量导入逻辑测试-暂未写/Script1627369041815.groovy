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
WebUI.comment('1.根据输入变更编码查询试装数据是否已经存在该变更编码的数据')

'预期结果1'
WebUI.comment('1.存在返回提示变更编码已存在')

WebUI.click(findTestObject('追溯系统/业务管理/li_业务管理'))

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/span_项目管理'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/a_变更管理'))

WebUI.delay(10)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_导入成功1条'), 0)

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤2'
WebUI.comment('2.根据输入试装编码查询试装数据是否已经存在该试装编码的数据')

'预期结果2'
WebUI.comment('2.存在返回提示试装编码已存在')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path1)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_变更编码为空'), 0)

'测试步骤3'
WebUI.comment('3.根据输入试装名称查询试装数据是否已经存在该试装名称的数据')

'预期结果3'
WebUI.comment('3.存在返回提示试装名称已存在')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path2)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_导入成功16条'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤4'
WebUI.comment('4.试装故障数计算')

'预期结果4'
WebUI.comment('4.根据试装编码去故障数据中查询故障数据总数')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path3)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_导入成功4条重复1条'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤5'
WebUI.comment('5.7天上线率计算')

'预期结果5'
WebUI.comment('5.根据试装编码去产品信息中查询产品信息，根据产品信息的更新时间筛选出7天内上线的数据，用筛选后的个数/筛选前的个数得出7天上线率')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_导入成功1条'), 0)

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path4)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/项目管理/变更管理/span_导入成功5条'), 0)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤6'
WebUI.comment('6.7天未未上线数计算')

'预期结果6'
WebUI.comment('6.总数-7上线数')

WebUI.uploadFile(findTestObject('追溯系统/业务管理/项目管理/变更管理/批量导入'), GlobalVariable.change_path5)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.setText(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更编码搜索框'), changeId1)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_查询'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理全选框'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_删除'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(3)

'测试步骤7'
WebUI.comment('7.故障总数计算')

'预期结果7'
WebUI.comment('7.根据试装编码查询对应产品信息的产品ID，根据产品ID查询故障信息总数')

'测试步骤8'
WebUI.comment('8.试装总数计算')

'预期结果8'
WebUI.comment('8.根据试装编码查询对应产品信息个数')

'测试步骤9'
WebUI.comment('9.总故障率计算')

'预期结果9'
WebUI.comment('9.总故障数/试装总数')

'测试步骤10'
WebUI.comment('10.试装故障率计算')

'预期结果10'
WebUI.comment('10.试装故障数/试装总数')
'测试步骤11'
WebUI.comment('11.计划完成台数')

'预期结果11'
WebUI.comment('11.根据试装编码查询试装明细数据，汇总计划台数数据，如果计划台数为0，试装进度为100%，否则，用计划台数/试装总数计算试装进度')
