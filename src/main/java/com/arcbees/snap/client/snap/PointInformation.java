package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class PointInformation extends Coordinate {
    public Point m;
    public Point n;
    public Point start;
    public Point end;
}
