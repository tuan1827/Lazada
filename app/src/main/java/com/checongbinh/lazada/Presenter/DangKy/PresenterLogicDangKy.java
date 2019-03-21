package com.checongbinh.lazada.Presenter.DangKy;

import com.checongbinh.lazada.Model.DangNhap_DangKy.ModelDangKy;
import com.checongbinh.lazada.Model.ObjectClass.NhanVien;
import com.checongbinh.lazada.View.DangNhap_DangKy.ViewDangKy;

/**
 * Created by Lenovo S410p on 7/8/2016.
 */
public class PresenterLogicDangKy implements IPresenterDangKy {
    ViewDangKy viewDangKy;
    ModelDangKy modelDangKy;

    public PresenterLogicDangKy(ViewDangKy viewDangKy){
        this.viewDangKy = viewDangKy;
        modelDangKy = new ModelDangKy();
    }

    @Override
    public void ThucHienDangKy(NhanVien nhanvien) {
        boolean kiemtra = modelDangKy.DangKyThanhVien(nhanvien);
        if(kiemtra){
            viewDangKy.DangKyThangCong();
        }else{
            viewDangKy.DangKyThatBai();
        }
    }
}
