package org.sunchao;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends Activity {
	private EditText one;
	private EditText two;
	private TextView chen;
	private Button button;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        one = (EditText) findViewById(R.id.one);
        two = (EditText) findViewById(R.id.two);
        chen = (TextView) findViewById(R.id.chen);
        button = (Button) findViewById(R.id.button);
        chen.setText(R.string.symbol);
        button.setText(R.string.click);
        button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(Main.this, Result.class);
				intent.putExtra("one", one.getText().toString());
				intent.putExtra("two", two.getText().toString());
				startActivity(intent);
			}
		});
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, 1, 1, "ÍË³ö");
		menu.add(0, 2, 2, "¹ØÓÚ");
		return super.onCreateOptionsMenu(menu);
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if (item.getItemId() == 1) {
			finish();
		} else {
			System.out.println("about");
		}
		return super.onOptionsItemSelected(item);
	}
}