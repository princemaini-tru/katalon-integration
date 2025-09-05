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

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Cookies Settings_onetrust-accept-btn_e26645'), 
    20)

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Cookies Settings_onetrust-accept-btn_e26645'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/button_Your Privacy dialog closed_text-xs u_27ab04'))

WebUI.click(findTestObject('Object Repository/Page_Canadas Family Grocery Store  Sobeys Inc/a_Scene Grocery Offers_inline-flex items-ce_e62633'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input__gigya-textbox-email'), 
    20)

WebUI.setText(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input__gigya-textbox-email'), 'prince.maini+28@truinc.com')

WebUI.setText(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input__gigya-textbox-122033259098094430'), 
    'prince')

WebUI.setText(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input__gigya-textbox-48351557999388700'), 
    'maini')

WebUI.setText(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input__gigya-textbox-99294980864804060'), 
    'a1a1a1')

WebUI.click(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/label_Your Postal Code will be used to prov_53b101'))

WebUI.click(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/label__gigya-label'))

WebUI.click(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/input_Privacy Policy_gigya-input-submit lef_838139'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/span__gigya-error-msg-gigya-subscribe-with-_10c5a3'), 20)

WebUI.verifyElementText(findTestObject('Object Repository/Page_Subscription - Sobeys Inc/span__gigya-error-msg-gigya-subscribe-with-_10c5a3'), 
    'You have already subscribed using this email')

WebUI.closeBrowser()

