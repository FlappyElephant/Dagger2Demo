package com.dagger2.demo.case02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dagger2.demo.R;

import javax.inject.Inject;
import javax.inject.Named;

public class Case02Activity extends AppCompatActivity {

//    @Inject
//    ColorPicker cp;
    @Inject
    @Named("green")
    ColorPicker cp1;
    @Inject
    @Named("blue")
    ColorPicker cp2;
    private TextView line1;
    private TextView line2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_case02);
        line1 = (TextView) findViewById(R.id.line1);
        line2 = (TextView) findViewById(R.id.line2);
        DaggerCase02Component.builder().build().inject(this);
    }
    public void test(View v) {
//        line1.setTextColor(cp.pick());
//        line2.setTextColor(cp.pick());
        line1.setTextColor(cp1.pick());
        line2.setTextColor(cp2.pick());
    }
}
