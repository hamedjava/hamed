package com.example.myfirstshoppingapplication.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myfirstshoppingapplication.R;

import org.jetbrains.annotations.NotNull;

public class PaymentFragment extends Fragment {

    Context context;

    public PaymentFragment(Context context){
        this.context = context;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.payment_fragment,container,false);
        return view;
    }

}
