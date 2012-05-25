package ltdarien.level2;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Level2Toaster extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toaster);
        
        String text = getIntent().getStringExtra("text");
        
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
	}
	
}
