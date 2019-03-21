package com.checongbinh.lazada.View.TimKiem;

import com.checongbinh.lazada.Model.ObjectClass.SanPham;

import java.util.List;

/**
 * Created by Lenovo S410p on 9/27/2016.
 */

public interface ViewTimKiem {
    void TimKiemThanhCong(List<SanPham> sanPhamList);
    void TimKiemThatBai();
}
