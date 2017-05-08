import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dk.z2data.com:8080/Account/Login?ReturnUrl=%2F')

WebUI.setText(findTestObject('email body1/Page_Login/input_Email'), 'hasan,hashem@z2data.com')

WebUI.setText(findTestObject('email body1/Page_Login/input_Email'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('email body1/Page_Login/input_Password'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('email body1/Page_Login/input_btn btn-info block full-'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard/a_hassan hashem'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard/a_Admin Panel'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (2)/a_Email Bodies'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (3)/a_Edit'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (4)/input_btn btn-default'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (3)/a_Details'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (5)/a_Back to List'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (3)/a_Edit (1)'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (6)/input_btn btn-default'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (3)/a_Details (1)'))

WebUI.click(findTestObject('email body1/Page_Z2DATA  Dashboard (7)/a_Back to List'))

WebUI.closeBrowser()

