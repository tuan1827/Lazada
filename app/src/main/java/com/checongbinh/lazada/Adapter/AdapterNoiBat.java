package com.checongbinh.lazada.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.checongbinh.lazada.R;

import java.util.List;

/**
 * Created by Lenovo S410p on 7/13/2016.
 */
public class AdapterNoiBat extends RecyclerView.Adapter<AdapterNoiBat.ViewHolder> {
    Context context;
    List<String> stringList;

    public AdapterNoiBat(Context context,List<String> stringList){
        this.context = context;
        this.stringList = stringList;
    }

    //Chạy thứ 2
    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textView;

        public ViewHolder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.txtTieuDeNoiBat);
        }
    }

    //Chạy đầu tiê
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.custom_recyclerview_noibat,parent,false);

        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    //Chay thứ 3
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.textView.setText(stringList.get(position));
    }

    @Override
    public int getItemCount() {
        return stringList.size();
    }


}
