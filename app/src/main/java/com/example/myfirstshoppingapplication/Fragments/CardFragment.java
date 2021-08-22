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

public class CardFragment extends Fragment {
    Context context;
    public CardFragment(Context context){
        this.context = context;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.card_fragment,container,false);

/*        Uri data = getIntent().getData();
        ZarinPal.getPurchase(context.getApplicationContext()).verificationPayment(data, new OnCallbackVerificationPaymentListener() {
            @Override
            public void onCallbackResultVerificationPayment(boolean isPaymentSuccess, String refID, PaymentRequest paymentRequest) {
                if(isPaymentSuccess){
                    Toast.makeText(MainActivity.this, "پرداخت انجام شد{{", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "پرداخت انجام نشد{{", Toast.LENGTH_SHORT).show();
                }
            }
        });*/
        return view;
    }

/*    public void myPayment(long amount){
        ZarinPal purchase = ZarinPal.getPurchase(context.getApplicationContext());
        PaymentRequest payment = ZarinPal.getPaymentRequest();

        payment.setMerchantID("71c705f8-bd37-11e6-aa0c-000c295eb8fc");
        payment.setAmount(amount);
        payment.setDescription("پرداخت جهت محصول شماره یک");
        payment.setCallbackURL("return://zarinpalpayment");

        purchase.startPayment(payment, new OnCallbackRequestPaymentListener() {
            @Override
            public void onCallbackResultPaymentRequest(int status, String authority, Uri paymentGatewayUri, Intent intent) {
                if(status==100){
                    startActivity(intent);
                    Toast.makeText(context.getApplicationContext(), "پرداخت انجام شد...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(context.getApplicationContext(), "پرداخت انجام نشد...", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }*/

}
