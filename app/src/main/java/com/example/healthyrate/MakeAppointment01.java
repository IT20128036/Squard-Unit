package com.example.healthyrate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MakeAppointment01 extends AppCompatActivity {

    private ListView hospitalListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_make_appointment01);

        // Insert Hospitals to the Database
        final Button btn_AddHospital = findViewById(R.id.btn_adminAddHospital);
        btn_AddHospital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertHospitalToDB();
            }
        });

    }

    // Move to Insert Hospital Activity
    public void insertHospitalToDB(){
        Intent intent = new Intent(this, TestAppointmentInsert.class);
        startActivity(intent);
    }
}