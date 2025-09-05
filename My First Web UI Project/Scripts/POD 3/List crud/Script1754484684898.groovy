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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dxp-qa.sobeys.com/')

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Cookies accept button'), 15)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/Cookies accept button'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/Guideline close'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/List icon on homepage'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/Manage list'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/skip tour on list'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/Add list'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/Create anyway'))

WebUI.setText(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/List creation field'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/save btn'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/three dot listing'))

WebUI.click(findTestObject('Page_Organize  Update Your Grocery List Onl_7d1a16/Rename button in context menu'))

WebUI.setText(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/rename list field'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/Rename operation button'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/three dot listing'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/button_Delete_items-center justify-center t_811c2c'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/three dot listing'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/button_Rename_items-center justify-center t_aca9d9'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/button_Cancel_inline-flex items-center just_884d91_1'))

