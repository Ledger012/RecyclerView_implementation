package com.aurosaswatraj.recyclerview

import android.R
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    //vars
    private val mNames: ArrayList<String> = ArrayList()
    private val mImageUrls: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.)

    }

    private fun initImageBitmaps() {
        Log.d(TAG, "initImageBitmaps: preparing bitmaps.")
        mImageUrls.add("https://c1.staticflickr.com/5/4636/25316407448_de5fbf183d_o.jpg")
        mNames.add("Havasu Falls")
        mImageUrls.add("https://i.redd.it/tpsnoz5bzo501.jpg")
        mNames.add("Trondheim")
        mImageUrls.add("https://i.redd.it/qn7f9oqu7o501.jpg")
        mNames.add("Portugal")
        mImageUrls.add("https://i.redd.it/j6myfqglup501.jpg")
        mNames.add("Rocky Mountain National Park")
        mImageUrls.add("https://i.redd.it/0h2gm1ix6p501.jpg")
        mNames.add("Mahahual")
        mImageUrls.add("https://i.redd.it/k98uzl68eh501.jpg")
        mNames.add("Frozen Lake")
        mImageUrls.add("https://i.redd.it/glin0nwndo501.jpg")
        mNames.add("White Sands Desert")
        mImageUrls.add("https://i.redd.it/obx4zydshg601.jpg")
        mNames.add("Austrailia")
        mImageUrls.add("https://i.imgur.com/ZcLLrkY.jpg")
        mNames.add("Washington")
        initRecyclerView()
    }


    private fun initRecyclerView() {
        Log.d(TAG, "initRecyclerView: init recyclerview.")

        val adapter = RecyclerViewAdapter(this, mNames, mImageUrls)
        recyclerv_view.adapter = adapter
        recyclerv_view.layoutManager = LinearLayoutManager(this)
    }
}