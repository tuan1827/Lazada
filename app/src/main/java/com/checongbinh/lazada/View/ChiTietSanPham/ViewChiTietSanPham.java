package com.checongbinh.lazada.View.ChiTietSanPham;

import com.checongbinh.lazada.Model.ObjectClass.DanhGia;
import com.checongbinh.lazada.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by Lenovo S410p on 8/10/2016.
 */
public interface ViewChiTietSanPham {
    void HienChiTietSanPham(SanPham sanPham);
    void HienSliderSanPham(String[] linkhinhsanpham);
    void HienThiDanhGia(List<DanhGia> danhGiaList);
    void ThemGioHangThanhCong();
    void ThemGiohangThatBai();
}
