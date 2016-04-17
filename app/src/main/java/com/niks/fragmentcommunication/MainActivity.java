package com.niks.fragmentcommunication;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;

public class MainActivity extends FragmentActivity implements Communicate
{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}



	@Override
	public void sendData(String message)
	{
		myToast("sendData "+message);
	}

	private void myToast(String string)
	{
		Toast.makeText(getApplicationContext(), string, Toast.LENGTH_LONG).show();

	}

}