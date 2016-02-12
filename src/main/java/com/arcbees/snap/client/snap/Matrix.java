package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsType;

@JsType(name = "Matrix", isNative = true, namespace = "Snap")
public class Matrix {
    public native Matrix add(int a, int b, int c, int d, int e, int f);

    public native Matrix invert();

    public native Matrix clone();

    public native Matrix translate(int x, int y);

    public native Matrix scale(int x, int y, int cx, int cy);

    public native Matrix rotate(int a, int x, int y);

    public native int x(int x, int y);

    public native int y(int x, int y);

    public native int determinant();

    public native SplittedMatrix split();

    public native String toTransformString();
}
