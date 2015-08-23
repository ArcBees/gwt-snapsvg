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

import com.google.gwt.core.client.js.JsProperty;
import com.google.gwt.core.client.js.JsType;

import static com.arcbees.snap.client.snap.JsniUtils.getObject;

@JsType
public interface Mina {
    @JsProperty
    Mina getBackin();

    @JsProperty
    Mina getBackout();

    @JsProperty
    Mina getBounce();

    @JsProperty
    Mina getEasein();

    @JsProperty
    Mina getEaseinout();

    @JsProperty
    Mina getEaseout();

    @JsProperty
    Mina getElastic();

    public static Mina backin = get().getBackin();
    public static Mina backout = get().getBackout();
    public static Mina bounce = get().getBounce();
    public static Mina easein = get().getEasein();
    public static Mina easeinout = get().getEaseinout();
    public static Mina easeout = get().getEaseout();
    public static Mina elastic = get().getElastic();

    public static Mina get() {
        return getObject("mina");
    }
}
