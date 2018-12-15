package com.zein.zeinyt11;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.drawable.GlideDrawable;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;
import com.ebr163.bifacialview.view.BifacialView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final BifacialView view = (BifacialView)findViewById(R.id.bifacialView);
        Glide.with(this)
                .load("http://d-pic-image.yesky.com/480x-/uploadImages/2018/027/12/5PG71QFNYN72.jpg")
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        view.setDrawableLeft(resource);
                        return true;
                    }
                }).preload();
        Glide.with(this)
                .load("https://nyppagesix.files.wordpress.com/2018/01/larson03.jpg?quality=90&strip=all&w=640")
                .listener(new RequestListener<String, GlideDrawable>() {
                    @Override
                    public boolean onException(Exception e, String model, Target<GlideDrawable> target, boolean isFirstResource) {
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(GlideDrawable resource, String model, Target<GlideDrawable> target, boolean isFromMemoryCache, boolean isFirstResource) {
                        view.setDrawableRight(resource);
                        return true;
                    }
                }).preload();

    }
}
