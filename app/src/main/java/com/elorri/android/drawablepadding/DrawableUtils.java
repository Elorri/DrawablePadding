package com.elorri.android.drawablepadding;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;

/**
 * Created by Elorri on 22/10/2016.
 */
public class DrawableUtils {
    public static Drawable addPaddingArround(int padding, Drawable drawable) {
        LayerDrawable withPadding=new LayerDrawable(new Drawable[]{drawable});
        withPadding.setLayerInset(0, padding, padding, padding, padding);
        return withPadding;
    }
}
