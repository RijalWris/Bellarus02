package com.rijalw.bellarus;

/*
    Nama       : Rijal Wrisaba
    NIM        : 10116367
    Kelas      : AKB - 08
    Pengerjaan : 1 Agustus


 */

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.rijalw.bellarus.adapter.FriendAdapter;
import com.rijalw.bellarus.model.FriendModel;

import java.util.ArrayList;
import java.util.List;

public class FriendFragment extends Fragment {

    List<FriendModel> friend;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_friend, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        //Activity
        friend = new ArrayList<>();
        friend.add(new FriendModel("Rosyad Sulaiman","NIM : 10116349\nKelas : IF 8\nTelepon : +62821083232235\nEmail : rosyads@gmail.com\nInstagram : @rosyads",R.drawable.img_rosyad));
        friend.add(new FriendModel("Yudha Jeremy","NIM : 10116554\nKelas : IF 12\nTelepon : +6285320228870\nEmail : yudhje@gmail.com\nInstagram : @yudhajemmy",R.drawable.img_jemmy));


        RecyclerView rvFriend = (RecyclerView) getView().findViewById(R.id.rvFriend_id);
        final FriendAdapter friendAdapter = new FriendAdapter(getContext(), friend);
        rvFriend.setLayoutManager(new GridLayoutManager(getContext(),1));
        rvFriend.setAdapter(friendAdapter);

        final LinearLayout linearShow = (LinearLayout) getView().findViewById(R.id.button2);
        Button show = (Button) getView().findViewById(R.id.btn_editTeman);
        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                linearShow.setVisibility(View.VISIBLE);
                RecyclerView rvEdit = (RecyclerView) getView().findViewById(R.id.rvFriend_id);
                rvEdit.setLayoutManager(new GridLayoutManager(getContext(),1));
                rvEdit.setAdapter(friendAdapter);
            }
        });

        EditText nama = (EditText) getView().findViewById(R.id.edit_nama);
        EditText info = (EditText) getView().findViewById(R.id.edit_info);

        Button add = (Button) getView().findViewById(R.id.btn_add);
        Button edit = (Button) getView().findViewById(R.id.btn_edit);
        Button delete = (Button) getView().findViewById(R.id.btn_delete);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


}
