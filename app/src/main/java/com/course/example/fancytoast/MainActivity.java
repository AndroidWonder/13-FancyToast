package com.course.example.fancytoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Button button;

	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		button = (Button) findViewById(R.id.buttonToast);

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View view) {

				// get your custom_toast.xml layout
				LayoutInflater inflater = getLayoutInflater();

				View layout = inflater.inflate(R.layout.custom_toast,
						(ViewGroup) findViewById(R.id.custom_toast_layout_id));

				// set a message
				TextView text = (TextView)layout.findViewById(R.id.text);
				text.setText("Android forever");

				// Toast...
				Toast toast = new Toast(MainActivity.this);
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);
				toast.show();

			}
		});

	}
}