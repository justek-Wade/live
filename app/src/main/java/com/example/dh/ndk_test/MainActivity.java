package com.example.dh.ndk_test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textview);
         NdkJniUtils ndkJniUtils = new NdkJniUtils();
        textView.setText(ndkJniUtils.getCLanguageString());
    }
}
