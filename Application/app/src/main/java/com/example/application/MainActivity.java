package com.example.application;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;
import java.sql.Timestamp;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import java.sql.Timestamp;
import java.util.Date;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.application.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn = findViewById(R.id.button);

        Date date= new Date();
        long time = date.getTime();

        DB entry = new DB();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random random = new Random();
                int temp1 = random.nextInt(1000);
                txt.setText(Integer.toString(temp1));
                Timestamp temp2 = new Timestamp(time);
                Data data = new Data(txt.getText().toString(),temp2.toString());
                entry.add(data);
            }
        });

        btn2 = (Button) findViewById(R.id.backbtn);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHistory();
            }
        });
    }

    public void openHistory(){
        Intent intent = new Intent(this, History.class);
        startActivity(intent);
    }
}