package com.ready;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;

public class JavaFragment extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater,ViewGroup container,
			Bundle savedInstanceState){
		//TODO Auto-generated method stub
		return inflater.inflate(R.layout.java_layout ,container,false);
		
	}

}
