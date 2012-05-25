package ltdarien.level2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Level2Activity extends Activity implements OnClickListener{
    /** Called when the activity is first created. */
	
	EditText etMain;
	Button button1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        etMain = (EditText) findViewById(R.id.editText1);
        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
		Intent intent = new Intent(Level2Activity.this, Level2Toaster.class);
		intent.putExtra("text", etMain.getText().toString());
		startActivity(intent);
		
	}
}