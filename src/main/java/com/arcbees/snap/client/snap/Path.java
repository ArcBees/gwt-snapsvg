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

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Element")
public interface Path {
    double getTotalLength(String path);

    Coordinate getPointAtLength(String path, int length);

    String getSubpath(String path, int from, int to);

    PointInformation findDotsAtSegment(int p1x, int p1y, int c1x, int c1y, int c2x, int c2y, int p2x, int p2y, int t);

    BoundingBox bezierBBox(int p1x, int p1y, int c1x, int c1y, int c2x, int c2y, int p2x, int p2y);

    boolean isPointInsideBBox(String bbox, String x, String y);

    boolean isBBoxIntersect(String bbox1, String bbox2);

    Intersection[] intersection(String path1, String path2);

    Intersection[] intersection(Element path1, Element path2);

    boolean isPointInside(String path, int x, int y);

    BoundingBox getBBox(String path);

    String[] toRelative(String path);

    String[] toAbsolute(String path);

    String[] toCubic(String path);

    String map(String path, Matrix matrix);
}
