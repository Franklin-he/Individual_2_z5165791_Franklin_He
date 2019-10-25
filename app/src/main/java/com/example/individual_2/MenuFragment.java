package com.example.individual_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MenuFragment extends Fragment {
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View aView = inflater.inflate(R.layout.fragment_menu, container, false);

        RecyclerView recyclerView = aView.findViewById(R.id.rv_menu);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        MenuAdapter menuAdapter = new MenuAdapter();

        menuAdapter.setData(FakeDatabase.getAllItems());
        recyclerView.setAdapter(menuAdapter);
        return aView;
    }
}
