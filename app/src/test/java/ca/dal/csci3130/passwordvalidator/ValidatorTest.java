package ca.dal.csci3130.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    //Build Validator class
    Validator isValid = new Validator();

    @Test
    public void passwordValidate() {
        //Create a test password
        String passwordStage2 = "Lsy123456.";
        Boolean output;

        output = isValid.passwordValidate(passwordStage2);
        //Test if the string matches requirements
        assertEquals(true,output);

    }
}