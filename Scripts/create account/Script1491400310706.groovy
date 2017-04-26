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

WebUI.navigateToUrl('https://dk.z2data.com/Account/Login?ReturnUrl=%2F')

WebUI.click(findTestObject('create account/Page_Login/a_Create an account'))

WebUI.setText(findTestObject('create account/Page_Login/input_FirstName'), 'nada')

WebUI.setText(findTestObject('create account/Page_Login/input_LastName'), 'mahmoud')

WebUI.setText(findTestObject('create account/Page_Login/input_Email'), 'nada.mahmoud@z2data.com')

WebUI.setText(findTestObject('create account/Page_Login/input_Password'), 'nada12345678')

WebUI.setText(findTestObject('create account/Page_Login/input_ConfirmPassword'), 'nada12345678')

WebUI.click(findTestObject('create account/Page_Login/input_btn btn-info block full-'))

WebUI.verifyElementPresent(findTestObject('create account/Page_Login (1)/li_Confirmation link sent to y'), 0)

WebUI.closeBrowser()

