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

Mobile.startApplication('C:\\Users\\User\\Downloads\\Mediclinic v.1.0.10.apk', true)

Mobile.tap(findTestObject('Object Repository/invalid1/SignIn/android.view.View'), 0)

Mobile.tap(findTestObject('invalid1/invalid/Button_SplashScreen_SignIn'), 0)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Email_Default_SignIn'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Email_Default_SignIn'), email, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Password_Default_SignIn'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Password_Default_SignIn'), password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Button_SignIn_byAttribut'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)


def datafile = findTestData('Data Files/InvalidSignIn')

for (def Row = 1; Row <= datafile.getRowNumbers(); Row++){
	if (email == '') {
		Mobile.verifyElementVisible(findTestObject('Invalid_SignIn_And_SignUp/Text_Email Empty_SignIn'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
			)
	} else if ((email.contains('@gmail.com') || email.contains('@hms.com')) == false) {
		Mobile.verifyElementVisible(findTestObject('Invalid_SignIn_And_SignUp/Text_Email Invalid_Sign In'), 0)
	}
	
	if (password == '') {
		Mobile.verifyElementVisible(findTestObject('Invalid_SignIn_And_SignUp/Text_Password Empty_Sign In'), 0)
	} else if (password.length() < 5) {
		Mobile.verifyElementVisible(findTestObject('Invalid_SignIn_And_SignUp/Text_Password Length_SignIn'), 0)
}
	
	}

