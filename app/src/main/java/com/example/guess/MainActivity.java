package com.example.guess;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View v) {
        EditText inputBox = (EditText) findViewById(R.id.input);
        String str = inputBox.getText().toString();

        int guess = Integer.parseInt(str);
        int randomNum = (int) Math.floor(Math.random()*(10)+1);
        String isSame = guess+" "+randomNum+" "+"wrong";
        if (guess == randomNum)
            isSame = guess+" "+randomNum+" "+"right";;
        ((TextView) findViewById(R.id.output)).setText(isSame);
    }
}