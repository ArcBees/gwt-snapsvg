package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class BoundingBox {
    public double x;
    public double y;
    public double x2;
    public double y2;
    public double width;
    public double height;
}
