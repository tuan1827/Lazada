package com.checongbinh.lazada.Model.ObjectClass;

import java.util.List;

/**
 * Created by Lenovo S410p on 6/25/2016.
 */
public class LoaiSanPham {
    public int getMALOAISP() {
        return MALOAISP;
    }

    public void setMALOAISP(int MALOAISP) {
        this.MALOAISP = MALOAISP;
    }

    public int getMALOAICHA() {
        return MALOAICHA;
    }

    public void setMALOAICHA(int MALOAICHA) {
        this.MALOAICHA = MALOAICHA;
    }

    public String getTENLOAISP() {
        return TENLOAISP;
    }

    public void setTENLOAISP(String TENLOAISP) {
        this.TENLOAISP = TENLOAISP;
    }

    public List<LoaiSanPham> getListCon() {
        return listCon;
    }

    public void setListCon(List<LoaiSanPham> listCon) {
        this.listCon = listCon;
    }

    int MALOAISP,MALOAICHA;
    String TENLOAISP;
    List<LoaiSanPham> listCon;

}
