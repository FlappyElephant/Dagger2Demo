package com.dagger2.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.dagger2.demo.case01.Case01Activity;
import com.dagger2.demo.case02.Case02Activity;
import com.dagger2.demo.case03.Case03Activity;
import com.dagger2.demo.case05.Case051Activity;
import com.dagger2.demo.case05.Case052Activity;
import com.dagger2.demo.case05.Case053Activity;
import com.dagger2.demo.case05.Case05Activity;
import com.dagger2.demo.case06.Case061Activity;
import com.dagger2.demo.case06.Case06Activity;
import com.dagger2.demo.case04.Case04Activity;
import com.dagger2.demo.case06.Case06Component;
import com.dagger2.demo.case06.DaggerCase06Component;

public class MainActivity extends AppCompatActivity {

    private Case06Component case06Component;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        case06Component = DaggerCase06Component.builder().build();
    }

    public void testCase01(View v) {
        startActivity(new Intent(this, Case01Activity.class));
    }

    public void testCase02(View v) {
        startActivity(new Intent(this, Case02Activity.class));
    }

    public void testCase03(View v) {
        startActivity(new Intent(this, Case03Activity.class));
    }

    public void testCase04(View v) {
        startActivity(new Intent(this, Case04Activity.class));
    }

    public void testCase05(View v) {
        startActivity(new Intent(this, Case05Activity.class));
    }

    public void testCase05_1(View v) {
        startActivity(new Intent(this, Case051Activity.class));
    }

    public void testCase05_2(View v) {
        startActivity(new Intent(this, Case052Activity.class));
    }

    public void testCase05_3(View v) {
        startActivity(new Intent(this, Case053Activity.class));
    }

    public void testCase06(View v) {
        startActivity(new Intent(this, Case06Activity.class));
    }

    public void testCase06_1(View v) {
        startActivity(new Intent(this, Case061Activity.class));
    }

    public Case06Component getCase06Component() {
        return case06Component;
    }
}
