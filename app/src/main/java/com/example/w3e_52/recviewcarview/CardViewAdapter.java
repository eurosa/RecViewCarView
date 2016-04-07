package com.example.w3e_52.recviewcarview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by w3e-52 on 3/15/16.
 */
public class CardViewAdapter extends RecyclerView.Adapter<ViewHolder> {

    private static ArrayList<Persons> dataSet;

    public CardViewAdapter(ArrayList<Persons> image) {

        dataSet = image;
    }

    CheckBox chkSelected;
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
// create a new view
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                R.layout.card_view, null);

        // create ViewHolder

        ViewHolder viewHolder = new ViewHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        final int pos = i;
        Persons fp = dataSet.get(i);

        viewHolder.tvVersionName.setText(fp.getId());
        viewHolder.iconView.setImageResource(Integer.parseInt(fp.getName()));
        viewHolder.feed = fp;
//       chkSelected = (CheckBox) chkSelected.findViewById(R.id.chkSelected);
//        viewHolder.chkSelected.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                CheckBox cb = (CheckBox) v;
//                Persons contact = (Persons) cb.getTag();
//
//                contact.setSelected(cb.isChecked());
//                dataSet.get(pos).setSelected(cb.isChecked());
//
//                Toast.makeText(
//                        v.getContext(),
//                        "Clicked on Checkbox: " + cb.getText() + " is "
//                                + cb.isChecked(), Toast.LENGTH_LONG).show();
//            }
//        });

    }


    @Override
    public int getItemCount() {
        return dataSet.size();
    }
}
    // inner class to hold a reference to each item of RecyclerView
    class ViewHolder extends RecyclerView.ViewHolder {

        public TextView tvVersionName;
        public ImageView iconView;

        public Persons feed;
        CheckBox chkSelected;
        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);

            tvVersionName = (TextView) itemLayoutView
                    .findViewById(R.id.tvVersionName);
            iconView = (ImageView) itemLayoutView
                    .findViewById(R.id.iconId);

             chkSelected = (CheckBox) itemLayoutView
                    .findViewById(R.id.chkSelected);


            chkSelected.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    System.out.println("Sabuj");
//if (feed.isSelected()==true) {


//                    Intent intent = new Intent(v.getContext(), SecondPage.class);
//                    v.getContext().startActivity(intent);
    Toast.makeText(v.getContext(), "Image is: " + feed.getId(), Toast.LENGTH_SHORT).show();
//}
                }
            });


        }

    }


