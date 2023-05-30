package com.example.uts_akb_10120081_if2.view.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.uts_akb_10120081_if2.R;
import com.example.uts_akb_10120081_if2.view.activity.MainActivity;

/**
 * NAMA    : Naufal Mahdy
 * NIM     : 10120081
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 */
public class ProfileFragment extends Fragment {

    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();
        mainActivity.getSupportActionBar().hide();
    }
}

/**
 * NAMA    : Naufal Mahdy
 * NIM     : 10120081
 * Kelas   : IF-2
 * MatKul  : Aplikasi Komputasi Bergerak
 */