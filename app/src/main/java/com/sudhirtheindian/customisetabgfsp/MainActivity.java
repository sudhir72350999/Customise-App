package com.sudhirtheindian.customisetabgfsp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.sudhirtheindian.customisetabgfsp.Fragment.AlgorithmFragment;
import com.sudhirtheindian.customisetabgfsp.Fragment.CourseFragment;
import com.sudhirtheindian.customisetabgfsp.Fragment.LoginFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.layout,new AlgorithmFragment()).commit();
    }
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.algo_lay:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new AlgorithmFragment()).commit();
                break;
            case R.id.course_lay:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new CourseFragment()).commit();
                break;
            case R.id.profile_lay:
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.layout,
                                new LoginFragment()).commit();
                break;
        }
    }
}