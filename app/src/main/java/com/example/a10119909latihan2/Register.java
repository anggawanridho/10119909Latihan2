package com.example.a10119909latihan2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Register extends AppCompatActivity {
    private RadioGroup gender;
    private RadioButton genderbutton;
    private Spinner blood;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    protected void back(View v){
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
    protected void register(View v){
        Intent intent = new Intent(this, AlmostThere.class);
        startActivity(intent);
    }
}
