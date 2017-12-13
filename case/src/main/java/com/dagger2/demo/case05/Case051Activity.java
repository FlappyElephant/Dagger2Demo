package com.dagger2.demo.case05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger2.demo.R;
import com.dagger2.demo.case04.AddressProducer;

import javax.inject.Inject;


public class Case051Activity extends AppCompatActivity {
    @Inject
    AddressProducer ap1;
    private TextView line1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case051);
        line1 = (TextView) findViewById(R.id.line1);
         DaggerCase05Component.builder().build().inject(this);
    }


    public void test(View v) {
        line1.setText(ap1.produce());
    }
}
