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

public class CompteAdapter extends BaseAdapter<CompteView>  {


    private Context context;
    public CompteAdapter(Context context)
    {
        super();
        this.context=context;

    }

    public CompteAdapter(Context context,IArticleSender sender)
    {
        super(sender);
        this.context=context;
    }

    @Override
    public int getListItem() {
        return R.layout.compte_cellule;
    }

    @Override
    public ArticleViewHolder getNewArticleViewHolder(View view) {
        return new MyViewHolder(view,context);
    }


    public class MyViewHolder extends BaseAdapter.ArticleViewHolder<CompteView> {


        private TextView compteId;
        private TextView rib;
        private TextView type;
        private TextView solde;
        private TextView DateMaj;

        private CompteView currentCompte;
        private Context context;
        public MyViewHolder(final View itemView, final Context context) {
            super(itemView);
            this.compteId=(TextView)itemView.findViewById(R.id.compteId);
            this.rib=(TextView)itemView.findViewById(R.id.rib);
            this.type=(TextView)itemView.findViewById(R.id.Type);
            this.solde=(TextView)itemView.findViewById(R.id.solde);
            this.DateMaj=(TextView)itemView.findViewById(R.id.DateMajCompte);
            this.context=context;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent it=new Intent(context, ListMouvementView.class);

                   it.putExtra("compteId",currentCompte.getCompteId());

                    context.startActivity(it);
                }
            });
        }

        public void display(CompteView Compte) {
            currentCompte=Compte;
            this.compteId.setText(currentCompte.getCompteId());
            this.rib.setText(currentCompte.getRib());
            this.type.setText(currentCompte.getType());
            this.solde.setText(currentCompte.getSolde()+" DZD");
            this.DateMaj.setText(currentCompte.getDateMaj());
        }
    }
}
