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

WebUI.navigateToUrl('http://alumni4.cyberlifecafe.com/index')

WebUI.click(findTestObject('Object Repository/Page_Registration System/button_Sing In'))

WebUI.setText(findTestObject('Object Repository/Page_Login/input_Student ID_stu_id'), '634259001')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Registration Successful Message Example/a_Go to Home Page'))

WebUI.click(findTestObject('Object Repository/Page_Registration System/i__fas fa-user'))

WebUI.click(findTestObject('Object Repository/Page_Registration System/a_My profile'))

WebUI.click(findTestObject('Object Repository/Page_Profile/button_'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__job'), 'พนักงาน')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Edit Profile'))

WebUI.click(findTestObject('Object Repository/Page_Registration Successful Message Example/h3_Success'))

WebUI.click(findTestObject('Object Repository/Page_Registration Successful Message Example/a_Go to Profile'))

WebUI.verifyTextPresent('Edit Prifile', false)
WebUI.takeScreenshot('C:\\Users\\ASUS\\Downloads\\TC301.png')


WebUI.closeBrowser()

