package com.example.material_nav_toolbar_fragcommu;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.material_nav_toolbar_fragcommu.databinding.FragmentSecondFragentBinding;


public class SecondFragent extends Fragment {
    private static String TAG="SecondFragent";
    private FragmentSecondFragentBinding binding;

    public SecondFragent() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentSecondFragentBinding.inflate(inflater,container,false);
        View view= binding.getRoot();

        setHasOptionsMenu(true);

        ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ((AppCompatActivity)getActivity()).getSupportActionBar().setHomeAsUpIndicator(R.drawable.arrow_left_white);

        return view;
    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.menu_with_download,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected: called");
        if(item.getItemId()==R.id.download_toolbar){
            Toast.makeText(getContext(), "Downloading...", Toast.LENGTH_SHORT).show();
        }else  if(item.getItemId()==android.R.id.home){
            Log.d(TAG, "onOptionsItemSelected: back arrow");
        }

        return super.onOptionsItemSelected(item);
    }

}
