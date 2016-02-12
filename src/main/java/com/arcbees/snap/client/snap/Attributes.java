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

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL, name = "Object")
public interface Attributes {
    @JsOverlay
    public static Attributes create() {
        return JavaScriptObject.createObject().cast();
    }

    @JsProperty
    void setAccentHeight(String accentHeight);

    @JsProperty
    void setAccumulate(String accumulate);

    @JsProperty
    void setAdditive(String additive);

    @JsProperty
    void setAlphabetic(String alphabetic);

    @JsProperty
    void setAmplitude(String amplitude);

    @JsProperty
    void setArabicForm(String arabicForm);

    @JsProperty
    void setAscent(String ascent);

    @JsProperty
    void setAttributeName(String AttributeName);

    @JsProperty
    void setAttributeType(String AttributeType);

    @JsProperty
    void setAzimuth(String Azimuth);

    @JsProperty
    void setBaseFrequency(String baseFrequency);

    @JsProperty
    void setBaseProfile(String BaseProfile);

    @JsProperty
    void setBbox(String Bbox);

    @JsProperty
    void setBegin(String Begin);

    @JsProperty
    void setBias(String Bias);

    @JsProperty
    void setBy(String By);

    @JsProperty
    void setCalcMode(String calcMode);

    @JsProperty
    void setCapHeight(String capHeight);

    @JsProperty
    void setClass(String Class);

    @JsProperty
    void setClipPathUnits(String clipPathUnits);

    @JsProperty
    void setContentScriptType(String contentScriptType);

    @JsProperty
    void setContentStyleType(String contentStyleType);

    @JsProperty
    void setD(String d);

    @JsProperty
    void setDescent(String descent);

    @JsProperty
    void setDiffuseConstant(String diffuseConstant);

    @JsProperty
    void setDivisor(String divisor);

    @JsProperty
    void setDur(String dur);

    @JsProperty
    void setDx(String dx);

    @JsProperty
    void setDy(String dy);

    @JsProperty
    void setEdgeMode(String edgeMode);

    @JsProperty
    void setEnd(String end);

    @JsProperty
    void setExponent(String exponent);

    @JsProperty
    void setExternalResourcesRequired(String externalResourcesRequired);

    @JsProperty
    void setFill(Object fill);

    @JsProperty
    void setFilterRes(Object filterRes);

    @JsProperty
    void setFilterUnits(Object filterUnits);

    @JsProperty
    void setFontFamily(Object fontFamily);

    @JsProperty
    void setFontSize(Object fontSize);

    @JsProperty
    void setFontStretch(Object fontStretch);

    @JsProperty
    void setFontStyle(Object fontStyle);

    @JsProperty
    void setFontVariant(Object fontVariant);

    @JsProperty
    void setFontWeight(Object fontWeight);

    @JsProperty
    void setFormat(Object format);

    @JsProperty
    void setFrom(Object from);

    @JsProperty
    void setFx(Object fx);

    @JsProperty
    void setFy(Object fy);

    @JsProperty
    void setG1(Object g1);

    @JsProperty
    void setG2(Object g2);

    @JsProperty
    void setGlyphName(Object glyphName);

    @JsProperty
    void setGlyphRef(Object glyphRef);

    @JsProperty
    void setGradientTransform(Object gradientTransform);

    @JsProperty
    void setGradientUnits(Object gradientUnits);

    @JsProperty
    void setHanging(Object hanging);

    @JsProperty
    void setHeight(Object height);

    @JsProperty
    void setHorizAdvX(Object horizAdvX);

    @JsProperty
    void setHorizOriginX(Object horizOriginX);

    @JsProperty
    void setHorizOriginY(Object horizOriginY);

    @JsProperty
    void setId(Object id);

    @JsProperty
    void setIdeographic(Object ideographic);

    @JsProperty
    void setIn(Object in);

    @JsProperty
    void setIn2(Object in2);

    @JsProperty
    void setIntercept(Object intercept);

    @JsProperty
    void setK(Object k);

    @JsProperty
    void setK1(Object k1);

    @JsProperty
    void setK2(Object k2);

    @JsProperty
    void setK3(Object k3);

    @JsProperty
    void setK4(Object k4);

    @JsProperty
    void setKernelMatrix(Object kernelMatrix);

    @JsProperty
    void setKernelUnitLength(Object kernelUnitLength);

    @JsProperty
    void setKeyPoints(Object keyPoints);

    @JsProperty
    void setKeySplines(Object keySplines);

    @JsProperty
    void setKeyTimes(Object KeyTimes);

    @JsProperty
    void setLang(Object lang);

    @JsProperty
    void setLengthAdjust(Object lengthAdjust);

    @JsProperty
    void setLimitingConeAngle(Object limitingConeAngle);

    @JsProperty
    void setLocal(Object local);

    @JsProperty
    void setMarkerHeight(Object markerHeight);

    @JsProperty
    void setMarkerUnits(Object markerUnits);

    @JsProperty
    void setMarkerWidth(Object markerWidth);

    @JsProperty
    void setMaskContentUnits(Object maskContentUnits);

    @JsProperty
    void setMaskUnits(Object maskUnits);

    @JsProperty
    void setMathematical(Object mathematical);

    @JsProperty
    void setMax(Object max);

    @JsProperty
    void setMedia(Object media);

    @JsProperty
    void setMethod(Object method);

    @JsProperty
    void setMin(Object min);

    @JsProperty
    void setMode(Object mode);

    @JsProperty
    void setName(Object name);

    @JsProperty
    void setNumOctaves(Object numOctaves);

    @JsProperty
    void setOffset(Object offset);

    @JsProperty
    void setOnabort(Object onabort);

    @JsProperty
    void setOnactivate(Object onactivate);

    @JsProperty
    void setOnbegin(Object onbegin);

    @JsProperty
    void setOnclick(Object onclick);

    @JsProperty
    void setOnend(Object onend);

    @JsProperty
    void setOnerror(Object onerror);

    @JsProperty
    void setOnfocusin(Object onfocusin);

    @JsProperty
    void setOnfocusout(Object onfocusout);

    @JsProperty
    void setOnload(Object onload);

    @JsProperty
    void setOnmousedown(Object onmousedown);

    @JsProperty
    void setOnmousemove(Object onmousemove);

    @JsProperty
    void setOnmouseout(Object onmouseout);

    @JsProperty
    void setOnmouseover(Object onmouseover);

    @JsProperty
    void setOnmouseup(Object onmouseup);

    @JsProperty
    void setOnrepeat(Object onrepeat);

    @JsProperty
    void setOnresize(Object onresize);

    @JsProperty
    void setOnscroll(Object onscroll);

    @JsProperty
    void setOnunload(Object onunload);

    @JsProperty
    void setOnzoom(Object onzoom);

    @JsProperty
    void setOperator(Object operator);

    @JsProperty
    void setOrder(Object order);

    @JsProperty
    void setOrient(Object orient);

    @JsProperty
    void setOrientation(Object orientation);

    @JsProperty
    void setOrigin(Object origin);

    @JsProperty
    void setOverlinePosition(Object overlinePosition);

    @JsProperty
    void setOverlineThickness(Object overlineThickness);

    @JsProperty
    void setPanose1(Object panose1);

    @JsProperty
    void setPath(Object path);

    @JsProperty
    void setPathLength(Object pathLength);

    @JsProperty
    void setPatternContentUnits(Object patternContentUnits);

    @JsProperty
    void setPatternTransform(Object patternTransform);

    @JsProperty
    void setPatternUnits(Object patternUnits);

    @JsProperty
    void setPoints(Object points);

    @JsProperty
    void setPointsAtX(Object pointsAtX);

    @JsProperty
    void setPointsAtY(Object pointsAtY);

    @JsProperty
    void setPointsAtZ(Object pointsAtZ);

    @JsProperty
    void setPreserveAlpha(Object preserveAlpha);

    @JsProperty
    void setPreserveAspectRatio(Object preserveAspectRatio);

    @JsProperty
    void setPrimitiveUnits(Object primitiveUnits);

    @JsProperty
    void setR(Object r);

    @JsProperty
    void setRadius(Object radius);

    @JsProperty
    void setRefX(Object refX);

    @JsProperty
    void setRefY(Object refY);

    @JsProperty
    void setRenderingIntent(Object renderingIntent);

    @JsProperty
    void setRepeatCount(Object repeatCount);

    @JsProperty
    void setRepeatDur(Object repeatDur);

    @JsProperty
    void setRequiredExtensions(Object requiredExtensions);

    @JsProperty
    void setRequiredFeatures(Object requiredFeatures);

    @JsProperty
    void setRestart(Object restart);

    @JsProperty
    void setResult(Object result);

    @JsProperty
    void setRotate(Object rotate);

    @JsProperty
    void setRx(Object rx);

    @JsProperty
    void setRy(Object ry);

    @JsProperty
    void setScale(Object scale);

    @JsProperty
    void setSeed(Object seed);

    @JsProperty
    void setSlope(Object slope);

    @JsProperty
    void setSpacing(Object spacing);

    @JsProperty
    void setSpecularConstant(Object specularConstant);

    @JsProperty
    void setSpecularExponent(Object specularExponent);

    @JsProperty
    void setSpreadMethod(Object spreadMethod);

    @JsProperty
    void setStdDeviation(Object stdDeviation);

    @JsProperty
    void setStemh(Object stemh);

    @JsProperty
    void setStemv(Object stemv);

    @JsProperty
    void setStitchTiles(Object stitchTiles);

    @JsProperty
    void setStrikethroughPosition(Object strikethroughPosition);

    @JsProperty
    void setStrikethroughThickness(Object strikethroughThickness);

    @JsProperty
    void setString(Object string);

    @JsProperty
    void setStyle(Object style);

    @JsProperty
    void setSurfaceScale(Object surfaceScale);

    @JsProperty
    void setSystemLanguage(Object systemLanguage);

    @JsProperty
    void setTableValues(Object tableValues);

    @JsProperty
    void setTarget(Object target);

    @JsProperty
    void setTargetX(Object targetX);

    @JsProperty
    void setTargetY(Object targetY);

    @JsProperty
    void setTextLength(Object textLength);

    @JsProperty
    void setTitle(Object title);

    @JsProperty
    void setTo(Object to);

    @JsProperty
    void setTransform(Object transform);

    @JsProperty
    void setType(Object type);

    @JsProperty
    void setU1(Object u1);

    @JsProperty
    void setU2(Object u2);

    @JsProperty
    void setUnderlinePosition(Object underlinePosition);

    @JsProperty
    void setUnderlineThickness(Object underlineThickness);

    @JsProperty
    void setUnicode(Object unicode);

    @JsProperty
    void setUnicodeRange(Object unicodeRange);

    @JsProperty
    void setUnitsPerEm(Object unitsPerEm);

    @JsProperty
    void setVAlphabetic(Object vAlphabetic);

    @JsProperty
    void setVHanging(Object vHanging);

    @JsProperty
    void setVIdeographic(Object vIdeographic);

    @JsProperty
    void setVMathematical(Object vMathematical);

    @JsProperty
    void setValues(Object values);

    @JsProperty
    void setVersion(Object version);

    @JsProperty
    void setVertAdvY(Object vertAdvY);

    @JsProperty
    void setVertOriginX(Object vertOriginX);

    @JsProperty
    void setVertOriginY(Object vertOriginY);

    @JsProperty
    void setViewBox(Object viewBox);

    @JsProperty
    void setViewTarget(Object viewTarget);

    @JsProperty
    void setWidth(Object width);

    @JsProperty
    void setX(Object x);

    @JsProperty
    void setXHeight(Object xHeight);

    @JsProperty
    void setX1(Object x1);

    @JsProperty
    void setX2(Object x2);

    @JsProperty
    void setXChannelSelector(Object xChannelSelector);

    @JsProperty
    void setXlinkActuate(Object xlinkActuate);

    @JsProperty
    void setXlinkArcrole(Object xlinkArcrole);

    @JsProperty
    void setXlinkHref(Object xlinkHref);

    @JsProperty
    void setXlinkRole(Object xlinkRole);

    @JsProperty
    void setXlinkShow(Object xlinkShow);

    @JsProperty
    void setXlinkTitle(Object xlinkTitle);

    @JsProperty
    void setXlinkType(Object xlinkType);

    @JsProperty
    void setXmlBase(Object xmlBase);

    @JsProperty
    void setXmlLang(Object xmlLang);

    @JsProperty
    void setXmlSpace(Object xmlSpace);

    @JsProperty
    void setY(Object y);

    @JsProperty
    void setY1(Object y1);

    @JsProperty
    void setY2(Object y2);

    @JsProperty
    void setYChannelSelector(Object yChannelSelector);

    @JsProperty
    void setZ(Object z);

    @JsProperty
    void setZoomAndPan(Object zoomAndPan);

    @JsProperty
    void setAlignmentBaseline(Object alignmentBaseline);

    @JsProperty
    void setBaselineShift(Object baselineShift);

    @JsProperty
    void setClipPath(Object clipPath);

    @JsProperty
    void setClipRule(Object clipRule);

    @JsProperty
    void setClip(Object clip);

    @JsProperty
    void setColorInterpolationFilters(Object colorInterpolationFilters);

    @JsProperty
    void setColorInterpolation(Object colorInterpolation);

    @JsProperty
    void setColorProfile(Object colorProfile);

    @JsProperty
    void setColorRendering(Object colorRendering);

    @JsProperty
    void setColor(Object color);

    @JsProperty
    void setCursor(Object cursor);

    @JsProperty
    void setDirection(Object direction);

    @JsProperty
    void setDisplay(Object display);

    @JsProperty
    void setDominantBaseline(Object dominantBaseline);

    @JsProperty
    void setEnableBackground(Object enableBackground);

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
    void setFontSizeAdjust(Object fontSizeAdjust);

    @JsProperty
    void setGlyphOrientationHorizontal(Object glyphOrientationHorizontal);

    @JsProperty
    void setGlyphOrientationVertical(Object glyphOrientationVertical);

    @JsProperty
    void setImageRendering(Object imageRendering);

    @JsProperty
    void setKerning(Object kerning);

    @JsProperty
    void setLetterSpacing(Object letterSpacing);

    @JsProperty
    void setLightingColor(Object lightingColor);

    @JsProperty
    void setMarkerEnd(Object markerEnd);

    @JsProperty
    void setMarkerMid(Object markerMid);

    @JsProperty
    void setMarkerStart(Object markerStart);

    @JsProperty
    void setOpacity(Object opacity);

    @JsProperty
    void setOverflow(Object overflow);

    @JsProperty
    void setPointerEvents(Object pointerEvents);

    @JsProperty
    void setShapeRendering(Object shapeRendering);

    @JsProperty
    void setStopColor(Object stopColor);

    @JsProperty
    void setStopOpacity(Object stopOpacity);

    @JsProperty
    void setMask(Object mask);

    @JsProperty
    void setPointerEvent(Object pointerEvent);

    @JsProperty
    void setStrokeDasharray(Object strokeDasharray);

    @JsProperty
    void setStroke(Object stroke);

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
    void setUnicodeBidi(Object unicodeBidi);

    @JsProperty
    void setVisibility(Object visibility);

    @JsProperty
    void setWordSpacing(Object wordSpacing);

    @JsProperty
    void setWritingMode(Object writingMode);

    @JsProperty
    void setCx(Object cx);

    @JsProperty
    void setCy(Object cy);

    @JsProperty
    void setTextpath(String path);

    @JsProperty
    void setStartOffset(int offset);
}
