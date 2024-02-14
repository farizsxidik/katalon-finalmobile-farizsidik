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

Mobile.startApplication('/Users/farizsidik/Downloads/Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - LOGIN'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - SIGN UP TODAY'), 0)

Mobile.setText(findTestObject('android.widget.EditText'), 'megauser', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (1)'), 'mega@email.com', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (2)'), 'kataSandi', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (3)'), 'kataSandi', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (4)'), 'User', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (5)'), 'Satu', 0)

Mobile.hideKeyboard()

Mobile.setText(findTestObject('Object Repository/android.widget.EditText (6)'), '12345678', 0)

Mobile.hideKeyboard()

//Mobile.tap(findTestObject('Object Repository/android.widget.TextView - United States'), 0)
//
//Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Indonesia'), 0)
//
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText (7)'), 'Jakarta Selatan', 0)
//
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText (7)'), 'Jakarta', 0)
//
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText (8)'), 'Kost', 0)
//
//Mobile.hideKeyboard()
//
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText (9)'), 'Jaksel', 0)
//
//Mobile.setText(findTestObject('Object Repository/android.widget.EditText (10)'), '53152', 0)

//Mobile.tap(findTestObject('Object Repository/android.widget.Switch - Use my Location'), 0)

String switchStatus = Mobile.getAttribute(findTestObject('Object Repository/android.widget.Switch - Use my Location'), 'checked', 0)

// Logika if else berdasarkan status switch
if (switchStatus == 'true') {
	// Jika switch sudah aktif, maka tidak perlu di-tap lagi atau lakukan aksi lain
	WebUI.comment('Switch is already ON')
} else {
	// Jika switch tidak aktif, tap untuk mengaktifkannya
	Mobile.tap(findTestObject('Object Repository/android.widget.Switch - Use my Location'), 0)
}

Mobile.tap(findTestObject('Object Repository/android.widget.Button - REGISTER'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.ImageView'), 0)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.closeApplication()



