package com.ScottL.Chapter2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ButtonActivity extends Activity implements OnClickListener{
    
    EditText edittext;
    Button button1;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        Button button1 = (Button) findViewById(R.id.button1);
        final EditText edittext = (EditText) findViewById(R.id.edittext);
        
        button1.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Toast.makeText(getBaseContext() , edittext.getText(), 250).show();
			}
		}); 
    edittext.setOnKeyListener(new OnKeyListener() {
    	public boolean onKey(View v, int keyCode, KeyEvent event) {
    		if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
    	            (keyCode == KeyEvent.KEYCODE_ENTER)) {
    				Toast.makeText(getBaseContext() , edittext.getText(), 250).show();
    				return true;
    		}
    				return false;
    	}
	});
    }

	public void onClick(View v) {
		Intent intent = new Intent(ButtonActivity.this, TextFieldActivity.class);
		intent.putExtra("text", edittext.getText().toString());
		startActivity(intent);
	}
}
