package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsType;

@JsType(name = "Object", isNative = true)
public class Transform {
    public String string;
    public Matrix globalMatrix;
    public Matrix localMatrix;
    public Matrix diffMatrix;
    public String global;
    public String local;
    public Function toString;
}
