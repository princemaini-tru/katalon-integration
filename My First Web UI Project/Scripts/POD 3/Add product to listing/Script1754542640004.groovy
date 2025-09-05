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

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/span_Skip to content_font-bold text-body un_a81c05'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_View store details_inline-flex items_e3c2a0'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Closed now_inline-flex items-center _815b7a'))

WebUI.setText(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/input_Search Recipes_Search Recipes'), 
    'oates')

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/a_View All_absolute inset-0 z-1 tab rounded-xl'), 
    25)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/a_View All_absolute inset-0 z-1 tab rounded-xl'))

WebUI.waitForElementVisible(findTestObject('Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/button_9.99_inline-flex items-center justif_9b6675'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/button_9.99_inline-flex items-center justif_9b6675'))

WebUI.click(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/a_Your Privacy dialog closed_text-body text_61309a'))

WebUI.setText(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/input_Name your shopping list_createListInput'), 
    'test')

WebUI.click(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/button_Name your shopping list_inline-flex _bbfd2f'))

WebUI.click(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/span_Account_icon-list max-w-full w-auto mo_32d592'))

WebUI.click(findTestObject('Object Repository/Page_Buy Stoked Oats Stone Age Bag Oats 500_806836/span_9.99_icon-bin  text-brandWhite w-30px _b3abe8'))

WebUI.closeBrowser()

