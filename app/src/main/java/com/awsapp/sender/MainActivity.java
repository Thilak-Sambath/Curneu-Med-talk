package com.awsapp.sender;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import  android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity {

    TextView name;
    TextView label;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (TextView) findViewById(R.id.nameid);
        label = (TextView) findViewById(R.id.textView);
        btn = (Button) findViewById(R.id.btn1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = "Hey " + name.getText().toString();
                Toast.makeText(MainActivity.this, str.toString(), Toast.LENGTH_LONG).show();
                label.setText(name.getText());

            }
        });

    }
}
