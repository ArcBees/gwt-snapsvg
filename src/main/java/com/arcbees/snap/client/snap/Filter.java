package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsType;

@JsType(name = "Object", isNative = true)
public interface Filter {
    Filter blur(int x, int y);

    Filter shadow(int dx, int dy, int blur, String color, int opacity);

    Filter grayscale(int amount);

    Filter sepia(int amount);

    Filter saturate(int amount);

    Filter hueRotate(int amount);

    Filter invert(int amount);

    Filter brightness(int amount);

    Filter contrast(int amount);
}
