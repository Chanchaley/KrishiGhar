package com.krishighar.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.krishighar.R;
import com.krishighar.adapter.MarkertValueAdapter;
import com.krishighar.constants.UrlConstants;
import com.krishighar.model.MarketValueModel;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class Weather extends Fragment {

    private RecyclerView recyclerView;
    private List<MarketValueModel> marketValueList;
    private MarkertValueAdapter markertValueAdapter;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_market_value, container, false);
        initializeViews(view);
        initialiseListeners();
        setUpRecyclerView();
        getMarketValue();
        return view;
    }

    private void getMarketValue() {

        StringRequest stringRequest = new StringRequest(Request.Method.GET, UrlConstants.GET_MARKET_VALUE, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {



            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getContext(), "No Internet Connection", Toast.LENGTH_SHORT).show();

            }
        });

        RequestQueue queue = Volley.newRequestQueue(getContext());
        queue.add(stringRequest);

    }


    private void initializeViews(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);

    }

    private void initialiseListeners() {

    }

    private void setUpRecyclerView() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(linearLayoutManager);
        marketValueList = new ArrayList<>();
        markertValueAdapter = new MarkertValueAdapter(getActivity(), marketValueList);
        recyclerView.setAdapter(markertValueAdapter);


    }


}
