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

WebUI.setText(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/input_Search Recipes_Search Recipes'), 
    'oates')

WebUI.sendKeys(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/input_Search Recipes_Search Recipes'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Your Privacy dialog closed_text-xs u_27ab04'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/span_(42)_inline-block'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'), 20)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'))

//WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/li_Relevance_option-0'))
//WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/span_Sort_line-clamp-1'))
WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes A-Z'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes A-Z'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes Z-A'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes Z-A'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/receipes newest date'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/receipes newest date'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/Receipes sort box'))

WebUI.waitForElementClickable(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/receipes old date'), 10)

WebUI.click(findTestObject('Page_Canadas Family Grocery Store  Sobeys Inc/receipes old date'))

WebUI.closeBrowser()

