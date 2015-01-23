package com.example.Beautiful_Bangladesh;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Sazzad on 1/22/2015.
 */
public class manu extends Activity implements View.OnClickListener{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.manulay);
        Intent a=getIntent();
    }
    public void onClick(View v)
    {

    }
}