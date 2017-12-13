package com.dagger2.demo.case05;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.dagger2.demo.R;
import com.dagger2.demo.case04.AddressProducer;

import javax.inject.Inject;

public class Case05Activity extends AppCompatActivity {
    @Inject
    AddressProducer ap1;
    @Inject
    AddressProducer ap2;
    private TextView line1;
    private TextView line2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case05);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        DaggerCase05Component.builder().build().inject(this);
    }

    public void test(View v) {
        line1.setText(ap1.produce());
        line2.setText(ap2.produce());
    }
}
