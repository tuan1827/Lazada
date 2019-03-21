package com.checongbinh.lazada.Presenter.ChiTietSanPham;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.checongbinh.lazada.R;
import com.squareup.picasso.Picasso;

/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public class FragmentSliderChiTietSanPham extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.layout_fragment_slider_chitietsanpham,container,false);
        Bundle bundle = getArguments();
        String linkhinh = bundle.getString("linkhinh");

        ImageView imageView = (ImageView) view.findViewById(R.id.imHinhSlider);

        Picasso.with(getContext()).load(linkhinh).into(imageView);

        return view;
    }
}
