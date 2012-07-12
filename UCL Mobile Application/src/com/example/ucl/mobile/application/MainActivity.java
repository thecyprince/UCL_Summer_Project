package com.example.ucl.mobile.application;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        Button about = (Button) findViewById(R.id.about);
        Button requirements = (Button) findViewById(R.id.requirements);
        Button gallery = (Button) findViewById(R.id.gallery);
        Button question = (Button) findViewById(R.id.question);
        

        
//        about.setOnClickListener(new OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				Intent intent = new Intent(MainActivity.this, About.class);
//				startActivity(intent);
//			}
//		});
        

        View.OnClickListener buttonHandler = new View.OnClickListener() {
        	
        	/**
        	 * switch statement to initialize correct activity depending on which button is selected
        	 */
            @Override
        	public void onClick(View v) {
            	
            	switch (v.getId()) {
            		case R.id.about:
            			Intent intentAbout = new Intent(MainActivity.this, About.class);
            			MainActivity.this.startActivity(intentAbout); 
            			break;
            		case R.id.requirements:
            			Intent intentRequirements = new Intent(MainActivity.this, Requirements.class);
            			MainActivity.this.startActivity(intentRequirements);
            			break;
            		case R.id.gallery:
            			Intent intentGallery = new Intent(MainActivity.this, Gallery.class);
            			MainActivity.this.startActivity(intentGallery);
            			break;
            		case R.id.question:
            			Intent intentQuestion = new Intent(MainActivity.this, Question.class);
            			MainActivity.this.startActivity(intentQuestion);
            			break;
            	}
            }
        };
        
        about.setOnClickListener(buttonHandler);
        requirements.setOnClickListener(buttonHandler);
        gallery.setOnClickListener(buttonHandler);
        question.setOnClickListener(buttonHandler);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    
}
    

