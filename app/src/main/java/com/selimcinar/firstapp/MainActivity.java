package com.selimcinar.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    //public heryerden erişilir void geriye birşey döndürmüyor
    public void changeImage(View view) {
        //metotve(View sınıf adı view obje adı)
        ImageView imageView = findViewById(R.id.imageView);
        //ImageViewdan bir nesne oluşturduk ve idsi imageView olana eşitledik
        imageView.setImageResource(R.drawable.grogecy);
        //Tıklanınca resmi değiştir.
    }

    
}