package com.imaginers.tonmo.startbinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.imaginers.tonmo.startbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inflates the layout with databinding
        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);

        //finds view by binding
        binding.textView.setText("Hey databinding works!");
    }
}
