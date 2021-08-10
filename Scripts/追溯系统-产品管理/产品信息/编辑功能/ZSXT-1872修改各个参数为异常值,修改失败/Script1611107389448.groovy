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
WebUI.comment('1.修改产品ID为14位(产品ID不支持修改，暂不实现该步骤)')

'预期结果1'
WebUI.comment('1.修改失败')

'测试步骤2'
WebUI.comment('2.修改产品ID为17位(产品ID不支持修改，暂不实现该步骤)')

'预期结果2'
WebUI.comment('2.修改失败')

'测试步骤3'
WebUI.comment('3.修改机种名称为201个字符')

'预期结果3'
WebUI.comment('3.修改失败')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品ID勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑按钮'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称输入框'), GlobalVariable.string_201)

WebUI.verifyElementVisible(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_200机种名称长度不能超过200位'), FailureHandling.STOP_ON_FAILURE)

'测试步骤4'
WebUI.comment('4.修改物料编码为51个字符')

'预期结果4'
WebUI.comment('4.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码输入框'), GlobalVariable.string_51)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_50物料编码长度不能超过50位'), 0)

'测试步骤5'
WebUI.comment('5.修改代工厂名称为201个字符')

'预期结果5'
WebUI.comment('5.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称输入框'), GlobalVariable.string_201)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_200代工厂名称本长度不能超过200位'), 0)

'测试步骤6'
WebUI.comment('6.修改SIM卡号为51个字符')

'预期结果6'
WebUI.comment('6.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号输入框'), GlobalVariable.string_51)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_SIM50SIM卡号长度不能超过50位'), 0)

'测试步骤7'
WebUI.comment('7.修改底层版本为51个字符')

'预期结果7'
WebUI.comment('7.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本输入框'), GlobalVariable.string_51)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_50底层版本长度不能超过50位'), 0)

'测试步骤8'
WebUI.comment('8.修改应用版本为51个字符')

'预期结果8'
WebUI.comment('8.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本输入框'), GlobalVariable.string_51)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_50应用版本长度不能超过50位'), 0)

'测试步骤9'
WebUI.comment('9.修改图片版本为51个字符')

'预期结果9'
WebUI.comment('9.修改失败')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本输入框'), GlobalVariable.string_51)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_50图片版本长度不能超过50位'), 0)

'测试步骤10'
WebUI.comment('10.修改试装信息为256个字符')

'预期结果10'
WebUI.comment('10.修改失败')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), GlobalVariable.string_256)

WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_255试装名称长度不能超过255位'), 0)

