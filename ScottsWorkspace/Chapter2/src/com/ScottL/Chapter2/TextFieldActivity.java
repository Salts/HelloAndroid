package com.ScottL.Chapter2;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;

public class TextFieldActivity extends ButtonActivity implements OnClickListener{
     
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        edittext.setOnKeyListener(new OnKeyListener() {
			public boolean onKey(View arg0, int arg1, KeyEvent arg2) {
				return false;
			}
        });       

    }
}