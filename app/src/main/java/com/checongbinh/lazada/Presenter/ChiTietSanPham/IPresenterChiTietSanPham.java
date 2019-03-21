package com.checongbinh.lazada.Presenter.ChiTietSanPham;

import android.content.Context;

import com.checongbinh.lazada.Model.ObjectClass.SanPham;

/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public interface IPresenterChiTietSanPham {
    void LayChiTietSanPham(int masp);
    void LayDanhSachDanhGiaTheoCuaSanPham(int masp, int limit);
    void ThemGioHang(SanPham sanPham, Context context);
}
