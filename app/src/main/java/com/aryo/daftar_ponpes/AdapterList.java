package com.aryo.daftar_ponpes;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class AdapterList extends ArrayAdapter<Adapter_Array> {

    Context context;
    int LayputGambar;
    List<Adapter_Array> Data;

    public AdapterList(@NonNull Context context, int resource, @NonNull List<Adapter_Array> objects) {
        super(context, resource, objects);
        this.context = context;
        this.LayputGambar = resource;
        this.Data = objects;
    }

    static class DataHolder{
        TextView TV_Header;
        TextView TV_Nama1;
        TextView TV_Nama2;
        TextView TV_Nama3;
        TextView TV_Nama4;
        ImageView IV_Gambar;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        DataHolder Holder;
        if (convertView == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            convertView = inflater.inflate(LayputGambar,parent,false);
            Holder = new DataHolder();
            Holder.TV_Header = convertView.findViewById(R.id.textView_Main_Header);
            Holder.TV_Nama1 = convertView.findViewById(R.id.textView_Main_temp_Nama1);
            Holder.TV_Nama2 = convertView.findViewById(R.id.textView_Main_temp_Nama2);
            Holder.TV_Nama3 = convertView.findViewById(R.id.textView_Main_temp_Nama3);
            Holder.TV_Nama4 = convertView.findViewById(R.id.textView_Main_temp_Nama4);
            Holder.IV_Gambar = convertView.findViewById(R.id.circleImageView_Main_temp_Logo);
            convertView.setTag(Holder);
        }else {
            Holder = (DataHolder)convertView.getTag();
        }
        Adapter_Array dataitem = Data.get(position);
        Holder.TV_Header.setText(dataitem.getHeader());
        Holder.TV_Nama1.setText(dataitem.getNamaSatu());
        Holder.TV_Nama2.setText(dataitem.getNamaDua());
        Holder.TV_Nama3.setText(dataitem.getNamaTiga());
        Holder.TV_Nama4.setText(dataitem.getNamaEmpat());
        Holder.IV_Gambar.setImageResource(dataitem.getGambar());
        return convertView;
    }

}
