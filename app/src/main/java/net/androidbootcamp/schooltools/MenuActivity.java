package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {
    TextView mTextViewStudents;
    TextView mTextViewParents;
    TextView mTextViewClasses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mTextViewStudents = (TextView)findViewById(R.id.tvStudentList);
        mTextViewStudents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent studentIntent = new Intent(MenuActivity.this, StudentListActivity.class);
                startActivity(studentIntent);
            }
        });
        mTextViewParents = (TextView)findViewById(R.id.tvParentList);
        mTextViewParents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent parentIntent = new Intent(MenuActivity.this, ParentActivity.class);
                startActivity(parentIntent);
            }
        });
        mTextViewClasses = (TextView)findViewById(R.id.classList);
        mTextViewClasses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent classIntent = new Intent(MenuActivity.this, ClassActivity.class);
                startActivity(classIntent);
            }
        });
    }
}
