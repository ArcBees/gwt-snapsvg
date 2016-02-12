/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.arcbees.snap.client.snap;

import elemental.svg.SVGMatrix;
import elemental.xml.XMLHttpRequest;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Snap")
public class Snap {
    public static native Mina animate(int from, int to, Callback<Object> setter, float duration, Mina easing, Function
            callback);

    public native Matrix matrix(int a, int b, int c, int d, int e, int f);

    public native Matrix matrix(SVGMatrix svgMatrix);

    public static native Element load(String url, Callback<Element> callback);

    public static native Fragment parse(String svg);

    public static native Element plugin(Function function);

    public static Path path;

    public Snap(String selector) {
    }

    public Snap(com.google.gwt.dom.client.Element element) {
    }

    public static Filter filter;

    public native String format(String token, Object json);

    public native Element rad(float deg);

    public native Element deg(float rad);

    public native double angle(int x1, int y1, int x2, int y2, int x3, int y3);

    public native boolean is(Object object, String type);

    public native int snapTo(int[] values, int value, int tolerance);

    public native RgbColor getRGB(String color); // TODO warning

    public native String hsb(int h, int s, int b);

    public native String hsl(int h, int s, int l);

    public native String rgb(int r, int g, int b);

    public native Color color(String clr); // TODO warning

    public native Color hsb2rgb(int h, int s, int l); // TODO warning

    public native Color rgb2hsb(int r, int g, int b); // TODO warning

    public native Color rgb2hsl(int r, int g, int b); // TODO warning

    public native Element parsePathString(String[] pathString);

    public native Element parseTransformString(String[] TString);

    public native Element select(String selector);

    public native Element selectAll(String selector);

    public native Element el(String name, Object attr);

    public native XMLHttpRequest ajax(String url, String postData, Callback<Object> callback, Object scope);

    public native XMLHttpRequest ajax(String url, Callback<Object> callback, Object scope);

    public native Object getElementByPoint(int x, int y);

    public native Element rect(int x, int y, int width, int height, int rx, int ry);

    public native Element circle(int x, int y, float radius);

    public native Element image(String src, int x, int y, int width, int height);

    public native Element ellipse(int x, int y, int rx, int ry);

    public native Element path(String pathString);

    public native Element g(Element... elements);

    public native Element svg(int x, int y, int width, int height, int vbx, int vby, int vbw, int vbh);

    public native Element mask(Element... elements);

    public native Element ptrn(int x, int y, int width, int height, int vbx, int vby, int vbw, int vbh);

    public native Element use(String id);

    public native Element use(Element element);

    public native Element text(int x, int y, String text);

    public native Element line(int x1, int y1, int x2, int y2);

    public native Element polyline(int... coords);

    public native Element gradient(String gradient);

    public native String toString();

    public native String clear();

    public native Element filter(String filstr);

    public native Element filterBlur(int x, int y);

    public native Element append(Element... elements);

    public native Element hover(Element... elements);
}
