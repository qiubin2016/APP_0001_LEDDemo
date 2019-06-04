package com.qb.app_0001_leddemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

import java.security.PrivateKey;

import com.qb.hardlibrary.*;

/**
 * (1)ALL ON ==> ALL OFF【勾选4个LED】
 * (2)ALL OFF ==> ALL ON【取消勾选】
 * (3)单独勾选LED
 */
public class MainActivity extends AppCompatActivity {
    private static final String TAG = "LEDDemo";
    private boolean ledon = false;

    private Button button;
    private CheckBox checkBoxLed1;
    private CheckBox checkBoxLed2;
    private CheckBox checkBoxLed3;
    private CheckBox checkBoxLed4;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.BUTTON);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Perform action on click
                HardControl hardControl = new HardControl();

                ledon = !ledon;
                if (ledon) {
                    Log.d(TAG, "ALL ON");
                    button.setText("ALL OFF");
                    checkBoxLed1.setChecked(true);  //选中
                    checkBoxLed2.setChecked(true);
                    checkBoxLed3.setChecked(true);
                    checkBoxLed4.setChecked(true);
                } else {
                    Log.d(TAG, "ALL OFF");
                    button.setText("ALL ON");
                    checkBoxLed1.setChecked(false);
                    checkBoxLed2.setChecked(false);
                    checkBoxLed3.setChecked(false);
                    checkBoxLed4.setChecked(false);
                }

            }
        });

        checkBoxLed1 = findViewById(R.id.LED1);
        checkBoxLed2 = findViewById(R.id.LED2);
        checkBoxLed3 = findViewById(R.id.LED3);

        checkBoxLed4 = findViewById(R.id.LED4);
    }

    public void onCheckBoxClicked(View view) {
        boolean checked = ((CheckBox)view).isChecked();

        switch (view.getId()) {
            case R.id.LED1:
                if (checked) {
                    Log.d(TAG, "LED1 on");
                    Toast.makeText(getApplicationContext(), "LED1 on", Toast.LENGTH_SHORT).show();
                } else {
                    Log.d(TAG, "LED1 off");
                    Toast.makeText(getApplicationContext(), "LED1 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED2:
                if (checked) {
                    Log.d(TAG, "LED2 on");
                    Toast.makeText(getApplicationContext(), "LED2 on", Toast.LENGTH_SHORT).show();
                }else {
                    Log.d(TAG, "LED2 off");
                    Toast.makeText(getApplicationContext(), "LED2 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED3:
                if (checked) {
                    Log.d(TAG, "LED3 on");
                    Toast.makeText(getApplicationContext(), "LED3 on", Toast.LENGTH_SHORT).show();
                }else {
                    Log.d(TAG, "LED3 off");
                    Toast.makeText(getApplicationContext(), "LED3 off", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.LED4:
                if (checked) {
                    Log.d(TAG, "LED4 on");
                    Toast.makeText(getApplicationContext(), "LED4 on", Toast.LENGTH_SHORT).show();
                }else {
                    Log.d(TAG, "LED4 off");
                    Toast.makeText(getApplicationContext(), "LED4 off", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }
}
