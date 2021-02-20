package com.gauravdalvi.newsapp.ui.CNN;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is CNN fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}