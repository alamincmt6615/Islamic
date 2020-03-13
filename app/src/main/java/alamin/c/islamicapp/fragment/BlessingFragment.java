package alamin.c.islamicapp.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import alamin.c.islamicapp.R;

public class BlessingFragment extends Fragment {


    public BlessingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Toast.makeText(getActivity(), "ha ha ha ", Toast.LENGTH_SHORT).show();
        return inflater.inflate(R.layout.fragment_blessing, container, false);
    }

}
