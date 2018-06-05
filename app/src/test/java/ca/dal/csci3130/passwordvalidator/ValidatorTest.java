package ca.dal.csci3130.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {

    @Test
    public void passwordValidate() {

        String password = "lsy12345678";
        Boolean output;

        Validator isValid = new Validator();
        output = isValid.passwordValidate(password);

        assertEquals(true,output);

    }
}