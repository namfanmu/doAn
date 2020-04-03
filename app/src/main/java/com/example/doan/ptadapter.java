package com.example.doan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ptadapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<phuongTien> phuongTienList;

    public ptadapter(Context context, int layout, List<phuongTien> phuongTienList) {
        this.context = context;
        this.layout = layout;
        this.phuongTienList = phuongTienList;
    }

    @Override
    public int getCount() {
        return phuongTienList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }


    @Override
    public long getItemId(int position) {
        return 0;
    }
    private class ViewHolder{
        TextView txtUser, txtPass, txtPassconfirm, txtLicense;
        ImageView imgEdit;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null){
            holder=new ViewHolder();
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView=inflater.inflate(layout,null);
            holder.txtUser=(TextView)convertView.findViewById(R.id.txtUser);
            holder.txtPass=(TextView) convertView.findViewById(R.id.txtPass);
            holder.txtPassconfirm=(TextView)convertView.findViewById(R.id.txtPassconfirm);
            holder.txtLicense=(TextView)convertView.findViewById(R.id.txtLicense);
            holder.imgEdit=(ImageView)convertView.findViewById(R.id.imgEdit);
            convertView.setTag(holder);

        }else{
            holder=(ViewHolder) convertView.getTag();
        }
        phuongTien phuongtien=phuongTienList.get(position);
        holder.txtUser.setText(phuongtien.getUsername());
        holder.txtPass.setText(phuongtien.getPassword());
        holder.txtPassconfirm.setText(phuongtien.getPassword_confirm());
        holder.txtLicense.setText(phuongtien.getLicensePlate());
        return convertView;
    }
}
