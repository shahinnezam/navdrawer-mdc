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
import androidx.navigation.Navigation;

import com.zybooks.navdrawerfragments.R;
import com.zybooks.navdrawerfragments.databinding.FragmentHomeBinding;
import com.zybooks.navdrawerfragments.ui.gallery.GalleryFragmentArgs;

public class HomeFragment extends Fragment {
    Button button1;
    Button button2;
    Button button3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home,container,false);
        //TODO: Sets the onClickListener for each button to the galleryItemButtonClick method with appropriate arguments
        button1 = root.findViewById(R.id.button);
        button1.setOnClickListener((View v) -> galleryItemButtonClick(v, 1));
        button2 = root.findViewById(R.id.button2);
        button2.setOnClickListener((View v) -> galleryItemButtonClick(v, 2));
        button3 = root.findViewById(R.id.button3);
        button3.setOnClickListener((View v) -> galleryItemButtonClick(v, 3));

        return root;
    }

    public void galleryItemButtonClick(View view, int item){
        HomeFragmentDirections.ActionNavHomeToNavGallery action = HomeFragmentDirections.actionNavHomeToNavGallery();
        //TODO: assign the appropriate item number value to the Destination Argument and navigate to the gallery page
        action.setGalleryItemId(item);
        Navigation.findNavController(view).navigate(action);
    }
}