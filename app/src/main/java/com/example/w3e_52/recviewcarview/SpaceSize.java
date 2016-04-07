package com.example.w3e_52.recviewcarview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by w3e-52 on 3/16/16.
 */
public class SpaceSize extends RecyclerView.ItemDecoration {
private final int mSpace;

public SpaceSize(int space) {
        this.mSpace = space;
        }

@Override
public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.left = mSpace;
        outRect.right = mSpace;
        outRect.bottom = mSpace;

        // Add top margin only for the first item to avoid double space between items
//        if (parent.getChildAdapterPosition(view) == 0)
//        outRect.top = mSpace;
        }
        }