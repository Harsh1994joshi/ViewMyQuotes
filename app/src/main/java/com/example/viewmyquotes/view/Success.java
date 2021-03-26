package com.example.viewmyquotes.view;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import com.example.viewmyquotes.R;
import com.example.viewmyquotes.model.Model;
import com.example.viewmyquotes.myadapter.MyAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Success extends AppCompatActivity {

    DatabaseReference databaseReference;
    List<Model> list;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success);
        listView = findViewById(R.id.vsucces);
        list=new ArrayList<>();
        databaseReference= FirebaseDatabase.getInstance().getReference("NewQuotes").child("Success");
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                list.clear();
                for (DataSnapshot snapshot1 : snapshot.getChildren())
                {
                    Model model=snapshot1.getValue(Model.class);
                    list.add(model);

                }
                MyAdapter myAdapter= new MyAdapter(Success.this,list);
                listView.setAdapter(myAdapter);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}