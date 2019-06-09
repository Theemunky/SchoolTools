package net.androidbootcamp.schooltools;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class EditStudentActivity extends AppCompatActivity {

    EditText studentName;
    EditText parentName;
    EditText parentAddress;
    EditText parentEmail;
    EditText parentPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_student);

        studentName = (EditText)findViewById(R.id.studentName);
        parentName = (EditText)findViewById(R.id.parentName);
        parentAddress = (EditText)findViewById(R.id.address);
        parentEmail = (EditText)findViewById(R.id.parentEmail);
        parentPhone = (EditText)findViewById(R.id.parentPhone);

        String student = getIntent().getStringExtra("studentValue");

        studentName.setText(student);
    }
}
