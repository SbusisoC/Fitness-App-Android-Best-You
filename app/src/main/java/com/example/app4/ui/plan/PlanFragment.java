package com.example.app4.ui.plan;


import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app4.databinding.FragmentPlanBinding;
import com.example.app4.ui.progress.Recent;

public class PlanFragment extends Fragment {

    private FragmentPlanBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        PlanViewModel dashboardViewModel =
                new ViewModelProvider(this).get(PlanViewModel.class);

        binding = FragmentPlanBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView mondayText = binding.textView;
        TextView tuesdayText = binding.textView2;
        TextView wednesdayText = binding.textView3;
        TextView thursdayText = binding.textView4;
        TextView fridayText = binding.textView5;
        TextView saturdayText = binding.textView6;
        TextView sundayText = binding.textView7;

        mondayText.setTextColor(Color.BLACK);
        tuesdayText.setTextColor(Color.BLACK);
        wednesdayText.setTextColor(Color.BLACK);
        thursdayText.setTextColor(Color.BLACK);
        fridayText.setTextColor(Color.BLACK);
        saturdayText.setTextColor(Color.BLACK);
        sundayText.setTextColor(Color.BLACK);

        ImageView mondayImage = binding.tabMonday;
        ImageView tuesdayImage = binding.tabTuesday;
        ImageView wednesdayImage = binding.tabWednesday;
        ImageView thursdayImage = binding.tabThursday;
        ImageView fridayImage = binding.tabFriday;
        ImageView saturdayImage = binding.tabSaturday;
        ImageView sundayImage = binding.tabSunday;

        final TextView textView = binding.textPlan;
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        mondayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Monday.class));
            }
        });

        tuesdayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Tuesday.class));
            }
        });

        wednesdayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Wednesday.class));
            }
        });

        thursdayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Thursday.class));
            }
        });

        fridayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Friday.class));
            }
        });

        saturdayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Saturday.class));
            }
        });

        sundayImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Sunday.class));
            }
        });

        return root;

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}