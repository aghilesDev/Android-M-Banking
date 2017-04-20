package com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.Models.AgenceResumeView;
import com.example.cnep.cnepe_banking.Models.Compte;
import com.example.cnep.cnepe_banking.Models.CompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.Accueil;
import com.example.cnep.cnepe_banking.PresentationLayer.View.ListCompteView;
import com.example.cnep.cnepe_banking.PresentationLayer.View.ListMouvementView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-03-31.
 */

public class CompteAdapter extends RecyclerView.Adapter<CompteAdapter.MyViewHolder>  {


    private ArrayList<CompteView> list;
    private Context context;
    public CompteAdapter(Context context,ArrayList<CompteView> comptes)
    {
        super();
        this.context=context;
        this.list=comptes;
    }


    public void setList(ArrayList<CompteView> list) {
        this.list = list;
    }

    @Override
    public CompteAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view=inflater.inflate(R.layout.compte_cellule,parent,false);

        return new CompteAdapter.MyViewHolder(view,context);

    }

    @Override
    public void onBindViewHolder(CompteAdapter.MyViewHolder holder, int position) {
        CompteView compte=list.get(position);
        holder.display(compte);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }






    public class MyViewHolder extends RecyclerView.ViewHolder {


        private TextView compteId;
        private TextView rib;
        private TextView type;
        private TextView solde;

        private CompteView currentCompte;
        private Context context;
        public MyViewHolder(final View itemView, final Context context) {
            super(itemView);
            this.compteId=(TextView)itemView.findViewById(R.id.compteId);
            this.rib=(TextView)itemView.findViewById(R.id.rib);
            this.type=(TextView)itemView.findViewById(R.id.Type);
            this.solde=(TextView)itemView.findViewById(R.id.solde);
            this.context=context;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it=new Intent(context, ListMouvementView.class);

                   /* it.putExtra("compteId",currentCompte.getCompteId());*/

                    context.startActivity(it);
                }
            });
        }

        public void display(CompteView Compte) {
            currentCompte=Compte;
            this.compteId.setText(currentCompte.getCompteId());
            this.rib.setText(currentCompte.getRib());
            this.type.setText(currentCompte.getType());
           this.solde.setText(currentCompte.getSolde()+"");
        }
    }
}
