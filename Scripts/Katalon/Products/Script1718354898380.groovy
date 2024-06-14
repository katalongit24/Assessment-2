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

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon AI-augmented Software Quality _596167/button_Accept All Cookies'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon AI-augmented Software Quality _596167/div_Runtime Engine'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon Runtime Engine - Empowering Te_b7e02c/div_TestCloud'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon TestCloud  Cloud-based Test Ex_68c4d3/div_Handle ever-changing ecosystems and bus_2b348e'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon TestCloud  Cloud-based Test Ex_68c4d3/div_Book a call_insent-popup-card-close'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon TestCloud  Cloud-based Test Ex_68c4d3/div_TestOps'))

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon TestOps  Test Planning, Manage_fbbf2f/div_TrueTest'))

WebUI.click(findTestObject('Object Repository/Products/Page_TrueTest AI-powered Regression Testing_713efc/div_Join the beta'))

WebUI.switchToWindowTitle('Katalon TrueTest Beta Testing Program Registration Form')

WebUI.click(findTestObject('Object Repository/Products/Page_Katalon TrueTest Beta Testing Program _017273/span_Next'))

