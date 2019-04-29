package com.alick.aptlearn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.alick.apt_annotation.BindView;
import com.alick.apt_library.BindViewTools;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_test)
    Button btn_test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BindViewTools.bind(this);

        btn_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"哈哈",Toast.LENGTH_SHORT).show();
            }
        });

    }


}
