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
WebUI.comment('1.修改产品ID不能为空')

'预期结果1'
WebUI.comment('1.修改成功(产品id不支持修改，该步骤不实现)')

'测试步骤2'
WebUI.comment('2.出货日期不能为空')

'预期结果2'
WebUI.comment('2.出货日期不能为空')

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/批量导入产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('追溯系统-产品管理/产品信息/通用功能/查询产品信息'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品ID勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑按钮'))

WebUI.delay(2)

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/出货日期-清除按钮'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/出货日期-清除按钮'))

//WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/出货日期-清除按钮'), FailureHandling.STOP_ON_FAILURE)
//WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/出货日期-清除按钮'), FailureHandling.STOP_ON_FAILURE)
'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入出货日期'), 0)

'测试步骤3'
WebUI.comment('3.客户流向状态不能为空')

'预期结果3'
WebUI.comment('3.客户流向状态不能为空')

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/客户流向状态-清除按钮'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/客户流向状态-清除按钮'))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入客户流向状态'), 0)

'测试步骤4'
WebUI.comment('4.产品类型不能为空')

'预期结果4'
WebUI.comment('4.产品类型不能为空')

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/产品类型-清除按钮'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/产品类型-清除按钮'))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入产品类型'), 0)

'测试步骤5'
WebUI.comment('5.机种名称不能为空，输入200字符，修改成功')

'预期结果5'
WebUI.comment('5.机种名称不能为空，输入200字符，修改成功')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入机种名称'), 0)

'测试步骤6'
WebUI.comment('6.物料编码不能为空，输入50个字符，修改成功')

'预期结果6'
WebUI.comment('6.物料编码不能为空，输入50个字符，修改成功')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入物料编码'), 0)

'测试步骤7'
WebUI.comment('7.代工厂名称不能为空，输入200个字符，修改成功')

'预期结果7'
WebUI.comment('7.代工厂名称不能为空，输入200个字符，修改成功')

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入代工厂名称'), 0)

'测试步骤8'
WebUI.comment('8.状态不能为空')

'预期结果8'
WebUI.comment('8.状态不能为空')

WebUI.focus(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/状态-清除按钮'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/状态-清除按钮'))

'检查是否修改成功'
WebUI.verifyElementPresent(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/div_请输入状态'), 0)

'测试步骤9'
WebUI.comment('9.修改SIM卡号为空')

'预期结果9'
WebUI.comment('9.修改成功')

'测试步骤10'
WebUI.comment('10.修改SIM卡号长度为50位')

'预期结果10'
WebUI.comment('10.修改成功')

'测试步骤11'
WebUI.comment('11.修改底层版本为空')

'预期结果11'
WebUI.comment('11.修改为空')

'测试步骤12'
WebUI.comment('12.修改修改底层版本为50个字符')

'预期结果12'
WebUI.comment('12.修改成功')

'测试步骤13'
WebUI.comment('13.修改应用版本为空')

'预期结果13'
WebUI.comment('13.修改成功')

'测试步骤14'
WebUI.comment('14.修改应用版本为50个字符')

'预期结果14'
WebUI.comment('14.修改成功')

'测试步骤15'
WebUI.comment('15.修改图片版本为空')

'预期结果15'
WebUI.comment('15.修改成功')

'测试步骤16'
WebUI.comment('16.修改图片版本为50个字符')

'预期结果16'
WebUI.comment('16.修改成功')

'测试步骤17'
WebUI.comment('17.修改试装信息为空')

'预期结果17'
WebUI.comment('17.修改成功')

'测试步骤18'
WebUI.comment('18.修改试装信息为255个字符')

'预期结果18'
WebUI.comment('18.修改成功')

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑-取消按钮'))

WebUI.delay(2)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑按钮'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.delay(10)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑-确定按钮'))

WebUI.delay(5)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号第一行数据'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本第一行数据'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本第一行数据'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本第一行数据'), 'title', '', 0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/试装名称第一行数据'), 'title', '', 0)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/产品ID勾选框'))

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑按钮'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称输入框'), GlobalVariable.string_200)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码输入框'), GlobalVariable.string_50)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称输入框'), Keys.chord(Keys.CONTROL, 'a', Keys.DELETE))

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称输入框'), GlobalVariable.string_200)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号输入框'), GlobalVariable.string_50)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本输入框'), GlobalVariable.string_50)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本输入框'), GlobalVariable.string_50)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本输入框'), GlobalVariable.string_50)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/input__tryInstallInfo试装名称输入框'), GlobalVariable.string_255)

WebUI.click(findTestObject('追溯系统/业务管理/产品管理/产品信息/button_编辑-确定按钮'))

WebUI.delay(10)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/机种名称第一行数据'), 'title', GlobalVariable.string_200, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/物料编码第一行数据'), 'title', GlobalVariable.string_50, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/代工厂名称第一行数据'), 'title', GlobalVariable.string_200, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/SIM卡号第一行数据'), 'title', GlobalVariable.string_50, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/底层版本第一行数据'), 'title', GlobalVariable.string_50, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/应用版本第一行数据'), 'title', GlobalVariable.string_50, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/图片版本第一行数据'), 'title', GlobalVariable.string_50, 
    0)

WebUI.verifyElementAttributeValue(findTestObject('追溯系统/业务管理/产品管理/产品信息/编辑页面/试装名称第一行数据'), 'title', GlobalVariable.string_255, 
    0)

