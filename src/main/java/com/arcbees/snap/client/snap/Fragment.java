package com.arcbees.snap.client.snap;

import jsinterop.annotations.JsType;

@JsType(name = "Object", isNative = true)
public interface Fragment {
    Fragment fragment(Object... elementsOrString);
}
