package ca.dal.csci3130.passwordvalidator;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Link button, textView and editText with id
        Button validateButton = (Button)findViewById(R.id.validateButton);
        final TextView resultTextView = (TextView)findViewById(R.id.resultTextView);
        final EditText passwordText = (EditText)findViewById(R.id.passwordText);

        //Build password validator
        final Validator isValid = new Validator();

        //Create Alert Dialog box
        AlertDialog.Builder Alertbuilder = new AlertDialog.Builder(this);
        Alertbuilder.setMessage("Password cannot be empty!");
        Alertbuilder.setCancelable(true);

        Alertbuilder.setPositiveButton(
                "Ok",
                new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });

        final AlertDialog alertBox = Alertbuilder.create();

        //Waiting for validate button to click
        validateButton.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View v) {
                String passwordTest = passwordText.getText().toString();

                if(passwordTest.trim().length() == 0) {
                    alertBox.show();
                }  else {

                    if(isValid.passwordValidateQ2(passwordTest) != 5) {
                        resultTextView.setText("The password is not strong");
                    } else {
                        resultTextView.setText("The password is strong");
                    }
                }

            }
        });

    }

}
