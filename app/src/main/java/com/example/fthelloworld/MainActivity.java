package com.example.fthelloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvMain;
    private  boolean isHelloWorld;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.tvMain = (TextView)findViewById(R.id.tvMain);
        this.isHelloWorld = true;
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
}