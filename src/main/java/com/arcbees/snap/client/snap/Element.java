/*
 * Copyright 2015 ArcBees Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law oxr agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */

package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Element")
public interface Element {
    <T> Element animation(Attributes attrs, float duration, Mina easing, Callback<Object> callback);

    @JsProperty
    Element getNode();

    @JsProperty
    Element getTextPath();

    @JsProperty
    Element getType();

    Element attr(Attributes attributes);

    BBox getBBox();

    Element transform(String tstr);

    Transform2 transform();

    Element parent();

    Element append(Element... elements);

    Element appendTo(Element element);

    Element prepend(Element element);

    Element prependTo(Element element);

    Element before(Element element);

    Element after(Element element);

    Element insertBefore(Element element);

    Element insertAfter(Element element);

    Element remove();

    Element select(String selector);

    Element selectAll(String selector);

    Element asPX(String attr, String value);

    Element use();

    Element clone();

    Element toDefs();

    Element toPattern(int x, int y, int width, int height);

    Element marker(int x, int y, int width, int height, int refX, int refY);

    Element inAnim();

    Element stop();

    Element animate(Object attrs, float duration, Mina easing, Callback<Object> callback);

    Element data(String key, Object value);

    Element removeData(String key);

    String outerSVG();

    String innerSVG();

    Element addClass(String value);

    Element removeClass(String value);

    boolean hasClass(String value);

    Element toggleClass(String value, boolean flag);

    Element click(Function handler);

    Element unclick(Function handler);

    Element dblclick(Function handler);

    Element undblclick(Function handler);

    Element mousedown(Function handler);

    Element unmousedown(Function handler);

    Element mousemove(Function handler);

    Element unmousemove(Function handler);

    Element mouseout(Function handler);

    Element unmouseout(Function handler);

    Element mouseover(Function handler);

    Element unmouseover(Function handler);

    Element mouseup(Function handler);

    Element unmouseup(Function handler);

    Element touchstart(Function handler);

    Element untouchstart(Function handler);

    Element touchmove(Function handler);

    Element untouchmove(Function handler);

    Element touchend(Function handler);

    Element untouchend(Function handler);

    Element touchcancel(Function handler);

    Element untouchcancel(Function handler);

    Element hover(Function f_in, Function f_out, Object icontext, Object ocontext);

    Element unhover(Function f_in, Function f_out);

    Element drag(MoveFunction onmove, DragStartFunction onstart, DragEndFunction onend, Object mcontext,
                 Object scontext, Object econtext);

    Element drag();

    Element undrag();
}
