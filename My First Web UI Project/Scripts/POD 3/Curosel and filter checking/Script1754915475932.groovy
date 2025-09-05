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

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Pepsi Soft Drink 355 ml_font-normal _e4e9bf'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Pepsi Soft Drink 355 ml_font-normal _e4e9bf'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Pepsi Soft Drink 355 ml_font-normal _e4e9bf'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/img_View All_mobImageCat'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/button_Accordion Section_item-Allergens-header'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/label_Allergens_text-14px peer-disabledcurs_ca0999'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/div_Egg-free_flex items-center gap-2'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/input_Egg-free_checkboxAllergens-2'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/span_Promise Gluten-Free Sandwich Rolls Han_f95c92'))

WebUI.click(findTestObject('Object Repository/Page_Shop Bread  Bakery  More  Sobeys Canada/li_Promise Gluten-Free Sandwich Rolls Han_option-3'))

WebUI.closeBrowser()

