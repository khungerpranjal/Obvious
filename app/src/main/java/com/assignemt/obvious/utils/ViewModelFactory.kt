package com.assignemt.obvious.utils

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.assignemt.obvious.viewmodels.DataViewModel

class ViewModelFactory(val context: Context): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(DataViewModel::class.java)) {
            return DataViewModel(context) as T
        }
        throw  IllegalArgumentException("Unknown ViewModel class");
    }
}