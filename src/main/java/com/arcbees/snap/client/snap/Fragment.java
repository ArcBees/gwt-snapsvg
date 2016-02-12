package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(name = "Fragment", isNative = true, namespace = JsPackage.GLOBAL)
public interface Fragment extends Element {
    Fragment fragment(Object... elementsOrString);
}
