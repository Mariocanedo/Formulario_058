package com.example.formulario_058;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.formulario_058.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

        // declara intent para enviar datos
        Intent passSecond = getIntent();
        // busco elementos

        mBinding.Name.setText("JOSE PEÑA");
        mBinding.Mail.setText("JOSE.PEÑA@HOTMAIL.COM");
        mBinding.phone.setText("97434545");

           mBinding.btn1.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   String name = mBinding.Name.getText().toString();
                   String correo = mBinding.Mail.getText().toString();
                   String Phone = mBinding.phone.getText().toString();
                   Log.d("Prueba"," "+name +" " + correo);
                   Toast.makeText(MainActivity.this, "hola"+ name+ ""+correo,Toast.LENGTH_LONG).show();
                   passSecond(name,correo,Phone);
               }
           });

    }



    private void passSecond(String name ,String correo, String Phone){
        // donde estoy y donde voy
         Intent passSecond= new Intent(MainActivity.this,MainActivity2.class);
          Log.d("Prueba2"," "+name +" " + correo);
           passSecond.putExtra("Name",name);
        passSecond.putExtra("Correo",correo);
        passSecond.putExtra("Phone",Phone);
        startActivity(passSecond);
    }

}