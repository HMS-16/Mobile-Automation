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

WebUI.callTestCase(findTestCase('B_Register New User/TC_001_Register_Nurse_Valid'), [('name') : 'Lamria Marihot', ('registNum') : '2211521125631322'
        , ('email') : 'lamria@gmail.com', ('password') : 'password', ('confirmPassword') : 'password'], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('A_Authentication/TC_06_Admin Sign Out'), [:], FailureHandling.STOP_ON_FAILURE)

