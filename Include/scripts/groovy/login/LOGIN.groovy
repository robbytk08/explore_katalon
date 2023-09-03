package login
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LOGIN {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I want to login dashboar")
	def I_want_to_login_dashboar() {
		WebUI.openBrowser('https://practicetestautomation.com/practice-test-login/')
		WebUI.maximizeWindow()
	}
	
	@When("I want to input valid username (.*)")
	def I_want_to_input_valid_username(String name) {
		WebUI.setText(findTestObject('UI/LOGIN/USERNAME'), name)
	}

	@And("I want to input valid password (.*)")
	def I_want_to_input_valid_password(String pwd) {
		WebUI.setEncryptedText(findTestObject('UI/LOGIN/PASSWORD'), pwd)
	}
	
	@And("I click button submit")
	def I_click_button_submit() {
		WebUI.click(findTestObject('UI/LOGIN/BUTTON_SUBMIT'))
		WebUI.delay(2)
	}
	

	@Then("I verify after Login (.*)")
	def I_verify_after_login(String testcase) {
		if (testcase == "POSITIVE") {
			WebUI.verifyElementText(findTestObject('Object Repository/UI/LOGIN/LOGIN_SUCCESS'), 'Logged In Successfully')
			WebUI.closeBrowser()
		}else if (testcase == "NEGATIVE") {
			WebUI.closeBrowser()
		}
		
	}
}