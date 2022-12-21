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

WebUI.callTestCase(findTestCase('A_Authentication/TC_03_SignIn_As_Admin'), [('email') : 'azhar@gmail.com', ('password') : 'azhar'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Name_Default_Sign Up'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Name_Default_Sign Up'), name, 0)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Registration Number_Default_SignUp'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Registration Number_Default_SignUp'), registNum, 0)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Dropdown_ChooseRole_Default_SignUp'), 0)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Dropdown_Doctor_SignUp'), 0, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Email_Default_SignUp'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Email_Default_SignUp'), email, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_Password_Default_SignUp'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_Password_Default_SignUp'), password, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Field_ConfirmPassword_Default_SIgnUp'), 0)

Mobile.setText(findTestObject('Invalid_SignIn_And_SignUp/Field_ConfirmPassword_Default_SIgnUp'), confirmPassword, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Invalid_SignIn_And_SignUp/Button_SignUp'), 0)

Mobile.delay(7, FailureHandling.STOP_ON_FAILURE)

Mobile.verifyElementVisible(findTestObject('Invalid_SignIn_And_SignUp/Button_SignIn_byAttribut'), 0)

