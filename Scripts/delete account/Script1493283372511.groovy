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

WebUI.setText(findTestObject('delete account/Page_Login/input_Email'), 'hassan.hashem@z2data.com')

WebUI.setText(findTestObject('delete account/Page_Login/input_Password'), 'P@ssw0rd@2017')

WebUI.click(findTestObject('delete account/Page_Login/input_btn btn-info block full-'))

WebUI.click(findTestObject('delete account/Page_Z2DATA  Dashboard/a_hassan hashem'))

WebUI.click(findTestObject('delete account/Page_Z2DATA  Dashboard/a_Admin Panel'))

WebUI.click(findTestObject('delete account/Page_Z2DATA  Dashboard (1)/a_Delete'))

WebUI.click(findTestObject('delete account/Page_Z2DATA  Dashboard (2)/input_btn btn-default'))

