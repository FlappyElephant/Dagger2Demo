package com.dagger2.demo.case03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger2.demo.R;
import com.dagger2.demo.case01.IntegerProducer;
import com.dagger2.demo.case02.ColorPicker;

import javax.inject.Inject;



public class Case03Activity extends AppCompatActivity {
    @Inject
    IntegerProducer ip;
    @Inject
    ColorPicker cp;
    private TextView line1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case03);
        line1 = (TextView) findViewById(R.id.line1);
        DaggerCase03Component.builder().build().inject(this);
    }

    public void test(View v) {
        line1.setText(String.valueOf(ip.produce()));
        line1.setTextColor(cp.pick());
    }
}
