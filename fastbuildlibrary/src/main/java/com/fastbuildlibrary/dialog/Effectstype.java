package com.fastbuildlibrary.dialog;

import com.fastbuildlibrary.dialog.effects.BaseEffects;
import com.fastbuildlibrary.dialog.effects.FadeIn;
import com.fastbuildlibrary.dialog.effects.Fall;
import com.fastbuildlibrary.dialog.effects.FlipH;
import com.fastbuildlibrary.dialog.effects.FlipV;
import com.fastbuildlibrary.dialog.effects.NewsPaper;
import com.fastbuildlibrary.dialog.effects.RotateLeft;
import com.fastbuildlibrary.dialog.effects.Shake;
import com.fastbuildlibrary.dialog.effects.SideFall;
import com.fastbuildlibrary.dialog.effects.RotateBottom;
import com.fastbuildlibrary.dialog.effects.SlideBottom;
import com.fastbuildlibrary.dialog.effects.SlideLeft;
import com.fastbuildlibrary.dialog.effects.SlideRight;
import com.fastbuildlibrary.dialog.effects.SlideTop;
import com.fastbuildlibrary.dialog.effects.Slit;
public enum  Effectstype {

    Fadein(FadeIn.class),
    Slideleft(SlideLeft.class),
    Slidetop(SlideTop.class),
    SlideBottom(SlideBottom.class),
    Slideright(SlideRight.class),
    Fall(Fall.class),
    Newspager(NewsPaper.class),
    Fliph(FlipH.class),
    Flipv(FlipV.class),
    RotateBottom(RotateBottom.class),
    RotateLeft(RotateLeft.class),
    Slit(Slit.class),
    Shake(Shake.class),
    Sidefill(SideFall.class);
    private Class<? extends BaseEffects> effectsClazz;

    private Effectstype(Class<? extends BaseEffects> mclass) {
        effectsClazz = mclass;
    }

    public BaseEffects getAnimator() {
        BaseEffects bEffects=null;
	try {
		bEffects = effectsClazz.newInstance();
	} catch (ClassCastException e) {
		throw new Error("Can not init animatorClazz instance");
	} catch (InstantiationException e) {
		// TODO Auto-generated catch block
		throw new Error("Can not init animatorClazz instance");
	} catch (IllegalAccessException e) {
		// TODO Auto-generated catch block
		throw new Error("Can not init animatorClazz instance");
	}
	return bEffects;
    }
}
