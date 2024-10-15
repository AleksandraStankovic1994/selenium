package itbootcamp.selenium.domaci.excel;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.*;

/**
 * Pokusati login na sledecem sajtu: http://the-internet.herokuapp.com/login
 * Testirati:
 * 1. valid username, valid password
 * 2. invalid username, valid password
 * 3. valid username, invalid password
 * 4. invalid username, invalid password
 * Koristiti ucitavanje username-a i password-a iz excel-a
 */
public class TestExcel extends BaseTest {


    @Test
    public void testLoginCorrectUserNamePassword() throws IOException {
        String userName = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
        , 1, 0);
        String password = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 1, 1);

        loginPage.getUsernameField().sendKeys(userName);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.loggedInGreenConfirmation().getText().contains(LoginPage.LOGGED_IN_MESSAGE_CORRECT));

    }

    @Test
    public void testLoginInvalidUserNameValidPassword() throws IOException {
        String userName = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 2, 0);
        String password = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 2, 1);

        loginPage.getUsernameField().sendKeys(userName);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.loggedInGreenConfirmation().getText().contains(LoginPage.LOGGED_IN_MESSAGE_INCORRECT));

    }

    @Test
    public void testLoginValidUserNameInvalidPassword() throws IOException {
        String userName = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 3, 0);
        String password = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 3, 1);

        loginPage.getUsernameField().sendKeys(userName);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.loggedInGreenConfirmation().getText().contains(LoginPage.LOGGED_IN_MESSAGE_INCORRECT)); //bug found!

    }

    @Test
    public void testLoginInvalidUserNameInvalidPassword() throws IOException {
        String userName = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 4, 0);
        String password = getTestDataCellValue("C:\\Users\\Konstantin-Pc\\IdeaProjects\\selenium\\src\\main\\java\\itbootcamp\\selenium\\domaci\\excel\\data.xlsx"
                , 4, 1);

        loginPage.getUsernameField().sendKeys(userName);
        loginPage.getPasswordField().sendKeys(password);
        loginPage.getLoginButton().click();
        Assert.assertTrue(loginPage.loggedInGreenConfirmation().getText().contains(LoginPage.LOGGED_IN_MESSAGE_INCORRECT));

    }

    private String getTestDataCellValue(String file, Integer row, Integer cellNumber) throws IOException {
        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook hssfWorkbook = new XSSFWorkbook(fis);
        XSSFSheet list1 = hssfWorkbook.getSheetAt(0);
        XSSFRow red1 = list1.getRow(row);
        return red1.getCell(cellNumber).getStringCellValue();

        /*
        Iteration
        for (int i = 1; i <= list1.getLastRowNum(); i++) {
            XSSFRow redI = list1.getRow(i);
            for (int j = 0; j < redI.getLastCellNum(); j++) {
                System.out.print(redI.getCell(j) + " ");
            }
            System.out.println();
        }
         */
    }
}
