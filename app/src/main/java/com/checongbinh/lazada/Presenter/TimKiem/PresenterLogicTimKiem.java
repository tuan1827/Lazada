package com.checongbinh.lazada.Presenter.TimKiem;

import com.checongbinh.lazada.Model.ObjectClass.SanPham;
import com.checongbinh.lazada.Model.TimKiem.ModelTimKiem;
import com.checongbinh.lazada.View.TimKiem.ViewTimKiem;

import java.util.List;

/**
 * Created by Lenovo S410p on 9/27/2016.
 */

public class PresenterLogicTimKiem implements IPresenterTimKiem {

    ViewTimKiem viewTimKiem;
    ModelTimKiem modelTimKiem;

    public PresenterLogicTimKiem(ViewTimKiem viewTimKiem){
        this.viewTimKiem = viewTimKiem;
        modelTimKiem = new ModelTimKiem();
    }

    @Override
    public void TimKiemSanPhamTheoTenSP(String tensp, int limit) {
        List<SanPham> sanPhamList = modelTimKiem.TimKiemSanPhamTheoTen(tensp,"DANHSACHSANPHAM","TimKiemSanPhamTheoTenSP",limit);

        if(sanPhamList.size() > 0){
            viewTimKiem.TimKiemThanhCong(sanPhamList);

        }else{
            viewTimKiem.TimKiemThatBai();
        }
    }
}
