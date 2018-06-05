package ca.dal.csci3130.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    //Build Validator class
    Validator isValid = new Validator();

    @Test
    public void passwordValidate() {
        //Create a test password
        String password = "lsy12345678";
        int output;

        output = isValid.passwordValidateQ1(password);
        //Test if the string matches requirements
        assertEquals(2,output);

    }
}