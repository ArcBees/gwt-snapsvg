package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsType;

@JsType(name = "Object", isNative = true)
public interface Matrix {
    Matrix add(int a, int b, int c, int d, int e, int f);

    Matrix invert();

    Matrix clone();

    Matrix translate(int x, int y);

    Matrix scale(int x, int y, int cx, int cy);

    Matrix rotate(int a, int x, int y);

    int x(int x, int y);

    int y(int x, int y);

    int determinant();

    Matrix split(); // TODO à voir

    String toTransformString();
}
