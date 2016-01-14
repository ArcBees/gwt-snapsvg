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

import com.google.gwt.core.client.js.JsType;

import static com.google.gwt.query.client.js.JsUtils.jsni;

@JsType
public interface Snap {
    static Snap create(String selector) {
        return jsni("Snap", selector);
    }

    static Snap create(com.google.gwt.dom.client.Element element) {
        return jsni("Snap", element);
    }

    String format(String token, Object json);

    Element rad(float deg);

    Element deg(float rad);

    double angle(int x1, int y1, int x2, int y2, int x3, int y3);

    boolean is(Object object, String type);

    int snapTo(int[] values, int value, int tolerance);

    RgbColor getRGB(String color); // TODO warning

    String hsb(int h, int s, int b);

    String hsl(int h, int s, int l);

    String rgb(int r, int g, int b);

    Color color(String clr); // TODO warning

    Color hsb2rgb(int h, int s, int l); // TODO warning

    Color rgb2hsb(int r, int g, int b); // TODO warning

    Color rgb2hsl(int r, int g, int b); // TODO warning

    Element parsePathString(String [] pathString);

    Element parseTransformString(String [] TString);

    Element select(String selector);

    Element selectAll(String selector);

    Mina animate(int [] from, int [] to, Function setter, float duration, Mina easing, Callback<Object> callback);

    Element el(String name, Object attr);

    Element ajax(String url, String postData, Callback<Object> callback, Object scope); // TODO à voir

    Element load(String url, Callback<Object> callback, Object scope); // TODO à voir

    Object getElementByPoint (int x, int y);

    Object plugin (Function function);

    Element matrix(int a, int b, int c, int d, int e, int f); // TODO à voir pour le "or"

    Element rect(int x, int y, int width, int height, int rx, int ry);

    Element circle(int x, int y, float radius);

    Element image(String src, int x, int y, int width, int height);

    Element ellipse(int x, int y, int rx, int ry);

    Element path(String pathString);

    Element g(Element... elements);

    Element svg(int x, int y, int width, int height, int vbx, int vby, int vbw, int vbh);

    Element mask(Element... elements);

    Element ptrn(int x, int y, int width, int height, int vbx, int vby, int vbw, int vbh);

    Element use(String id); // TODO à voir pour le id ui:fields??

    Element text(int x, int y, String text);

    Element line(int x1, int y1, int x2, int y2);

    Element polyline(int... coords);

    Element gradient(String gradient);

    String toString();

    String clear();

    Element filter(String filstr);

    Element filterBlur(int x, int y);
}
