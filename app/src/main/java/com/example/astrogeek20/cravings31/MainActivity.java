package com.example.astrogeek20.cravings31;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Show(View view)
    {
        String button_txt;

        button_txt=((Button) view).getText().toString();
        if (button_txt.equals("go to maps"))
        {
            Intent intent = new Intent(this,MapsActivity.class);
            startActivity(intent);
        }
    }
}
