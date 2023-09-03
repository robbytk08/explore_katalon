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

WebUI.comment(TC)

WebUI.openBrowser('https://practicetestautomation.com/practice-test-login/')

WebUI.maximizeWindow()

if ( TYPE == 'SUCCESS') { 
	
	WebUI.setText(findTestObject('UI/LOGIN/USERNAME'), 'student')
	
	WebUI.setEncryptedText(findTestObject('UI/LOGIN/PASSWORD'), 'p4y+y39Ir5PJb2ispxT0Ew==')
	
	WebUI.click(findTestObject('UI/LOGIN/BUTTON_SUBMIT'))
	
	WebUI.delay(2)
	
	WebUI.verifyElementText(findTestObject('Object Repository/UI/LOGIN/LOGIN_SUCCESS'), 'Logged In Successfully')
	
}else if ( TYPE == 'FAILED') { 
	
	WebUI.setText(findTestObject('UI/LOGIN/USERNAME'), 'student')
	
	WebUI.setEncryptedText(findTestObject('UI/LOGIN/PASSWORD'), 'tzH6RvlfSTg=')
	
	WebUI.click(findTestObject('UI/LOGIN/BUTTON_SUBMIT'))
	
	WebUI.delay(2)
	
	WebUI.verifyElementText(findTestObject('Object Repository/UI/LOGIN/PASSWORD_INVALID'), 'Your password is invalid!')
}


WebUI.closeBrowser()