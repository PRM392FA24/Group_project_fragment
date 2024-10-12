package com.example.lab_12_fragment.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<Integer> sharedData = new MutableLiveData<>(0);

    public MutableLiveData<Integer> getSharedData(){
        return sharedData;
    }

    public void incrementData(){
        if(sharedData.getValue() != null){
            sharedData.setValue(sharedData.getValue() + 1);
        }
        else {
            sharedData.setValue(1);
        }
    }

    public void decreaseData(){
        if(sharedData.getValue() != null){
            sharedData.setValue(sharedData.getValue() - 1);
        }
        else {
            sharedData.setValue(1);
        }
    }
}
