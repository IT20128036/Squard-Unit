package com.example.healthyrate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.healthyrate.databinding.ActivityCovidTestResultBinding;
import com.example.healthyrate.databinding.ActivityMainBinding;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import org.jetbrains.annotations.NotNull;

public class Covid_Test_Result extends AppCompatActivity {

  ActivityCovidTestResultBinding binding;
   String ptid,ptname,ptstatus;
   FirebaseDatabase db;
   DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCovidTestResultBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    binding.btnsave.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            ptid = binding.ptid.getText().toString();
            ptname = binding.ptname.getText().toString();
            ptstatus = binding.ptstatus.getText().toString();

            if (!ptid.isEmpty() && !ptname.isEmpty() && !ptstatus.isEmpty() ){

                Result result = new Result(ptid,ptname,ptstatus);
                db = FirebaseDatabase.getInstance();
                reference = db.getReference("Covid_Test_Result");
                reference.child(ptid).setValue(result).addOnCompleteListener(new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull @NotNull Task<Void> task) {

                        binding.ptid.setText("");
                        binding.ptname.setText("");
                        binding.ptstatus.setText("");
                        Toast.makeText(Covid_Test_Result.this,"Successfuly Saved",Toast.LENGTH_SHORT).show();

                    }
                });
            }

        }
    });


    }
}