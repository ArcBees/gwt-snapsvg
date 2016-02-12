package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public class SplittedMatrix {
    public double dx;
    public double dy;
    public double scalex;
    public double scaley;
    public double shear;
    public double rotate;
    public boolean isSimple;
}
