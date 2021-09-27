package com.example.restaurant;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private MyListData[] listdata;

    // RecyclerView recyclerView;
    public MyListAdapter(MyListData[] listdata) {

        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        final MyListData myListData = listdata[position];
        holder.textView.setText(listdata[position].getDescription());
        holder.imageView.setImageResource(listdata[position].getImgId());
        holder.relativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(view.getContext(),"click on item: "+myListData.getDescription(),Toast.LENGTH_LONG).show();

                final Intent intent;
                if (myListData.getDescription() == "Ugali"){
                    intent =  new Intent(view.getContext(), Ugali.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Pilau"){
                    intent =  new Intent(view.getContext(), Pilau.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Beef"){
                    intent =  new Intent(view.getContext(), Beef.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "RoastBeef"){
                    intent =  new Intent(view.getContext(), RoastBeef.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Pork"){
                    intent =  new Intent(view.getContext(), Pork.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Chicken"){
                    intent =  new Intent(view.getContext(), Chicken.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Mukimo"){
                    intent =  new Intent(view.getContext(), Mukimo.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Githeri"){
                    intent =  new Intent(view.getContext(), Githeri.class);
                    view.getContext().startActivity(intent);
                }
                else if (myListData.getDescription() == "Fish"){
                    intent =  new Intent(view.getContext(), Fish.class);
                    view.getContext().startActivity(intent);
                }
                else {
                    intent =  new Intent(view.getContext(), Chips.class);
                    view.getContext().startActivity(intent);
                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView textView;
        public RelativeLayout relativeLayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.imageView = (ImageView) itemView.findViewById(R.id.imageView);
            this.textView = (TextView) itemView.findViewById(R.id.textView);
            relativeLayout = (RelativeLayout)itemView.findViewById(R.id.relativeLayout);
        }
    }
}
