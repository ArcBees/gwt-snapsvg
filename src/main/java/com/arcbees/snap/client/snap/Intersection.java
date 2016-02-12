package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class Intersection {
    public int x;
    public int y;
    public double t1;
    public double t2;
    public double segment1;
    public double segment2;
    public Coordinate[] bez1;
    public Coordinate[] bez2;
}
