package ca.dal.csci3130.passwordvalidator;

public class Validator {

    public Validator() {

    }

    public boolean passwordValidate(String password) {

        if(password.length()<8) {
            return false;
        } else if(password.toLowerCase() == "password" || password.toUpperCase() == "password") {
            return false;
        } else {
            return true;
        }
    }

}
