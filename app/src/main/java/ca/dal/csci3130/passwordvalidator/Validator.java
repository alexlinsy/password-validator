package ca.dal.csci3130.passwordvalidator;

public class Validator {

    public Validator() {

    }

    public boolean passwordValidate(String password) {
        //Check if the password is more than size 8
        if(password.length()<8) {
            return false;
        } else if(password.toLowerCase() == "password" || password.toUpperCase() == "password") {
            //Check if the password equals password
            return false;
        } else {
            return true;
        }
    }

}
