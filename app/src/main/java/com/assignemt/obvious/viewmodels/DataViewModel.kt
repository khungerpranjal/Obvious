package com.assignemt.obvious.viewmodels

import android.content.Context
import androidx.lifecycle.ViewModel
import com.assignemt.obvious.model.Data
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.io.IOException

class DataViewModel(val context: Context) : ViewModel() {


   private fun getJsonDataFromAsset(filename: String): String? {

        val jsonString: String
        try {
            jsonString = context.assets.open(filename).bufferedReader().use { it.readText() }
        } catch (ioException: IOException) {
            ioException.printStackTrace()
            return null
        }
        return jsonString
    }

    fun getData(filename: String):  List<Data> {

        val jsonFileString = getJsonDataFromAsset(filename)

        val gson = Gson()
        val data = object : TypeToken<List<Data>>() {}.type

        var dataList: List<Data> = gson.fromJson(jsonFileString, data)

        return dataList

    }
}