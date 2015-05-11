package com.example.thang.myapplication;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Thang on 5/10/2015.
 */
public class NavDrawerAdapter extends RecyclerView.Adapter<NavDrawerAdapter.ViewHolder> {
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;

    private String mNavTitles[];
    private int mIcons[];

    private String mName;
    private int mProfile;
    private String mEmail;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        int Holderid;
        TextView textView;
        ImageView imageView;
        ImageView profile;
        TextView name;
        TextView email;


        public ViewHolder(View itemView, int viewType) {
            super(itemView);
            if (viewType == TYPE_ITEM){
                textView = (TextView)itemView.findViewById(R.id.rowText);
                imageView = (ImageView)itemView.findViewById(R.id.rowIcon);
                Holderid = 1;
            }else{
                name = (TextView)itemView.findViewById(R.id.name);
                email = (TextView)itemView.findViewById(R.id.email);
                profile = (ImageView) itemView.findViewById(R.id.circleView);
                Holderid = 0;
            }
        }


    }

    NavDrawerAdapter(String titles[], int icons[], String name, String email, int profile){
        mNavTitles = titles;
        mIcons = icons;
        mName = name;
        mEmail = email;
        mProfile = profile;
    }

    @Override
    public NavDrawerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);
            ViewHolder vhItem = new ViewHolder(v,viewType);
            return vhItem;
        }else if(viewType == TYPE_HEADER){
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.header,parent,false);
            ViewHolder vhHeader = new ViewHolder(v,viewType);
            return  vhHeader;
        }
        return null;
    }

    @Override
    public void onBindViewHolder(NavDrawerAdapter.ViewHolder holder, int position) {
        if (holder.Holderid == 1){
            holder.textView.setText(mNavTitles[position-1]);
            holder.imageView.setImageResource(mIcons[position-1]);
        }
        else {
            holder.profile.setImageResource(mProfile);
            holder.name.setText(mName);
            holder.email.setText(mEmail);
        }

    }

    @Override
    public int getItemCount() {
        return mNavTitles.length + 1;
    }

    @Override
    public int getItemViewType(int position) {
        if (isPositionHeader(position)){
            return TYPE_HEADER;
        }
        return  TYPE_ITEM;
    }

    private boolean isPositionHeader(int position) {
        return position == 0;
    }
}
