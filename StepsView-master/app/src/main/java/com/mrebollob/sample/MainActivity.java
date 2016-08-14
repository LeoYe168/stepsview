package com.mrebollob.sample;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.mrebollob.stepsview.StepsView;

public class MainActivity extends AppCompatActivity {

    private StepsView stepsView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        stepsView = (StepsView) findViewById(R.id.steps_view);

        final String[] steps = {"step1", "step2", "step3"};
        stepsView.setLabels(steps)
                .setBarColorIndicator(Color.GRAY)
                .setProgressColorIndicator(Color.RED)
                .setLabelColorIndicator(Color.BLACK)
                .setCompletedPosition(2)
                .drawView();

    }
}
