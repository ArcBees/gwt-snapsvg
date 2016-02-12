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

package com.arcbees.snap.client.application.test1;

import javax.inject.Inject;

import com.arcbees.snap.client.snap.Attributes;
import com.arcbees.snap.client.snap.Element;
import com.arcbees.snap.client.snap.Mina;
import com.arcbees.snap.client.snap.Snap;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class Test1View extends ViewImpl implements Test1Presenter.MyView {
    interface Binder extends UiBinder<Widget, Test1View> {
    }

    @UiField
    com.google.gwt.dom.client.Element svg;

//    @UiField
//    com.google.gwt.dom.client.Element hair;
//    @UiField
//    com.google.gwt.dom.client.Element hair2;

    @Inject
    Test1View(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        Snap snap = new Snap(svg);

        Element rect = snap.rect(10, 10, 10, 10, 0, 0);
        Attributes attrs = Attributes.create();
        attrs.setTransform("r50,-100,100");

        rect.animate(attrs, 2000, Mina.bounce, (e) -> {
//            rect.remove();
//            onAttach();
        });

       /* Element circle = Snap.create(svg).circle(100,100,150);
        attrs = Attributes.create();
        attrs.setTransform("t100,100");

        circle.animate(attrs, 1500, Mina.elastic, (e) -> {
        });

        Element ellipse = snap.ellipse(50, 20, 10, 50);
        attrs = Attributes.create();
        attrs.setTransform("t120,100");

        ellipse.animate(attrs, 1500, Mina.easeinout, (e) -> {
                        circle.remove();
            //            onAttach();
        });*/

//        wrapElement(hair).animate(attrs, 1500, Mina.easeinout, (e) -> {
//        });
//        wrapElement(hair2).animate(attrs, 1500, Mina.easeinout, (e) -> {
//        });
    }

    private native Element wrapElement(Object element) /*-{
        return new $wnd.Snap(element);
     }-*/;
}
