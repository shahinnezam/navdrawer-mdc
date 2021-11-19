package com.zybooks.navdrawerfragments.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.zybooks.navdrawerfragments.R;
import com.zybooks.navdrawerfragments.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    Button button1;
    Button button2;
    Button button3;
    int int1;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        //TODO: Sets the onClickListener for each button to the galleryItemButtonClick method with appropriate arguments
        button1 = (Button) root.findViewById(R.id.button);
        button1.setOnClickListener(galleryItemButtonClick(root,int););
        button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(galleryItemButtonClick(root, ););
        button3 = (Button) root.findViewById(R.id.button3);

        return root;
    }

    public void galleryItemButtonClick(View view, int item){
        HomeFragmentDirections.ActionNavHomeToNavGallery action = HomeFragmentDirections.actionNavHomeToNavGallery();
        //TODO: assign the appropriate item number value to the Destination Argument and navigate to the gallery page

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}