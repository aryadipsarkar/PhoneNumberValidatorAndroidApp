package com.example.arya.aryasapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhonePageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_page);

        Button button=(Button)findViewById(R.id.button3);

        button.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View view){
                        EditText text=(EditText)findViewById(R.id.editText);

                        String toDisplay=text.getText().toString();
                        String pattern="\\([0-9]{3}\\)\\s?[0-9]{3}-[0-9]{4}";

                        Pattern p=Pattern.compile(pattern);
                        Matcher m=p.matcher(toDisplay);
                        if (m.find()){
                            String display=m.group(0);
                            Intent implicit= new Intent(Intent.ACTION_DIAL);
                            implicit.setData(Uri.parse("tel:"+display));
                            startActivity(implicit);

                        }else{
                            Toast.makeText(PhonePageActivity.this,
                                    "Please check your phone number format", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
