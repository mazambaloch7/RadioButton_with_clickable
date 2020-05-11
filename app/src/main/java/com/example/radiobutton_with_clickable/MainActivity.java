package com.example.radiobutton_with_clickable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup radio_Group;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.textView);

        radio_Group  = findViewById(R.id.radio_Group);
        radio_Group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if ( checkedId == R.id.radioRed )
                {
                    Toast.makeText(MainActivity.this, "Red", Toast.LENGTH_SHORT).show();
                    radio_Group.setBackgroundColor(getResources().getColor(android.R.color.holo_red_dark));
                    textView.setText("You have select the Red Radio  Button");
                    textView.setTextColor(getResources().getColor(android.R.color.holo_red_dark));
                }
                else if (checkedId == R.id.radioYellow)
                {
                    Toast.makeText(MainActivity.this, "Yellow", Toast.LENGTH_SHORT).show();
                    radio_Group.setBackgroundColor(getResources().getColor(android.R.color.holo_orange_light));
                    textView.setText("You have select the Yellow Radio  Button");
                    textView.setTextColor(getResources().getColor(android.R.color.holo_orange_light));
                }
                else if (checkedId == R.id.radioBlue)
                {

                    Toast.makeText(MainActivity.this, "Blue", Toast.LENGTH_SHORT).show();
                    radio_Group.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                    textView.setText("You have select the Blue Radio  Button");
                    textView.setTextColor(getResources().getColor(android.R.color.holo_blue_dark));
                }
                else if (checkedId == R.id.radioblack)
                {

                    Toast.makeText(MainActivity.this, "Blue", Toast.LENGTH_SHORT).show();
                    radio_Group.setBackgroundColor(getResources().getColor(android.R.color.holo_green_dark));
                    textView.setText("You have select the Green Radio  Button");
                    textView.setTextColor(getResources().getColor(android.R.color.holo_green_dark));

                }
                else
                {
                    radio_Group.setBackgroundColor(getResources().getColor(android.R.color.white));
                    textView.setText("please Select the one of the button");
                    textView.setBackgroundResource(android.R.color.black);
                }
            }
        });

    }
}
