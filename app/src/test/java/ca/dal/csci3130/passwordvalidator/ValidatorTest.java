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
        String password2 = "passwordssss";
        int output;
        int output2;

        output = isValid.passwordValidateQ1(password);
        output2 = isValid.passwordValidateQ1(password2);

        //Test if the string matches requirements
        assertEquals(2,output);
        assertEquals(2, output2);

    }
}