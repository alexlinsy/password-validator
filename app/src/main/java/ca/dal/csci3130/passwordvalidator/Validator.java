package ca.dal.csci3130.passwordvalidator;

import java.util.regex.Pattern;

public class Validator {

    public Validator() {

    }

    public boolean passwordValidate(String password) {

        //Check if the password is more than size 8
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern specialCharacter = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

        if(password.length()<8) {
            return false;
        } else if(password.toLowerCase() == "password" || password == "password") {
            //Check if the password equals password
            return false;
        } else if(!digits.matcher(password).find()){
            //Check if the password has digits
            return false;
        } else if(!upperCase.matcher(password).find()) {
            //Check if the password has UpperCase
            return false;
        } else if (!specialCharacter.matcher(password).find()) {
            //Check if the password has special Character
            return false;
        } else {
            return true;
        }
    }

}
