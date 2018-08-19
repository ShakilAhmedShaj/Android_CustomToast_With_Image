package com.t3ch.shaj.customtoasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button showButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showButton = findViewById(R.id.show_button_ID);
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LayoutInflater inflater = getLayoutInflater();

                View customView = inflater.inflate(R.layout.custom_toast, (ViewGroup) findViewById(R.id.Toast_ID));

                Toast toast = new Toast(MainActivity.this);
                toast.setDuration(Toast.LENGTH_SHORT);
//                toast.setGravity(Gravity.CENTER, 0, 0);
                toast.setView(customView);
                toast.show();

            }
        });

    }
}
