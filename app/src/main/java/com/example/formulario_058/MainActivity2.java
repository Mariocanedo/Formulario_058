package com.example.formulario_058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.example.formulario_058.databinding.ActivityMain2Binding;

public class MainActivity2 extends AppCompatActivity {



    private ActivityMain2Binding mBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mBinding = ActivityMain2Binding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

       Intent intent= getIntent();

       Log.d("Prueba 3",intent.getStringExtra("Name"));

       if(intent!= null){

           mBinding.Name.setText(intent.getStringExtra("Name"));
           mBinding.Mail.setText(intent.getStringExtra("Correo"));
           mBinding.phone.setText(intent.getStringExtra("Phone"));
       }
    }
}