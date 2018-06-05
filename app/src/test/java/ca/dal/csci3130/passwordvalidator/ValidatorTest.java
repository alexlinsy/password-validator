package ca.dal.csci3130.passwordvalidator;

import org.junit.Test;
import static org.junit.Assert.*;

public class ValidatorTest {
    //Build Validator class
    Validator isValid = new Validator();

    @Test
    public void passwordValidate() {
        //Create test passwords
        String passwordStage21 = "lsyyuiuide";
        String passwordStage22 = "lsy123456";
        String passwordStage23 = "Lsy123456";
        String passwordStage24 = "Lsy123456.";

        int output;
        int output2;
        int output3;
        int output4;

        output2 = isValid.passwordValidateQ2(passwordStage21);
        output3 = isValid.passwordValidateQ2(passwordStage22);
        output4 = isValid.passwordValidateQ2(passwordStage23);
        output = isValid.passwordValidateQ2(passwordStage24);
        //Test if the string matches requirements
        assertEquals(2,output2);
        assertEquals(3,output3);
        assertEquals(4,output4);
        assertEquals(5,output);


    }
}