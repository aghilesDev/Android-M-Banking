package com.example.cnep.cnepe_banking.PresentationLayer.View.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.cnep.cnepe_banking.Models.MouvementView;
import com.example.cnep.cnepe_banking.R;

import java.util.ArrayList;

/**
 * Created by Aghiles on 2017-04-19.
 */

public class MouvementAdapter extends RecyclerView.Adapter<MouvementAdapter.MyViewHolder> {


    ArrayList<MouvementView> list;
    private Context context;
    public MouvementAdapter(Context context,ArrayList<MouvementView> agences)
    {
        super();
        this.context=context;
        this.list=agences;
    }


    public void setList(ArrayList<MouvementView> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public MouvementAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());

        View view=inflater.inflate(R.layout.mouvement_cellule,parent,false);

        return new MouvementAdapter.MyViewHolder(view,context);

    }

    @Override
    public void onBindViewHolder(MouvementAdapter.MyViewHolder holder, int position) {
        MouvementView mouvement=list.get(position);
        holder.display(mouvement);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        //declaration de champ
        private TextView dateCredit;
        private TextView intituleCredit;
        private TextView montantCredit;
        private MouvementView currentMouvement;
        private Context context;
        public MyViewHolder(final View itemView, final Context context) {
            super(itemView);
            /*affectation des champ*/
            this.dateCredit=(TextView)itemView.findViewById(R.id.TDateMouvement);
            this.intituleCredit=(TextView)itemView.findViewById(R.id.TIntituleMouvement);
            this.montantCredit=(TextView)itemView.findViewById(R.id.TMontantMouvement);

            this.context=context;
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                   /* Intent it=new Intent(context, ListCompteView.class);

                    it.putExtra("codeAgence",currentAgence.getId());

                    context.startActivity(it);*/
                }
            });
        }

        public void display(MouvementView mouvement) {
            currentMouvement=mouvement;
            /* affectation contenu*/
            this.dateCredit.setText(this.currentMouvement.getDate());
            this.intituleCredit.setText(this.currentMouvement.getIntitule());
            this.montantCredit.setText(this.currentMouvement.getMontant()+"");
              }
    }
}
