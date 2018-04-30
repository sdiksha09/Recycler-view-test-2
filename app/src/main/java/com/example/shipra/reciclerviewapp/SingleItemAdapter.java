package com.example.shipra.reciclerviewapp;

import android.content.Context;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class SingleItemAdapter extends RecyclerView.Adapter<SingleItemAdapter.itemViewHolder>{


    private String[] data;


    Context context;


    public SingleItemAdapter(String[] data) {

        this.data = data;
        this.context = this.context;
    }
    @NonNull
    @Override
    public itemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, final int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        final View view=inflater.inflate(R.layout.single_item,parent,false);

        return new itemViewHolder(view);

    }

    @Override
    public void onBindViewHolder(itemViewHolder holder, final int position) {

        String title =data[position];
        holder.txtView.setText(title);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class itemViewHolder extends RecyclerView.ViewHolder{
        TextView txtView;

      public itemViewHolder(View itemView) {

          super(itemView);
          txtView = itemView.findViewById(R.id.tvTitle);

      }
          }
}

    //ArrayList<innerListProvider> arrayList;
   // private Context context;

  //  public SingleItemAdapter(Context context, ArrayList<innerListProvider> itemsList) {

      //  this.arrayList = itemsList;
       // this.context = context;


    //}



