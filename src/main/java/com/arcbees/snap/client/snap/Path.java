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
public interface Path {
    String getTotalLength(String path);

    Path getPointAtLength(String path, int length); // TODO à voir

    Path getSubpath(String path, int from, int to);

    Path findDotsAtSegment(int p1x, int p1y, int c1x, int c1y, int c2x, int c2y, int p2x, int p2y, int t); // TODO à voir

    Path bezierBBox(int p1x, int p1y, int c1x, int c1y, int c2x, int c2y, int p2x, int p2y); // TODO à voir

    boolean isPointInsideBBox(String bbox, String x, String y); // TODO à voir

    boolean isBBoxIntersect(String bbox1, String bbox2); // TODO à voir

    Path intersection(String path1, String path2); // TODO à voir

    boolean isPointInside(String path, int x, int y);

    Path getBBox(String path); // TODO à voir

    Path toRelative(String path); // TODO à voir

    Path toAbsolute(String path); // TODO à voir

    Path toCubic(String [] pathString); // TODO à voir

    String map(String path, Matrix matrix); // TODO à voir
}
