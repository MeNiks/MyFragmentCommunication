package com.niks.fragmentcommunication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
 
public class FragmentB extends Fragment{
int count;
TextView textView1;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, 
            Bundle savedInstanceState) {
        // TODO Auto-generated method stub
         
        return inflater.inflate(R.layout.layout_fragmentb, container, false);
    }
     
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onActivityCreated(savedInstanceState);
        textView1 = (TextView)getActivity().findViewById(R.id.textView1);
         
    }
 
    public void incrementData(){
        String string = textView1.getText().toString();
        count = Integer.parseInt(string);
        count++;
        textView1.setText(String.valueOf(count));
    }
 
}