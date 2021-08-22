package com.example.myfirstshoppingapplication.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.myfirstshoppingapplication.R;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

import ApiAdapters.HomeApi.Example;
import ApiAdapters.HomeApi.Slider;
import ApiAdapters.SliderAdapter;

public class HomeFragment extends Fragment {
    //hamed pouyanfar sasasas
    Context context;

    private static final String URL = "https://iymazon.com/api/android/get/main/test";
    private static final String TAG = "log";

    SliderAdapter slideradapter;
    List<Slider> sliders;
    RecyclerView recyclerView;

    public HomeFragment(Context context){
        this.context = context;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    @Override
    public View onCreateView(@NonNull @NotNull LayoutInflater inflater, @Nullable @org.jetbrains.annotations.Nullable ViewGroup container, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(this.context).inflate(R.layout.home_fragment,container,false);
        recyclerView = view.findViewById(R.id.recyclerView3);
        sliders = new ArrayList<>();
        getDataFromIYMazon();
        return view;
    }

    public void getDataFromIYMazon(){
        RequestQueue queue = Volley.newRequestQueue(context);
        StringRequest request = new StringRequest(Request.Method.GET, URL, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                try {
                    GsonBuilder builder = new GsonBuilder();
                    Gson gson = builder.create();
                    Example example = new Example();
                    example = gson.fromJson(response, Example.class);
                    sliders = example.getData().getSlider();
                    LinearLayoutManager layoutManager = new LinearLayoutManager(context, RecyclerView.HORIZONTAL, false);
                    slideradapter = new SliderAdapter(context, sliders);
                    recyclerView.setAdapter(slideradapter);
                    recyclerView.setLayoutManager(layoutManager);

                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.i(TAG, "------------------------------------------"+error.toString());
            }
        });
        request.setRetryPolicy(new DefaultRetryPolicy(DefaultRetryPolicy.DEFAULT_TIMEOUT_MS,DefaultRetryPolicy.DEFAULT_MAX_RETRIES,DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(request);
    }
}
