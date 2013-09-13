package com.example.studentregistration;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {
	private Spinner cobSex;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addItemsOnCob();	
	}
	public void addItemsOnCob() {
		 
		cobSex = (Spinner) findViewById(R.id.cobSex);
		List<String> list = new ArrayList<String>();
		list.add("M");
		list.add("F");
		
		ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
			android.R.layout.simple_spinner_item, list);
		dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		cobSex.setAdapter(dataAdapter);
	  }
	
}
