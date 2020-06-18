package com.example.material_nav_toolbar_fragcommu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.VH> {

    private Context context;
    private List<Job> jobList;
    private AdapterCallback adapterCallback;

    public ListAdapter(Context context, List<Job> jobDetailsList, AdapterCallback adapterCallback) {
        this.context = context;
        this.jobList = jobDetailsList;
        this.adapterCallback = adapterCallback;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list,parent,false);
        VH vh=new VH(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, final int position) {

        holder.title.setText(jobList.get(position).getJodTitle());
        holder.details.setText(jobList.get(position).getJobDetails());
        holder.startdate.setText(jobList.get(position).getApplicationStartDate());
        holder.enddate.setText(jobList.get(position).getApplicationEndDate());
        holder.publicationdate.setText(jobList.get(position).getJobCircularPublicationDate());


        holder.jobListCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapterCallback.onViewClickCallback(jobList.get(position).getJobid());
            }
        });
    }

    @Override
    public int getItemCount() {
        return jobList.size();
    }

    public class VH extends RecyclerView.ViewHolder {
        TextView title,details,startdate,enddate,publicationdate;
        ImageView startBlock;
        CardView jobListCardView;
        public VH(@NonNull View itemView) {
            super(itemView);
            jobListCardView=itemView.findViewById(R.id.joblistCardView);
            startBlock=itemView.findViewById(R.id.startblock);
            title=itemView.findViewById(R.id.jobTitle);
            details=itemView.findViewById(R.id.jobDetails);
            startdate=itemView.findViewById(R.id.jobApplicationStartDate);
            enddate=itemView.findViewById(R.id.jobApplicationEndDate);
            publicationdate=itemView.findViewById(R.id.jobNoticePublicationDate);
        }
    }

}
