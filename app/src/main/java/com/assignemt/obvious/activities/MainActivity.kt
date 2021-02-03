package com.assignemt.obvious.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.assignemt.obvious.R
import com.assignemt.obvious.adapter.GridDataAdapter
import com.assignemt.obvious.model.Data
import com.assignemt.obvious.utils.ViewModelFactory
import com.assignemt.obvious.viewmodels.DataViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: DataViewModel
    private lateinit var data: List<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProviders.of(this, ViewModelFactory(this))
            .get(DataViewModel::class.java)

        rv_img_list.layoutManager = GridLayoutManager(this,3)

        data = viewModel.getData("data.json")

        rv_img_list.adapter = GridDataAdapter(data,this)

    }
}