package com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.ListCompteView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by Aghiles on 2017-03-30.
 */

public class AgenceAdapter extends RecyclerView.Adapter<AgenceAdapter.MyViewHolder> {

    ArrayList<AgenceResumeView> list;
    private Context context;
    public AgenceAdapter(Context context,ArrayList<AgenceResumeView> agences)
    {
        super();
        this.context=context;
        this.list=agences;
    }


    public void setList(ArrayList<AgenceResumeView> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view=inflater.inflate(R.layout.agence_cellule,parent,false);

        return new MyViewHolder(view,context);

    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        AgenceResumeView agence=list.get(position);
        holder.display(agence);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private final TextView codeAgence;
        private final TextView libelléAgence;
        private AgenceResumeView currentAgence;
        private Context context;
        public MyViewHolder(final View itemView, final Context context) {
            super(itemView);
            codeAgence=(TextView)itemView.findViewById(R.id.codeAgence);
            libelléAgence=(TextView)itemView.findViewById(R.id.libelléAgence);

            this.context=context;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it=new Intent(context, ListCompteView.class);

                    it.putExtra("codeAgence",currentAgence.getId());

                    context.startActivity(it);
                }
            });
        }

        public void display(AgenceResumeView agence) {
            currentAgence=agence;
            codeAgence.setText(agence.getId()+"");
            libelléAgence.setText(agence.getLibelle());
        }
    }
}