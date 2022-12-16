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

Mobile.tap(findTestObject('Object Repository/invalid1/android.view.View'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Email'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.view.View (1)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.view.View (2)'), 0)

Mobile.verifyElementText(findTestObject(null), '')

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Email (1)'), 0)

Mobile.getText(findTestObject('Object Repository/invalid1/android.widget.EditText - Email (2)'), 0)

Mobile.setText(findTestObject(''), 'admin@hms.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Password'), 0)

Mobile.setText(findTestObject('Object Repository/invalid1/android.widget.EditText - Password (1)'), 'admin', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button (2)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/Message Error'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Name'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Registration Number'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button (3)'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.view.View (4)'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Email (3)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Password (2)'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Confirm Password'), 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button (4)'), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.Button (5)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.setText(findTestObject('Object Repository/invalid1/android.widget.EditText - Email (4)'), 'admin@hms.com', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/invalid1/android.widget.EditText - Password (3)'), 0)

Mobile.setText(findTestObject('Object Repository/invalid1/android.widget.EditText - Password (4)'), 'admin', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject('Object Repository/invalid1/android.view.View (5)'), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.tap(findTestObject(''), 0)

Mobile.closeApplication()

