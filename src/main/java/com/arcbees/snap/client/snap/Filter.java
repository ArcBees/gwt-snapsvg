package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name = "Object", isNative = true)
public class Filter {
    public native String blur(int x, int y);

    public native String shadow(int dx, int dy, int blur, String color, int opacity);

    public native String grayscale(int amount);

    public native String sepia(int amount);

    public native String saturate(int amount);

    public native String hueRotate(int amount);

    public native String invert(int amount);

    public native String brightness(int amount);

    public native String contrast(int amount);
}
