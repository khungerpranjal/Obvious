package com.assignemt.obvious.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.assignemt.obvious.R
import com.assignemt.obvious.adapter.ViewPAgerAdapter
import com.assignemt.obvious.model.Data
import com.assignemt.obvious.utils.ViewModelFactory
import com.assignemt.obvious.viewmodels.DataViewModel
import kotlinx.android.synthetic.main.viewpager_laout.*
import androidx.lifecycle.ViewModelProviders

class DetailedActivity : AppCompatActivity() {

    var position:Int=0
    private lateinit var viewModel: DataViewModel
    private lateinit var data: List<Data>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.viewpager_laout)

        viewModel = ViewModelProviders.of(this, ViewModelFactory(this))
                .get(DataViewModel::class.java)

        if (intent.extras != null) {
            if (intent.extras!!.get("position") != null) {
                position= intent.extras!!.get("position") as Int
            }
            }
            data = viewModel.getData("data.json")

            pager.adapter = ViewPAgerAdapter(this, data)
            pager.setCurrentItem(position)
        }

    }
