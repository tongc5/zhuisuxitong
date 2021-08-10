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
WebUI.comment('1.修改可以为空的字段')

'预期结果1'
WebUI.comment('1.保存成功后，查看列表数据这些字段为空')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/批量导入变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/查询变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/input__变更管理第一行选择框'))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/button_编辑'))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更人输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__评审周输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更原因输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.focus(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg评审时间清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg评审时间清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更点输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.focus(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg状态清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg状态清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__兼容性输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__切换方式输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__型谱表版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更场景输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.focus(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg类别清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg类别清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更前版本说明输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__申请部门输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__变更后版本说明'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.focus(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg计划完成时间清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg计划完成时间清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__申请人输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.focus(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg是否试装清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/svg是否试装清除'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/input__备注输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/textarea_产品型号输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/textarea_物料编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/textarea_主体编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.click(findTestObject('追溯系统/业务管理/项目管理/变更管理/编辑/button_编辑-确定'))

WebUI.delay(2)

reviewWeek1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_评审周第一行数据'), 'title')

reviewTime1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_评审时间第一行数据'), 'title')

status1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_状态第一行数据'), 'title')

type1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_类别第一行数据'), 'title')

try1 = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_是否试装第一行数据'), 'title')

finish_time = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_实际完成时间第一行数据'), 'title')

version = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_型谱表版本第一行数据'), 'title')

org = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_申请部门第一行数据'), 'title')

productModel = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_产品型号第一行数据'), 'title')

materialId = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_物料编码第一行数据'), 'title')

mainId = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_主体编码第一行数据'), 'title')

applayPerson = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_申请人第一行数据'), 'title')

changePerson = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更人第一行数据'), 'title')

changeReason = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更原因第一行数据'), 'title')

changePoint = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更点第一行数据'), 'title')

jianRong = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_兼容性第一行数据'), 'title')

changeScene = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更场景第一行数据'), 'title')

beforeChange = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更前版本说明第一行数据'), 'title')

afterChange = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_变更后版本说明第一行数据'), 'title')

planTime = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_计划完成时间第一行数据'), 'title')

remark = WebUI.getAttribute(findTestObject('追溯系统/业务管理/项目管理/变更管理/td_备注第一行数据'), 'title')

WebUI.verifyEqual(reviewWeek1, '')

WebUI.verifyEqual(reviewTime1, '')

WebUI.verifyEqual(status1, '')

WebUI.verifyEqual(type1, '')

WebUI.verifyEqual(try1, '')

WebUI.verifyEqual(finish_time, '')

WebUI.verifyEqual(version, '')

WebUI.verifyEqual(org, '')

WebUI.verifyEqual(productModel, '')

WebUI.verifyEqual(materialId, '')

WebUI.verifyEqual(mainId, '')

WebUI.verifyEqual(applayPerson, '')

WebUI.verifyEqual(changePerson, '')

WebUI.verifyEqual(changeReason, '')

WebUI.verifyEqual(changePoint, '')

WebUI.verifyEqual(jianRong, '')

WebUI.verifyEqual(changeScene, '')

WebUI.verifyEqual(beforeChange, '')

WebUI.verifyEqual(afterChange, '')

WebUI.verifyEqual(planTime, '')

WebUI.verifyEqual(remark, '')

WebUI.comment('删除变更信息')

WebUI.callTestCase(findTestCase('追溯系统-项目管理/变更管理/通用功能/删除变更信息'), [:], FailureHandling.STOP_ON_FAILURE)

