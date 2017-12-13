package com.dagger2.demo.case01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger2.demo.R;

import javax.inject.Inject;

public class Case01Activity extends AppCompatActivity {

    @Inject
    IntegerProducer ip;
    @Inject
    FatherProducer fp;
    private TextView line1;
    private TextView line2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case01);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        DaggerCase01Component.builder().build().inject(this);
    }

    public void test(View v) {
        line1.setText(String.valueOf(ip.produce()));
        line2.setText(String.valueOf(fp.produce()));
    }
}
