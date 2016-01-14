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

@JsType(prototype = "Element")
public interface Set {
    <T> Set animate(Attributes attrs, float duration, Mina easing, Callback<Object> callback);

    Set push();

    Set pop();

    Set forEach(Callback<Object> callback, Object thisArg);

    Set bind(String attr, Callback<Object> callback); // TODO à voir

    Set clear();

    Set splice(int index, int count, Object insertion); // TODO à voir

    boolean exclude(Object element); // TODO à voir
}
