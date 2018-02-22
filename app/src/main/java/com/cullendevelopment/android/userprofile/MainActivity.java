package com.cullendevelopment.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView picture = (ImageView) findViewById(R.id.profile_picture);
        picture.setImageResource(R.drawable.me);


        TextView displayName = findViewById(R.id.name);
        displayName.setText("Paul");
        /** Set your profile name size*/
        displayName.setTextSize(48);
        /** Set your profile name color*/
        displayName.setTextColor(Color.BLUE);

        TextView displayBirthday = findViewById(R.id.birthday);
        displayBirthday.setText("October 22nd 1961");
        /** Set your profile birthday text size*/
        displayBirthday.setTextSize(32);
        /** Set your profile Birthday color*/
        displayBirthday.setTextColor(Color.BLUE);

        TextView displayCountry =findViewById(R.id.country);
        displayCountry.setText("United Kingdom");
        /** Set your profile Country Text size*/
        displayCountry.setTextSize(32);
        /** Set your profile Country color*/
        displayCountry.setTextColor(Color.BLUE);

    }

}
