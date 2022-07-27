package com.smntg.project2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void honda(View view) {
        honda honda=new honda();
        FragmentManager
                fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,honda);
        ft.commit();

    }

    public void yamaha(View view) {
        yamaha yamaha=new yamaha();
        FragmentManager
                fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,yamaha);
        ft.commit();
    }

    public void suzuki(View view) {
        suzuki suzuki=new suzuki();
        FragmentManager
                fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,suzuki);
        ft.commit();
    }

    public void kawasaki(View view) {
        kawasaki kawasaki=new kawasaki();
        FragmentManager
                fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frame,kawasaki);
        ft.commit();
    }
}