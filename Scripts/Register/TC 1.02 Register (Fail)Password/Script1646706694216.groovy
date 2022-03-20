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

WebUI.click(findTestObject('Object Repository/Page_Registration System/button_Register'))

WebUI.setText(findTestObject('Object Repository/Page_Register/input__firstName'), 'นางสาว ขวัญธิชา')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__lastName'), 'พันเพ็ชร์')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__aln_id'), '634259001')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__inYear'), '2563')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__outYear'), '2565')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__place'), 'บริษัท')

WebUI.setText(findTestObject('Page_Register/input__job'), 'พนักงาน')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__position'), 'พนักงานทั่วไป')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__address'), '23')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__district'), 'ท่ามะกา')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__province'), 'กาญจนบุรี')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__zipcode'), '71120')

WebUI.setText(findTestObject('Object Repository/Page_Register/input__tel'), '0913339226')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Facebook_facebook'), 'Kwanticha Phanpetch')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_ID Line_line'), 'ojang')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Twitter_twitter'), 'ojang')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), '634259001@webmail.npru.ac.th')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__password'), 'lnBUteI2ioQ=')

WebUI.sendKeys(findTestObject('Object Repository/Page_Register/input__password'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input__confirmPassword'), 'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Page_Register/button_Register'))

WebUI.verifyTextPresent('Invalid input', false, FailureHandling.STOP_ON_FAILURE)
WebUI.takeScreenshot('C:\\Users\\ASUS\\Downloads\\TC102.png')

WebUI.closeBrowser()

