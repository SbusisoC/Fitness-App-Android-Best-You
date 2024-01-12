package com.example.app4.ui.progress;

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

import com.example.app4.databinding.FragmentProgressBinding;
import com.example.app4.ui.workouts.shoulderWorkouts;

public class ProgressFragment extends Fragment {

    private FragmentProgressBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        ProgressViewModel homeViewModel =
                new ViewModelProvider(this).get(ProgressViewModel.class);

        binding = FragmentProgressBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        TextView recentText = binding.textView1;
        TextView goalsText = binding.textView2;
        TextView statisticsText = binding.textView3;

        recentText.setTextColor(Color.BLACK);
        goalsText.setTextColor(Color.BLACK);
        statisticsText.setTextColor(Color.BLACK);

        ImageView recentButton = binding.imageView1;
        ImageView goalsButton = binding.imageView2;
        ImageView statisticsButton = binding.imageView3;


        final TextView textView = binding.textProgress;
        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        recentButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Recent.class));
            }
        });

        goalsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Goals.class));
            }
        });

        statisticsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Statistics.class));
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