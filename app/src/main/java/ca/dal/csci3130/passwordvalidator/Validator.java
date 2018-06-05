package ca.dal.csci3130.passwordvalidator;

import java.util.regex.Pattern;

public class Validator {

    public int count = 0;

    public Validator() {

    }

    public int passwordValidateQ1(String password) {

        count = 0;
        //Check if the password is more than size 8
        if(password.length()>8) {
            count ++;
        }

        //Check if the password equals password
        if(!password.toLowerCase().equals("password") || !password.equals("password")) {
            count ++;
        }
        return count;
    }
    public int passwordValidateQ2(String password) {

        count = 0;
        Pattern upperCase = Pattern.compile("[A-Z]");
        Pattern digits = Pattern.compile("[0-9]");
        Pattern specialCharacter = Pattern.compile("[^a-z0-9 ]", Pattern.CASE_INSENSITIVE);

        //Check if the password is more than size 8
        if(password.length()>8) {
            count ++;
        }

        //Check if the password equals password
        if(!password.toLowerCase().equals("password") || !password.equals("password")) {
            count ++;
        }

        //Check if the password has digits
        if(digits.matcher(password).find()){
            count ++;
        }
        //Check if the password has UpperCase
        if(upperCase.matcher(password).find()) {
            count ++;
        }
        //Check if the password has special Character
        if (specialCharacter.matcher(password).find()) {
            count ++;
        }

        return count;

    }

}
