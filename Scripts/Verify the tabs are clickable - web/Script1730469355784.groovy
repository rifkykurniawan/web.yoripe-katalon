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

WebUI.navigateToUrl('https://web.yoripe.com/')

WebUI.click(findTestObject('Object Repository/Page_YoRipe  Stories/a_Resep'))

WebUI.click(findTestObject('Object Repository/Page_YoRipes New Recipes/a_LIVE'))

WebUI.click(findTestObject('Object Repository/Page_YoRipes Livestreams/a_Tantangan Seru'))

WebUI.click(findTestObject('Object Repository/Page_YoRipe  Challenges/a_Acara'))

WebUI.click(findTestObject('Object Repository/Page_Acara di YoRipe/a_Grup'))

WebUI.click(findTestObject('Object Repository/Page_YoRipes Groups/a_YoRipe Junior Chef Indonesia Season 4'))

WebUI.click(findTestObject('Object Repository/Page_Junior Chef Indonesia Season 4/svg_Cari di YoRipe_header-yoripe-logo'))

WebUI.closeBrowser()

