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

    Element select(String selector);

    Element angle(int x1, int y1, int x2, int y2, int x3, int y3);

    Element circle(int x, int y, float radius);

    Element ellipse(int x, int y, int rx, int ry);

    Element rect(int x, int y, int width, int height, int rx, int ry);

    Element path(String pathString);

    Element gradient(String gradient);

    Element line(int x1, int y1, int x2, int y2);

    Element polyline(int... coords);

    Element text(int x, int y, String text);

    Element drag(int x, int y, String text);
}
