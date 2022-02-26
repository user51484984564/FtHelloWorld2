package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private  boolean isHelloWorld;
    private boolean isColorChange;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.isHelloWorld = true;
        this.isColorChange = true;
    }

    public void onBtnMainClick(View view) {
        String currentValue = this.tvMain.getText().toString();
        if(this.isHelloWorld){
            this.tvMain.setText("Somethin new");
        }
        else {
            this.tvMain.setText(R.string.label_name);
        }
        this.isHelloWorld = !this.isHelloWorld;
    }

    public void onBtnMainChangeColor(View view) {
        ColorStateList currentValue = this.tvMain.getTextColors();
        if(this.isColorChange){
            this.tvMain.setTextColor(Color.rgb(80,200, 80));
        }
        else {
            this.tvMain.setTextColor(Color.rgb(0,0, 0));
        }
        this.isColorChange = !this.isColorChange;
    }
}