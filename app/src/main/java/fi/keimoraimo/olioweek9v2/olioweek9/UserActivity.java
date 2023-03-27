package fi.keimoraimo.olioweek9v2.olioweek9;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

import fi.keimoraimo.olioweek9v2.R;

public class UserActivity extends AppCompatActivity {

    private EditText editTextFirstName;
    private EditText editTextLastName;
    private EditText editTextEmail;
    private RadioGroup radioGroup;
    private Button addUser;


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        editTextFirstName = findViewById(R.id.editTextFirstName);
        editTextLastName = findViewById(R.id.editTextLastName);
        editTextEmail = findViewById(R.id.editTextEmail);
        radioGroup = findViewById(R.id.RadioGroup);
        addUser = findViewById(R.id.buttonAddUser);
    }

    public void addUser(View view){
        String firstName = editTextFirstName.getText().toString();
        String lastName = editTextLastName.getText().toString();
        String email = editTextEmail.getText().toString();

        int radioButtonId = radioGroup.getCheckedRadioButtonId();
        RadioButton radioButton = findViewById(radioButtonId);
        String degreeProgram = radioButton.getText().toString();

        User user = new User(firstName, lastName, email, degreeProgram);
        UserStorage us = UserStorage.getInstance();
        us.addUser(user);

    }
}

