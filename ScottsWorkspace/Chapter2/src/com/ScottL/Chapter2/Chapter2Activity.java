package com.ScottL.Chapter2;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.Button;

public class Chapter2Activity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        final EditText edittext = (EditText) findViewById(R.id.edittext);
        Button button1 = (Button) findViewById(R.id.button1);
        
        edittext.setOnKeyListener(new OnKeyListener() {
        	public boolean onKey(View v, int keyCode, KeyEvent event) {
        		if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
        				(keyCode == KeyEvent.KEYCODE_ENTER)) {
        			Toast.makeText(getBaseContext() , edittext.getText(), 250).show();
        			return true;
        		}
        		return false;
        	}
        }); 			       // This makes it so that you can Type then                              
                                           // press the enter Button
                                           // Press the 'ENTER' key, or you can   
        
        button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getBaseContext() , edittext.getText(), 250).show();
			}
		}); 			// This is the code for the actual button, NOT the key
    }
}