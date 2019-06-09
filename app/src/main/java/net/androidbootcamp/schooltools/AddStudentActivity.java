package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.androidbootcamp.schooltools.database.DBHelper;

public class AddStudentActivity extends AppCompatActivity {
    DBHelper mDatabase;

    EditText studentId;
    EditText studentName;
    EditText parentEmail;
    Button addStudent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_student);

        mDatabase = new DBHelper(this);

        studentId = findViewById(R.id.etStudentID);
        studentName = findViewById(R.id.etStudentName);
        parentEmail = findViewById(R.id.etParentEmail);
        addStudent = findViewById(R.id.btnAddStudent);

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id = studentId.getText().toString();
                String name = studentName.getText().toString();
                String pEmail = parentEmail.getText().toString();
                if(!studentId.equals("") && mDatabase.insertStudent(id, name, pEmail)){
                    Toast.makeText(AddStudentActivity.this, "Data Entered", Toast.LENGTH_LONG).show();
                    studentId.setText("");
                    studentName.setText("");
                    parentEmail.setText("");
                    Intent studentIntent = new Intent(AddStudentActivity.this, StudentListActivity.class);
                    startActivity(studentIntent);

                } else {
                    Toast.makeText(AddStudentActivity.this, "Data not entered", Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}
