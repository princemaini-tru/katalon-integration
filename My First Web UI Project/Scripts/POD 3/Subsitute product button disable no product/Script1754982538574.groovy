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

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/button_Cookies Settings_onetrust-accept-btn_e26645'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Cookies Settings_onetrust-accept-btn_e26645'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/span_Account_icon-list max-w-full w-auto mo_32d592'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Choose an option_inline-flex items-c_be2b09'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/span_Manage List_font-bold text-brandSecond_50b6fe'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/a_Your Privacy dialog closed_text-body text_61309a'))

WebUI.setText(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/input_Name your shopping list_createListInput'), 
    'Testing')

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/button_Name your shopping list_inline-flex _bbfd2f'))

WebUI.click(findTestObject('Object Repository/Page_Organize  Update Your Grocery List Onl_7d1a16/a_Add New List_w-full h-full absolute inset_4f2fea'))

WebUI.closeBrowser()

