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

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Our Services_menu-trigger  menu-butt_c450c8'), 
    15)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Our Services_menu-trigger  menu-butt_c450c8'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/a_Discover Recipes_menu-link menu-link-level-3'), 
    15)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/a_Discover Recipes_menu-link menu-link-level-3'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/button_Your Privacy dialog closed_text-xs u_27ab04'), 
    15)

WebUI.click(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/span_Note_create_new_recipeList'), 
    15)

WebUI.click(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/span_Note_create_new_recipeList'))

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/button_Add recipes to your permanent Favour_256ca5'), 
    15)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Save and Organize Your Favourite Sobey_d80f5e/button_Add recipes to your permanent Favour_256ca5'), 
    10)

WebUI.closeBrowser()

