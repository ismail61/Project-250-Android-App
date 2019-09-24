package com.example.quran;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {
    Context context;
    int[] jobor;

    private LayoutInflater inflater;//convert xml to java class

    CustomAdapter(Context context, int[] jobor) {
        this.context = context;
        this.jobor = jobor;
    }

    @Override
    public int getCount() {
        return jobor.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        if(view==null) {
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.gridview_for_jobor, viewGroup, false);
        }
        ImageView imageView = (ImageView)view.findViewById(R.id.imageview_gridViewId);
        imageView.setImageResource(jobor[position]);
        return view;
    }
}
