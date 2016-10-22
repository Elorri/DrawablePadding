package com.elorri.android.drawablepadding;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View image = findViewById(R.id.image);

        Drawable imageWithPadding = DrawableUtils.addPaddingArround(
                (int) getResources().getDimension(R.dimen.padding),
                getResources().getDrawable(R.drawable.ic_favorite));
        image.setBackground(imageWithPadding);
    }
}
