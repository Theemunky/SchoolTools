package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.androidbootcamp.schooltools.database.DBHelper;

public class AddParentActivity extends AppCompatActivity {
    DBHelper mDatabase;

    EditText firstName;
    EditText lastName;
    EditText address;
    EditText city;
    EditText state;
    EditText postalCode;
    EditText phone;
    EditText email;
    Button addParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_parent);

        mDatabase = new DBHelper(this);

        firstName = findViewById(R.id.etFirstName);
        lastName = findViewById(R.id.etLastName);
        address = findViewById(R.id.etStreet);
        city = findViewById(R.id.etCity);
        state = findViewById(R.id.etState);
        postalCode = findViewById(R.id.etPostalCode);
        phone = findViewById(R.id.etPhone);
        email = findViewById(R.id.etEmail);
        addParent = findViewById(R.id.btnAddParent);

        addParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pfirstName = firstName.getText().toString();
                String plastName = lastName.getText().toString();
                String pAddress = address.getText().toString();
                String pCity = city.getText().toString();
                String pState = state.getText().toString();
                String pPostal = postalCode.getText().toString();
                String pPhone = phone.getText().toString();
                String pEmail = email.getText().toString();
                if (!email.equals("") && mDatabase.insertParent(pfirstName, plastName, pAddress, pCity, pState,
                        pPostal, pPhone, pEmail)) {
                    Toast.makeText(AddParentActivity.this, "Data Entered", Toast.LENGTH_LONG).show();
                    firstName.setText("");
                    lastName.setText("");
                    address.setText("");
                    city.setText("");
                    state.setText("");
                    postalCode.setText("");
                    phone.setText("");
                    email.setText("");
                    Intent studentIntent = new Intent(AddParentActivity.this, ParentActivity.class);
                    startActivity(studentIntent);

                } else {
                    Toast.makeText(AddParentActivity.this, "Data not entered", Toast.LENGTH_LONG).show();
                }
            }

        });
    }
}
