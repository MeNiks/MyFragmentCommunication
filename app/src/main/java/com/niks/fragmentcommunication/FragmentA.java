package com.niks.fragmentcommunication;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;

public class FragmentA extends Fragment implements OnClickListener
{
	Button button;
	Communicate cm;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub

		return inflater.inflate(R.layout.layout_fragmenta, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState)
	{
		// TODO Auto-generated method stub
		super.onActivityCreated(savedInstanceState);
		cm = (Communicate) getActivity();
		button = (Button) getActivity().findViewById(R.id.button1);
		button.setOnClickListener(this);
	}

	@Override
	public void onClick(View arg0)
	{
		// TODO Auto-generated method stub

		cm.sendData("This is name");
	}

}