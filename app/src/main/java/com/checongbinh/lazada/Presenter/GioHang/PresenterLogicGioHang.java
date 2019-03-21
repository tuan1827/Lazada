package com.checongbinh.lazada.Presenter.GioHang;

import android.content.Context;

import com.checongbinh.lazada.Model.GioHang.ModelGioHang;
import com.checongbinh.lazada.Model.ObjectClass.SanPham;
import com.checongbinh.lazada.View.GioHang.ViewGioHang;

import java.util.List;

/**
 * Created by Lenovo S410p on 8/28/2016.
 */
public class PresenterLogicGioHang implements IPresenterGioHang {

    ModelGioHang modelGioHang;
    ViewGioHang viewGioHang;

    public PresenterLogicGioHang(ViewGioHang viewGioHang){
        modelGioHang = new ModelGioHang();
        this.viewGioHang = viewGioHang;
    }

    @Override
    public void LayDanhSachSanPhamTrongGioHang(Context context) {
        modelGioHang.MoKetNoiSQL(context);
        List<SanPham> sanPhamList = modelGioHang.LayDanhSachSanPhamTrongGioHang();
        if(sanPhamList.size() > 0){
            viewGioHang.HienThiDanhSachSanPhamTrongGioHang(sanPhamList);
        }
    }
}
