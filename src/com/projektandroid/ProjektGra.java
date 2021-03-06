package com.projektandroid;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.Menu;
import android.view.WindowManager;
//import android.view.View;
//import android.widget.Button;
//import android.view.View.OnClickListener;

import com.badlogic.gdx.backends.android.AndroidApplication;
import com.badlogic.gdx.backends.android.AndroidApplicationConfiguration;

public class ProjektGra extends AndroidApplication {

	//private Button button;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_projekt_gra);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT); //setting static screen orientation
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON); // while the application runs, screen will not go blank
        
        
        final AndroidApplicationConfiguration cfg = new AndroidApplicationConfiguration();
        cfg.useGL20 = false;
        cfg.useAccelerometer = true;
        initialize(new Tyrian(), cfg);
    }
    
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_projekt_gra, menu);
        return true;
    }
}