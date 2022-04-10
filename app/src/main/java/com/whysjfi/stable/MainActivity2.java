package com.whysjfi.stable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import com.example.annotation_s.BindView;

public class MainActivity2 extends AppCompatActivity {

    @BindView(R.id.btn_test1)
    Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JettButterknife.bind(this);
        Log.d("whysjfi", "#############33 instance = " + btn1);

    }
}