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
import java.lang.Integer as Integer

WebUI.callTestCase(findTestCase('C_View Patient Data/TC_007_Nurse_Medical Record'), [('search') : 'wendy'], FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Add Medical Recordd/Field_Height'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Height'), 132.toInteger(), 0)


Mobile.tap(findTestObject('Add Medical Recordd/Field_Weight'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Weight'), 23.toInteger(), 0)

Mobile.tap(findTestObject('Add Medical Recordd/Field_BloodPressure'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BloodPressure'), 54.toInteger(), 0)

Mobile.tap(findTestObject('Add Medical Recordd/Field_SugarAnalysis'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_SugarAnalysis'), 54.toInteger(), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_BodyTemperature'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BodyTemperature'), 65.toInteger(), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_HeartRate'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_HeartRate'),65.toInteger(), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_BreatheRate'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_BreatheRate'),76.toInteger(), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Field_Note'), 0)

Mobile.setText(findTestObject('Add Medical Recordd/Field_Note'), note, 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Add Medical Recordd/Button_Save'), 0)

Mobile.tap(findTestObject('Add Medical Recordd/Validation_Record_Yes_Button'), 0)

Mobile.verifyElementVisible(findTestObject('Patient/Psge_Patient_Medical_Record'), 0)

