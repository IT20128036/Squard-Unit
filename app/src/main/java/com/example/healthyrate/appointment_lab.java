package com.example.healthyrate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import org.jetbrains.annotations.NotNull;

public class appointment_lab extends AppCompatActivity {

    EditText nic, name, gender, date, time, age, blood, diseases, connum;
    Button btnadd, btnshow, btnupdate, btndelete;
    DatabaseReference dbRef;
    patientSS patObj;
    //RadioButton male, female;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_lab);


        nic = findViewById(R.id.txtnic);
        name = findViewById(R.id.txtname);
        date = findViewById(R.id.txtdatell);
        time = findViewById(R.id.txttimel);
        age = findViewById(R.id.txtagel);
        blood = findViewById(R.id.txtblood);
        diseases = findViewById(R.id.txtsuf);
        connum = findViewById(R.id.txtcon);
        btnadd = findViewById(R.id.btnaddap);
        //male = findViewById(R.id.radb1);
        //female = findViewById(R.id.radb2);
        btnshow = findViewById(R.id.button2);
        btnupdate = findViewById(R.id.button3);
        btndelete = findViewById(R.id.button3);




        patObj = new patientSS();


    }




    private void clearControls() {
        nic.setText("");
        name.setText("");
        date.setText("");
        time.setText("");
        age.setText("");
        blood.setText("");
        diseases.setText("");
        connum.setText("");
    }



    public void CreateData(View view){



        dbRef = FirebaseDatabase.getInstance().getReference().child("ssData");



        if (TextUtils.isEmpty(nic.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(name.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(date.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(age.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(blood.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(diseases.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else if (TextUtils.isEmpty(connum.getText().toString())) {
            Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
        }else {









                patObj.setNic(nic.getText().toString().trim());
                patObj.setName(name.getText().toString().trim());
                patObj.setDate(date.getText().toString().trim());
                patObj.setTime(time.getText().toString().trim());
                patObj.setAge(age.getText().toString().trim());
                patObj.setBlood(blood.getText().toString().trim());
                patObj.setDiseases(diseases.getText().toString().trim());
                patObj.setConnum(connum.getText().toString().trim());


                //dbRef.push().setValue(patObj);
            dbRef.child("LabappointmentData").setValue(patObj);

                Toast.makeText(getApplicationContext(), "Add Appontment SuccessFully", Toast.LENGTH_SHORT).show();
                clearControls();
            }



    }






    public void showData(View view){
        DatabaseReference readRef = FirebaseDatabase.getInstance().getReference().child("ssData").child("LabappointmentData");
        readRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if (snapshot.hasChildren()){
                    nic.setText(snapshot.child("nic").getValue().toString());
                    name.setText(snapshot.child("name").getValue().toString());
                    date.setText(snapshot.child("date").getValue().toString());
                    time.setText(snapshot.child("time").getValue().toString());
                    age.setText(snapshot.child("age").getValue().toString());
                    blood.setText(snapshot.child("blood").getValue().toString());
                    diseases.setText(snapshot.child("diseases").getValue().toString());
                    connum.setText(snapshot.child("connum").getValue().toString());

                }
                else{
                    Toast.makeText(getApplicationContext(),"No Source to Display",Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }


    public void update(View view){
        DatabaseReference upRef = FirebaseDatabase.getInstance().getReference().child("ssData");
        upRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if(snapshot.hasChild("LabappointmentData")){

                    patObj.setNic(nic.getText().toString().trim());
                    patObj.setName(name.getText().toString().trim());
                    patObj.setDate(date.getText().toString().trim());
                    patObj.setTime(time.getText().toString().trim());
                    patObj.setAge(age.getText().toString().trim());
                    patObj.setBlood(blood.getText().toString().trim());
                    patObj.setDiseases(diseases.getText().toString().trim());
                    patObj.setConnum(connum.getText().toString().trim());


                    dbRef = FirebaseDatabase.getInstance().getReference().child("ssData").child("LabappointmentData");
                    dbRef.setValue(patObj);
                    clearControls();

                    Toast.makeText(getApplicationContext(),"Data Updated Successfully",Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"Not Updated", Toast.LENGTH_SHORT).show();
                }



            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });
    }





    public void deleteData(View view){
        DatabaseReference delRef = FirebaseDatabase.getInstance().getReference().child("ssData");
        delRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
                if (snapshot.hasChild("LabappointmentData")){
                    dbRef=FirebaseDatabase.getInstance().getReference().child("ssData").child("LabappointmentData");
                    dbRef.removeValue();
                    clearControls();
                    Toast.makeText(getApplicationContext(),"Deleted Appointment Successfully", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(getApplicationContext(),"No Data here", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onCancelled(@NonNull @NotNull DatabaseError error) {

            }
        });



    }



       /* dbRef = FirebaseDatabase.getInstance().getReference().child("pData");
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertPdata();
            }
        });

    }


    private void insertPdata() {


            if (TextUtils.isEmpty(nic.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(name.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(date.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(age.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(blood.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(diseases.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else if (TextUtils.isEmpty(connum.getText().toString()))
                Toast.makeText(getApplicationContext(), "Please Enter an Id", Toast.LENGTH_SHORT).show();
            else {


                //String m1 = male.getText().toString();
                //String m2 = female.getText().toString();

                //String gen;

                //if (male.isChecked()) {
                //    gen = m1;
               // } else {
               //     gen = m2;
               // }


                pdata.setNic(nic.getText().toString().trim());
                pdata.setName(name.getText().toString().trim());
                pdata.setGen(gender.getText().toString().trim());
                pdata.setDate(date.getText().toString().trim());
                pdata.setTime(time.getText().toString().trim());
                pdata.setAge(age.getText().toString().trim());
                pdata.setBlood(blood.getText().toString().trim());
                pdata.setDiseases(diseases.getText().toString().trim());
                pdata.setConnum(connum.getText().toString().trim());


                dbRef.push().setValue(pdata);

                Toast.makeText(getApplicationContext(), "Add Appontment SuccessFully", Toast.LENGTH_SHORT).show();
                clearControls();
            }


    } */






}