package com.rijalw.bellarus.adapter;

/*
    Nama       : Rijal Wrisaba
    NIM        : 10116367
    Kelas      : AKB - 08
    Pengerjaan : 1 Agustus


 */

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.rijalw.bellarus.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    //Arrays
    public int[] slide_image = {
            R.drawable.pikachu,
            R.drawable.squirtle,
            R.drawable.charmander

    };

    public String[] slide_headings = {
            "SELAMAT DATANG",
            "EKSPLORASI SEPUASMU",
            "SELAMAT MENCOBA"
    };

    public String[] slide_desc = {
            "Ayo Bersenang - senanglah dengan Aplikasi Saya Yang Sangat Menarik Untuk Diliat Ini",
            "Cobalah Sepuasmu dengan Menggunakan Berbagai Macam Fitur yang Telah Disediakan ",
            "Jadi, tunggu apa lagi? Ayo Coba!!!"

    };

    @Override
    public int getCount() {
        return slide_headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.view_item_slide,container,false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_img);
        TextView slideHeader = (TextView) view.findViewById(R.id.slide_header);
        TextView slideDesc = (TextView) view.findViewById(R.id.slide_ket);

        slideImageView.setImageResource(slide_image[position]);
        slideHeader.setText(slide_headings[position]);
        slideDesc.setText(slide_desc[position]);

        container.addView(view);

        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((RelativeLayout) object);
    }
}
