package com.example.w3e_52.recviewcarview;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by w3e-52 on 3/16/16.
 */
public class StaggeredAdapter  extends RecyclerView.Adapter<StaggeredAdapter.StaggeredView> {

    private Context context;

    int[] imgList = {R.drawable.search, R.drawable.skull, R.drawable.dead, R.drawable.galaxy, R.drawable.skull_bw, R.drawable.iphone, R.drawable.jack, R.drawable.index,  R.drawable.twitter};

    String[] nameList = {"Search Icon", "Skull Icon","Dead","Galaxy","Skull head","Iphone","Jack","Skull","Twitter"};

    public StaggeredAdapter(Context context) {
        this.context = context;
    }

    @Override
    public StaggeredView onCreateViewHolder(ViewGroup parent, int viewType) {
        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.grid_item, parent, false);
        StaggeredView staggeredView = new StaggeredView(layoutView);
        return staggeredView;
    }

    @Override
    public void onBindViewHolder(StaggeredView holder, int position) {
        holder.imageView.setImageResource(imgList[position]);
        holder.textView.setText(nameList[position]);
    }

    @Override
    public int getItemCount() {
        return nameList.length;
    }

    class StaggeredView extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public StaggeredView(View itemView) {
            super(itemView);

            imageView = (ImageView) itemView.findViewById(R.id.img);
            textView = (TextView) itemView.findViewById(R.id.img_name);

        }
    }
}
