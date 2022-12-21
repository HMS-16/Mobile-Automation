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
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

WebUI.callTestCase(findTestCase('C_View Patient Data/TC_007_Nurse_Medical Record'), [('search') : 'wendy'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add Medical Recordd/Field_Height'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Height'), height, 0)

Mobile.tap(findTestObject('Add Medical Recordd/Field_Weight'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Weight'), weight, 0)

Mobile.tap(findTestObject('Add Medical Recordd/Field_BloodPressure'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BloodPressure'), bloodPres, 0)

Mobile.tap(findTestObject('Add Medical Recordd/Field_SugarAnalysis'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_SugarAnalysis'), sugarAnal, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_BodyTemperature'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BodyTemperature'), bodyTemp, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_HeartRate'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_HeartRate'), heartRate, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_BreatheRate'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BreatheRate'), bearthRate, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_Note'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Note'), note, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Button_Save'), 0)

Mobile.tap(findTestObject('Add Medical Recordd/Validation_Record_Yes_Button'), 0)

Mobile.verifyElementVisible(findTestObject('Patient/Psge_Patient_Medical_Record'), 0)

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

if (bloodPres == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Blood Press Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (bloodPres.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_BloodPres_invalid'), 0)
}

if (sugarAnal == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Sugar Anal Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (sugarAnal.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Sugar Anal_invalid'), 0)
}

if (bodyTemp == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Body Tem Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (bodyTemp.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Body Temp_invalid'), 0)
}

if (heartRate == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Heart Rate Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (heartRate.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Heart Rate_invalid'), 0)
}

if (breatheRate == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Breathe Rate Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
} else if (breatheRate.isNumber() == false) {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Breath Rate Invalid'), 0)
}

if (note == '') {
    Mobile.verifyElementVisible(findTestObject('Add Medical Recordd/Text_Note Empty'), 0 //if ((email == '') || ((email.contains('@gmail.com') == false) || (email.contains('@hms.com') == false)) {
        )
}

