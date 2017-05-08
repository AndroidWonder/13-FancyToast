package com.course.example.fancytoast;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
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

				// set image
				ImageView image = (ImageView)layout.findViewById(R.id.image);
				image.setImageResource(R.drawable.ic_launcher);

				// set a message
				TextView text = (TextView)layout.findViewById(R.id.text);
				text.setText("Android forever");
				
				// set second image
				ImageView image2 = (ImageView) layout.findViewById(R.id.image2);
				image2.setImageResource(R.drawable.ic_launcher);

				// Toast...
				Toast toast = new Toast(getApplicationContext());
				toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
				toast.setDuration(Toast.LENGTH_LONG);
				toast.setView(layout);
				toast.show();

			}
		});

	}
}