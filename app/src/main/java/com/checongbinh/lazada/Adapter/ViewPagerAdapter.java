package com.checongbinh.lazada.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentChuongTrinhKhuyenMai;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentDienTu;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentLamDep;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentMeVaBe;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentNhaCuaVaDoiSong;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentNoiBat;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentTheThaoVaDuLich;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentThoiTrang;
import com.checongbinh.lazada.View.TrangChu.Fragment.FragmentThuongHieu;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lenovo S410p on 6/23/2016.
 */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> listFragment = new ArrayList<Fragment>();
    List<String> titleFragment = new ArrayList<String>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
        listFragment.add(new FragmentNoiBat());
        listFragment.add(new FragmentChuongTrinhKhuyenMai());
        listFragment.add(new FragmentDienTu());
        listFragment.add(new FragmentNhaCuaVaDoiSong());
        listFragment.add(new FragmentMeVaBe());
        listFragment.add(new FragmentLamDep());
        listFragment.add(new FragmentThoiTrang());
        listFragment.add(new FragmentTheThaoVaDuLich());
        listFragment.add(new FragmentThuongHieu());

        titleFragment.add("Nổi bật");
        titleFragment.add("Chương trình khuyến mãi");
        titleFragment.add("Điện tử");
        titleFragment.add("Nhà cửa & đời sống");
        titleFragment.add("Mẹ và bé");
        titleFragment.add("Làm đẹp");
        titleFragment.add("Thời trang");
        titleFragment.add("Thể thao & du lịch");
        titleFragment.add("Thương hiệu");
    }

    @Override
    public Fragment getItem(int position) {
        return listFragment.get(position);
    }

    @Override
    public int getCount() {
        return listFragment.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titleFragment.get(position);
    }
}
