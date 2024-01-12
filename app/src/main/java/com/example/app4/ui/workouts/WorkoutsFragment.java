package com.example.app4.ui.workouts;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.app4.databinding.FragmentWorkoutsBinding;

public class WorkoutsFragment extends Fragment {

    private FragmentWorkoutsBinding binding;

    @SuppressLint("ClickableViewAccessibility")
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        WorkoutsViewModel notificationsViewModel =
                new ViewModelProvider(this).get(WorkoutsViewModel.class);

        binding = FragmentWorkoutsBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ImageView shoulderImage = binding.shoulderworks;
        ImageView chestImage = binding.chestworkouts;
        ImageView armsImage = binding.armworkouts;
        ImageView backImage = binding.backworkouts;
        ImageView legsImage = binding.legworkouts;
        ImageView cardioImage = binding.cardioworkouts;

        final TextView textView = binding.textWorkouts;
        notificationsViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        shoulderImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), shoulderWorkouts.class));
            }
        });

        chestImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), chestWorkouts.class));
            }
        });

        armsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), armsWorkouts.class));
            }
        });

        backImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), backWorkouts.class));
            }
        });

        legsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), legWorkouts.class));
            }
        });

        cardioImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), cardioWorkouts.class));
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