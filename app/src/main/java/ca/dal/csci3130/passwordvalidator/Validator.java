package ca.dal.csci3130.passwordvalidator;

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

}
