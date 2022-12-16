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

Mobile.startApplication('C:\\Users\\User\\Downloads\\Mediclinic v.1.0.7.apk', true)

Mobile.tap(findTestObject('Object Repository/SignIn/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.Button'), 0)

Mobile.tap(findTestObject('SignIn/android.widget.EditText - Email'), 0)

Mobile.setText(findTestObject('SignIn/android.widget.EditText - Email'), email, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/SignIn/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('SignIn/android.widget.EditText - Password'), password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('SignIn/android.widget.Button'), 0)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

//
//Mobile.getText(findTestObject('SignIn/android.widget.EditText - Email'), 0)
if (email == '') {
    Mobile.verifyElementVisible(findTestObject('invalid/Email can not be empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if ((email != email.contains('@gmail.com')) || (email != email.contains('@hms.com'))) {
    Mobile.verifyElementVisible(findTestObject('lagi/Invalid Email'), 0)
}

//Mobile.setText(findTestObject('SignIn/android.widget.EditText - Password'), password, 0)
if (password == '') {
    Mobile.verifyElementVisible(findTestObject('invalid/Password Can not be empty'), 0)
} else if (password.length() < 5) {
    Mobile.verifyElementVisible(findTestObject('lagi/Password length invalid'), 0)
}

