package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import net.androidbootcamp.schooltools.database.DBHelper;

import java.util.ArrayList;


public class StudentListActivity extends AppCompatActivity {

    DBHelper mDatabase;

    Button addStudent;
    ListView allStudents;

    ArrayList<String> studentList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        mDatabase = new DBHelper(this);

        studentList = new ArrayList<>();

        addStudent = findViewById(R.id.addStudent);
        allStudents = findViewById(R.id.lvStudents);
        
        viewStudents();

        addStudent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addStudentIntent = new Intent(StudentListActivity.this, AddStudentActivity.class);
                startActivity(addStudentIntent);
            }
        });

    }

    private void viewStudents() {
        Cursor cursor = mDatabase.getAllStudents();

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data", Toast.LENGTH_LONG).show();

        } else {
            while (cursor.moveToNext()) {
                studentList.add(cursor.getString(0));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, studentList);
            allStudents.setAdapter(adapter);

            // sets an onClickListener if a student name is clicked
            allStudents.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    String student = (String)allStudents.getAdapter().getItem(position);
                    Intent studentInfo = new Intent(allStudents.getContext(), EditStudentActivity.class);
                    studentInfo.putExtra("studentValue", student);
                    allStudents.getContext().startActivity(studentInfo);
                }
            });
        }

    }



}
