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

package com.arcbees.snap.client.application.home;

import javax.inject.Inject;

import com.arcbees.snap.client.snap.Attributes;
import com.arcbees.snap.client.snap.Element;
import com.arcbees.snap.client.snap.Mina;
import com.arcbees.snap.client.snap.Snap;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.gwtplatform.mvp.client.ViewImpl;

public class HomeView extends ViewImpl implements HomePresenter.MyView {
    interface Binder extends UiBinder<Widget, HomeView> {
    }

    @UiField
    com.google.gwt.dom.client.Element svg;

    @Inject
    HomeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        Snap snap = Snap.create(svg);

        Element rect = snap.rect(10, 10, 10, 10, 0, 0);
        Attributes attrs = Attributes.create();
        attrs.setTransform("r30,-100,100");

        rect.animate(attrs, 8000, Mina.bounce, (e) -> {
        });

        Element circle = snap.circle(90, 120, 80);

        Element square = snap.rect(210, 40, 160, 160, 0, 0);

        Element gradient = snap.gradient("l(0, 0, 1, 1)#000-#f00-#fff");

        Attributes attributes = Attributes.create();
        attributes.setFill(gradient);
        attributes.setStroke("blue");
        attributes.setStrokeWidth("10");
        attributes.setOpacity(".25");
        Element ellipse = snap.ellipse(460, 120, 50, 80).attr(attributes);

        Element path = snap.path(
                "M179.4,83.5C179.4,83.5,241.8,71.70000000000002,241.8,71.70000000000002C257.1,115.1,165.8,174.3,219"
                        + ".20000000000002,183.2C280.70000000000005,155.6,345.3,126.29999999999998,421.8,137.1C440.5,"
                        + "156,443.3,176.89999999999998,434,199.39999999999998C250.6,296.7,52.400000000000006,259.2,"
                        + "179.4,83.5C179.4,83.5,179.4,83.5,179.4,83.5");

        Element line = snap.line(10, 10, 30, 30);

        Attributes polyStroke = Attributes.create();
        polyStroke.setStroke("#bada55");
        polyStroke.setFill("transparent");
        Element polyline = snap.polyline(10, 10, 30, 30, 100, 120, 220, 120).attr(polyStroke);

        Attributes textAttr = Attributes.create();
        textAttr.setFill("red");
        textAttr.setWritingMode("tb");
        Element text = snap.text(100, 10, "jimmy joe").attr(textAttr);


    }

    private native Element wrapElement(Object element) /*-{
        return new $wnd.Snap(element);
    }-*/;
}
