package com.kortain.poslite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.kortain.pos.domain.TestDomain;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TestDomain.test();
    }
}
