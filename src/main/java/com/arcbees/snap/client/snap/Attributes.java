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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

@JsType
public interface Attributes {
    static Attributes create() {
        return JavaScriptObject.createObject().cast();
    }

    @JsProperty
    void setTransform(String transform);

    @JsProperty
    void setFill(Object fill);

    @JsProperty
    void setFillOpacity(Object fillOpacity);

    @JsProperty
    void setFillRule(Object fillRule);

    @JsProperty
    void setFilter(Object filter);

    @JsProperty
    void setFloodColor(Object floodColor);

    @JsProperty
    void setFloodOpacity(Object floodOpacity);

    @JsProperty
    void setFontFamily(Object fontFamily);

    @JsProperty
    void setFontSize(Object fontSize);

    @JsProperty
    void setFontSizeAjust(Object fontSizeAjust);

    @JsProperty
    void setFontStretch(Object fontStretch);

    @JsProperty
    void setFontStyle(Object fontStyle);

    @JsProperty
    void setFontVariant(Object fontVariant);

    @JsProperty
    void setFontWeight(Object fontWeight);

    @JsProperty
    void setMask(Object mask);

    @JsProperty
    void setOpacity(Object opacity);

    @JsProperty
    void setOverflow(Object overflow);

    @JsProperty
    void setPointerEvent(Object pointerEvent);

    @JsProperty
    void setStopColor(Object stopColor);

    @JsProperty
    void setStopOpacity(Object stopOpacity);

    @JsProperty
    void setStroke(Object stroke);

    @JsProperty
    void setStrokeDasharray(Object strokeDasharray);

    @JsProperty
    void setStrokeDashoffset(Object strokeDashoffset);

    @JsProperty
    void setStrokeLinecap(Object strokeLinecap);

    @JsProperty
    void setStrokeLinejoin(Object strokeLinejoin);

    @JsProperty
    void setStrokeMiterlimit(Object strokeMiterlimit);

    @JsProperty
    void setStrokeOpacity(Object strokeOpacity);

    @JsProperty
    void setStrokeWidth(Object strokeWidth);

    @JsProperty
    void setTextAnchor(Object textAnchor);

    @JsProperty
    void setTextDecoration(Object textDecoration);

    @JsProperty
    void setTextRendering(Object textRendering);

    @JsProperty
    void setVisibility(Object visibility);

    @JsProperty
    void setWordSpacing(Object wordSpacing);

    @JsProperty
    void setWritingMode(Object writingMode);

    @JsProperty
    void setColor(Object color);

    @JsProperty
    void setCursor(Object cursor);

    @JsProperty
    void setDirection(Object direction);

    @JsProperty
    void setDisplay(Object display);
}
