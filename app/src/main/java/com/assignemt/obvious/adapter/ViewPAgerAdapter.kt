package com.assignemt.obvious.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import androidx.viewpager.widget.ViewPager
import com.assignemt.obvious.R
import com.assignemt.obvious.model.Data
import com.squareup.picasso.Picasso


class ViewPAgerAdapter(val context: Context, data:List<Data>) :PagerAdapter() {

    private var inflater: LayoutInflater
    private val data: List<Data>

    init {
        inflater = LayoutInflater.from(context)
        this.data = data
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun getCount(): Int {
       return data.size
    }
    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val hdImg: ImageView
        val title: TextView
        val desc: TextView

        inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val viewLayout: View = inflater.inflate(R.layout.detailed_layout,container,false)

        hdImg = viewLayout.findViewById<View>(R.id.hd_img) as ImageView
        title = viewLayout.findViewById<View>(R.id.tv_title) as TextView
        desc = viewLayout.findViewById<View>(R.id.desc) as TextView
        Picasso.get().load(data[position].getUrl()).into(hdImg)
        title.text = data[position].getTitle()
        desc.text = data[position].getExplanation()

        (container as ViewPager).addView(viewLayout)

        return viewLayout
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        (container as ViewPager).removeView(`object` as ConstraintLayout)
    }

}