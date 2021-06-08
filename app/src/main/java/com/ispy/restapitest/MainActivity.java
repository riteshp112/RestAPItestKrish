package com.ispy.restapitest;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import com.google.api.services.sheets.v4.*;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.services.sheets.v4.Sheets;
import com.google.api.services.sheets.v4.model.Spreadsheet;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import com.google.api.services.sheets.v4.model.*;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            String sptid="";
            List<int> marksc =new ArrayList<>();
            List<String> newc =new ArrayList<>();
            Spreadsheet ssheet =new Spreadsheet();
            ssheet=service.spreedsheets().create(ssheet).setfields("")


            }
        });
    }
    }

