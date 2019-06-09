package net.androidbootcamp.schooltools;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import net.androidbootcamp.schooltools.database.DBHelper;

import java.util.ArrayList;

public class ParentActivity extends AppCompatActivity {
    DBHelper mDatabase;

    Button addParent;
    ListView parentList;

    ArrayList<String> parentArray;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent);

        mDatabase = new DBHelper(this);

        parentArray = new ArrayList<>();

        addParent = findViewById(R.id.btnAddParent);
        parentList = findViewById(R.id.lvParent);

        viewParents();

        addParent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addParentIntent = new Intent(ParentActivity.this, AddParentActivity.class);
                startActivity(addParentIntent);
            }
        });
    }

    private void viewParents() {
        Cursor cursor = mDatabase.getAllParents();

        if (cursor.getCount() == 0) {
            Toast.makeText(this, "No Data", Toast.LENGTH_LONG).show();

        } else {
            while (cursor.moveToNext()) {
                parentArray.add(cursor.getString(0));
            }

            adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, parentArray);
            parentList.setAdapter(adapter);
        }
    }
}
