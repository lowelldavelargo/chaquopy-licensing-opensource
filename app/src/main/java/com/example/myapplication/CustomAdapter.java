package com.example.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder>  {

    private Context context;
    private ArrayList student_id, student_fullname, student_idnumber, student_mobilenumber, student_score;

    CustomAdapter(Context context, ArrayList student_id, ArrayList student_fullname, ArrayList student_idnumber,
                  ArrayList student_mobilenumber, ArrayList student_score){
        this.context = context;
        this.student_id = student_id;
        this.student_fullname = student_fullname;
        this.student_idnumber = student_idnumber;
        this.student_mobilenumber = student_mobilenumber;
        this.student_score = student_score;
    }
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.student_id_txt.setText(String.valueOf(student_id.get(position)));
        holder.student_fullname_txt.setText(String.valueOf(student_fullname.get(position)));
        holder.student_idnumber_txt.setText(String.valueOf(student_idnumber.get(position)));
        holder.student_mobilenumber_txt.setText(String.valueOf(student_mobilenumber.get(position)));
        holder.student_score_txt.setText(String.valueOf(student_score.get(position)));

    }

    @Override
    public int getItemCount() {
        return student_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView student_id_txt, student_fullname_txt, student_idnumber_txt, student_mobilenumber_txt,student_score_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            student_id_txt = itemView.findViewById(R.id.student_id_txt);
            student_fullname_txt = itemView.findViewById(R.id.student_fullname_txt);
            student_idnumber_txt = itemView.findViewById(R.id.student_idnumber_txt);
            student_mobilenumber_txt = itemView.findViewById(R.id.student_mobilenumber_txt);
            student_score_txt = itemView.findViewById(R.id.student_score_txt);
        }
    }
}
