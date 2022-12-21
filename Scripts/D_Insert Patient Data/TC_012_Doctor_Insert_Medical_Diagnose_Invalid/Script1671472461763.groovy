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

WebUI.callTestCase(findTestCase('C_View Patient Data/TC_008_Doctor_Medical Diagnose'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add Medical Diagnose/Field_Diagnosis'), 0)

Mobile.setText(findTestObject('Add Medical Diagnose/Field_Diagnosis'), diagnose, 0)

Mobile.tap(findTestObject('Add Medical Diagnose/Field_Prescreption'), 0)

Mobile.setText(findTestObject('Add Medical Diagnose/Field_Prescreption'), prescreption, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Diagnose/Button_Save_Medical Diagnose'), 0)

if (height == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Height Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (height.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Height_invalid'), 0)
}

if (weight == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Weight Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (weight.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Weightl_invalid'), 0)
}

