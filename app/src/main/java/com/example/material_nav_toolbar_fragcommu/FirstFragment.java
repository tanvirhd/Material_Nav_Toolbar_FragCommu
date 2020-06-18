package com.example.material_nav_toolbar_fragcommu;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.material_nav_toolbar_fragcommu.databinding.FragmentFirstBinding;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment implements AdapterCallback {

    private static String TAG="HomeFragment";
    private FragmentFirstBinding binding;

    private ListAdapter listAdapter;
    private List<Job> jobList;
    private Fragment_Communication fragmentCommunication;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        binding=FragmentFirstBinding.inflate(inflater,container,false);
        View view=binding.getRoot();

        setHasOptionsMenu(true);

        binding.recycHomeJobList.setLayoutManager(new LinearLayoutManager(getActivity()));
        binding.recycHomeJobList.setAdapter(initJobDetailsAdapter());
        return view;
    }//end of onCreateView


    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {
        inflater.inflate(R.menu.toolbar_menu,menu);
        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Log.d(TAG, "onOptionsItemSelected: called");
        if(item.getItemId()==R.id.qna){
            Toast.makeText(getContext(), "Q & A", Toast.LENGTH_SHORT).show();
        }
        return super.onOptionsItemSelected(item);
    }

    private ListAdapter initJobDetailsAdapter(){
        jobList =new ArrayList<>();

        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));
        jobList.add(new Job("null","Ttile"
                ,"string/dummyshorttext","string/applicationStartDate"
                ,"string/applicationEndDate","null","00/00/0000",true));





        listAdapter =new ListAdapter(getActivity(), jobList,this);
        return listAdapter;
    }

    @Override
    public void onViewClickCallback(String jobUID) {
        fragmentCommunication.doTransaction("JobCircularFragment",jobUID);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        fragmentCommunication=(Fragment_Communication)getActivity();
    }
}
