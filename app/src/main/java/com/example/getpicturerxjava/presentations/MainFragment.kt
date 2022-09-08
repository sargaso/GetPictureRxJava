package com.example.getpicturerxjava.presentations

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.example.getpicturerxjava.R
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Observable
import io.reactivex.rxjava3.schedulers.Schedulers
import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : Fragment(R.layout.fragment_main) {

    companion object{
        const val IMAGE_URL = "https://miro.medium.com/max/1000/1*Kr52kpans_yMI8_9x0GKJQ.png"
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        btnShowPicture.setOnClickListener {
            Observable.just(
                loadImageWithGlide(imageUrl = IMAGE_URL ,imageView = ivPicture))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({throw Exception("Exception")},{
                    it.localizedMessage?.let { it1 -> Log.e("Exception", it1) }
                })
        }
    }
    private fun loadImageWithGlide(imageUrl: String,imageView: ImageView){
        Glide.with(this)
            .load(imageUrl)
            .into(imageView)
    }

}