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
import groovy.json.JsonSlurper as JsonSlurper

WS.comment(TC)

GlobalVariable.LATEST_RESPONSE = WS.sendRequest(findTestObject('API/GET_CITY_LSIT', 
	[('reqPage') : '1', ('reqLimit') : '10', ('reqCityCode') : '11.75', ('reqName') : 'Subulussalam'
            , ('reqProvinceCode') : '11']))

String responseJsonCityList = GlobalVariable.LATEST_RESPONSE.getResponseText()

WS.comment(responseJsonCityList)

def jsonSluperCityList = new JsonSlurper()

def result = jsonSluperCityList.parseText(GlobalVariable.LATEST_RESPONSE.getResponseBodyContent())

//def a = result.content[0].code
//
//WS.comment(a)

WS.verifyResponseStatusCode(GlobalVariable.LATEST_RESPONSE, 200)

WS.verifyElementPropertyValue(GlobalVariable.LATEST_RESPONSE, 'content[0].code', '11.75')

