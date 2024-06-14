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

WebUI.navigateToUrl('https://katalon.com/')

WebUI.click(findTestObject('Object Repository/Solutions/Page_Katalon AI-augmented Software Quality _596167/div_Web Testing'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_What is Web Testing Web Application Te_223ab2/a_Test your app now'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_What is Web Testing Web Application Te_223ab2/div_Web TestingWhen a website is deployed, _630a99'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_What is Web Testing Web Application Te_223ab2/div_API Testing'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_API Testing Made Simple  Katalon/div_Web testing'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_API Testing Made Simple  Katalon/div_Mobile testing'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_API Testing Made Simple  Katalon/button_'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_API Testing Made Simple  Katalon/div_Desktop Testing'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Comprehensive Desktop Testing For Seam_99182e/a_Finance'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Financial Software Testing Platform  Katalon/a_Telecoms'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Comprehensive Telecom Testing Platform_16c4d3/a_Healthcare'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Comprehensive Healthcare Software Test_aa0b23/a_Retail'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Comprehensive Retail Software Testing _d09cbe/a_Utility'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Utility Testing Platform For Enterpris_1912b1/a_Government'))

WebUI.click(findTestObject('Object Repository/Solutions/Page_Government Software Testing Solution  Katalon/div_Book a call_insent-popup-card-close'))

