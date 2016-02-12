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

import com.arcbees.snap.client.resources.HomeResources;
import com.arcbees.snap.client.snap.Attributes;
import com.arcbees.snap.client.snap.Callback;
import com.arcbees.snap.client.snap.Element;
import com.arcbees.snap.client.snap.Function;
import com.arcbees.snap.client.snap.Intersection;
import com.arcbees.snap.client.snap.Matrix;
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
    HomeResources home;

    @UiField
    com.google.gwt.dom.client.Element svg;

    @UiField
    com.google.gwt.dom.client.Element svgColor;

    @UiField
    com.google.gwt.dom.client.Element svgDisplayImg;

    @UiField
    com.google.gwt.dom.client.Element svgDisplayTitle;

    @UiField
    com.google.gwt.dom.client.Element dasharray;

    @UiField
    com.google.gwt.dom.client.Element transform;

    @UiField
    com.google.gwt.dom.client.Element filterBlur;

    @UiField
    com.google.gwt.dom.client.Element drag;

    @UiField
    com.google.gwt.dom.client.Element mask;

    @UiField
    com.google.gwt.dom.client.Element pathCircleIntersection;

    @UiField
    com.google.gwt.dom.client.Element matrix;

    @UiField
    com.google.gwt.dom.client.Element selectAll;

    @UiField
    com.google.gwt.dom.client.Element gettingStarted;
    @UiField
    com.google.gwt.dom.client.Element animMaskClipPath;
    @UiField
    com.google.gwt.dom.client.Element snapAnotherMask;
    @UiField
    com.google.gwt.dom.client.Element loadingSvg;
    @UiField
    com.google.gwt.dom.client.Element animateRotateGroup;
    @UiField
    com.google.gwt.dom.client.Element transformGroupGroup;
    //    @UiField
//    com.google.gwt.dom.client.Element translatingGroup;
    @UiField
    com.google.gwt.dom.client.Element animTextPath;
    @UiField
    com.google.gwt.dom.client.Element loadingSvgAndAnimate;
    @UiField
    com.google.gwt.dom.client.Element test2Html;

//    @UiField
//    com.google.gwt.dom.client.Element relativeTransform;

    @Inject
    HomeView(Binder uiBinder) {
        initWidget(uiBinder.createAndBindUi(this));
    }

    @Override
    protected void onAttach() {
        Snap snap = new Snap(svg);

        Element snapJoe = snap.svg(100, 100, 100, 100, 0, 0, 0, 0);

        Attributes attrsRect = Attributes.create();
        attrsRect.setStroke("#123456");
        attrsRect.setStrokeWidth(20);
        attrsRect.setFill("red");
        attrsRect.setOpacity(0.2);

        Element rect1 = snap.rect(100, 100, 100, 100, 20, 20).attr(attrsRect);
        Attributes attrsRect1 = Attributes.create();
        attrsRect1.setTransform("r50,-100,100");

        rect1.animate(attrsRect1, 2000, Mina.bounce, e -> {
        });

        Element text = snap.text(100, 50, "hello Jimmy Joe");

        Snap snap1 = new Snap(svgColor);

        Attributes attrsRectColor = Attributes.create();
        attrsRectColor.setFill("red");
        attrsRectColor.setStroke("#123456");
        attrsRectColor.setStrokeWidth(20);
        Element rectColor = snap1.rect(10, 10, 100, 100, 0, 0).attr(attrsRectColor);
        rectColor.click(() -> {
            attrsRectColor.setFill("blue");
            rectColor.attr(attrsRectColor);
        });

        Attributes attrsCircleColor = Attributes.create();
        attrsCircleColor.setFill("red");
        attrsCircleColor.setStroke("black");
        attrsCircleColor.setStrokeWidth(10);
        Element circleColor = snap1.circle(100, 100, 50).attr(attrsCircleColor);
        circleColor.click(() -> {
            attrsCircleColor.setFill("yellow");
            circleColor.attr(attrsCircleColor);
        });

        Attributes attrsTextColor = Attributes.create();
        attrsTextColor.setFill("blue");
        attrsTextColor.setStroke("blue");
        attrsTextColor.setStrokeWidth("0.2");
        Element textColor = snap1.text(200, 100, "Click an Object").attr(attrsTextColor);

        Snap snap2 = new Snap(svgDisplayImg);

        Attributes attrClone = Attributes.create();
        attrClone.setTransform("t100,200r45");
        Element displayImg = snap2.image("/img/arcbees.svg", 0, 0, 200, 200).clone().attr(attrClone);


        Snap snapTitle = new Snap(svgDisplayTitle);
        Element displayTitle = Snap.parse("<title>This is a title 2</title>");
        Element rectTitle = snapTitle.rect(20, 20, 40, 40, 0, 0);
        rectTitle.append(displayTitle);

        Snap snap3 = new Snap(dasharray);

        Attributes attrInnerCircle = Attributes.create();
        attrInnerCircle.setFill("none");
        attrInnerCircle.setStroke("red");
        attrInnerCircle.setStrokeWidth("30");
        attrInnerCircle.setStrokeDasharray("10 300 40 10 10 10 10 10 10 10 10 10 10 10 10 10");
        attrInnerCircle.setStrokeDashoffset(50);
        Element innerCircle = snap3.circle(150, 150, 80).attr(attrInnerCircle);
        Snap.animate(10, 400, new Callback<Object>() {
            @Override
            public void onCallback(Object value) {
                attrInnerCircle.setStrokeDashoffset(value);
                innerCircle.attr(attrInnerCircle);
            }
        }, 5000, null, new Function() {
            @Override
            public void onCallback() {
            }
        });

        Snap snap4 = new Snap(transform);

        Element circleTransform = snap4.circle(100, 200, 10);

        Attributes rectTransform = Attributes.create();
        rectTransform.setStroke("#123456");
        rectTransform.setStrokeWidth("20");
        rectTransform.setFill("red");
        rectTransform.setOpacity("0.3");

        Attributes clone = Attributes.create();
        Attributes clone2 = Attributes.create();
        Attributes clone3 = Attributes.create();
        Attributes clone4 = Attributes.create();
        Attributes clone5 = Attributes.create();
        clone2.setTransform("r20, 100, 200");
        clone3.setTransform("r40, 100, 200");
        clone.setTransform("t100, 100");
        clone4.setTransform("t100, 100r20, 100, 200");
        clone5.setTransform("t100, 100r40 ,100, 200");

        Element rectTransformEl = snap4.rect(100, 100, 100, 100, 20, 20).attr(rectTransform)
                .clone().attr(clone)
                .clone().attr(clone2)
                .clone().attr(clone3)
                .clone().attr(clone4)
                .clone().attr(clone5);

        Attributes attrText = Attributes.create();
        Element textTransform = snap4.text(350, 150, "rotate around 200, 200");

        Attributes attrText2 = Attributes.create();
        Element textTransform2 = snap4.text(350, 250, "combined translate of 100,100 and rotate around 200,200");


//        Snap svgRelativeTransform = new Snap(relativeTransform);
//        Element relativeTransform = Snap.plugin(Function( Snap, Element, Paper, global));


        Snap snap5 = new Snap(filterBlur);

        Element blur = snap5.filter(Snap.filter.blur(5, 10));
        Element shadow = snap5.filter(Snap.filter.shadow(0, 2, 3, "#333333", 1));
//        Element filterChild = blur.node.firstChild; TODO à voir pour le node

        Attributes rectAttr = Attributes.create();
        rectAttr.setStroke("#123456");
        rectAttr.setStrokeWidth("20");
        rectAttr.setFill("red");
        rectAttr.setFilter(blur);
        rectAttr.setFilter(shadow);

        Element rectFilter = snap5.rect(100, 100, 100, 100, 20, 20).attr(rectAttr);

        rectFilter.mouseover(new Function() {
            @Override
            public void onCallback() {
                rectAttr.setFill("yellow");
                rectFilter.attr(rectAttr);
            }
        });


//        Snap snap6 = new Snap(drag);
//
//        Element rectDrag = snap6.rect(20, 20, 40, 40, 0, 0);
//        Element circleDrag = snap6.circle(60, 150, 50);
//
//        rectDrag.drag(new MoveFunction() {
//            @Override
//            public void onCallback(double dx, double dy, double x, double y, Object event) {
//            }
//        }, (x, y, event) -> {
//
//        }, new DragEndFunction() {
//            @Override
//            public void onCallback(Object event) {
//            }
//        }, null, null, null);
//
//        rectDrag.drag();
//        circleDrag.drag();


        Snap snapMask = new Snap(mask);

        Attributes attrBigC = Attributes.create();
        attrBigC.setStroke("silver");
        attrBigC.setStrokeWidth("40");
        attrBigC.setFill("silver");

        Element BigC = snapMask.circle(200, 200, 175).attr(attrBigC);

        Attributes attrRectMask = Attributes.create();
        attrRectMask.setStroke("#123546");
        attrRectMask.setStrokeWidth("20");
        attrRectMask.setFill("red");

        Element rectMask = snapMask.rect(100, 100, 100, 100, 20, 20).attr(attrRectMask);

        Attributes attrCircleMask = Attributes.create();
        attrCircleMask.setStroke("#123456");
        attrCircleMask.setStrokeWidth("20");
        attrCircleMask.setFill("blue");

        Element circleMask = snapMask.circle(50, 50, 50);

        Attributes attrGroupMask = Attributes.create();
        attrGroupMask.setMask(BigC);

        Element group = snapMask.g(rectMask, circleMask).attr(attrGroupMask);


        Snap animatedMaskClipPath = new Snap(animMaskClipPath);


        Attributes attrACPBigC = Attributes.create();
        attrACPBigC.setStroke("silver");
        attrACPBigC.setStrokeWidth("40");
        attrACPBigC.setFill("silver");

        Element bigC = animatedMaskClipPath.circle(100, 100, 75).attr(attrACPBigC);

        Attributes attrACPBigC2 = Attributes.create();
        attrACPBigC2.setStroke("silver");
        attrACPBigC2.setStrokeWidth("40");
        attrACPBigC2.setFill("silver");

        Element bigC2 = animatedMaskClipPath.circle(250, 250, 75).attr(attrACPBigC2);

        Element clipG = animatedMaskClipPath.g(bigC, bigC2);

        Attributes attrrectAnimClipPath = Attributes.create();
        attrrectAnimClipPath.setStroke("#123456");
        attrrectAnimClipPath.setStrokeWidth("20");
        attrrectAnimClipPath.setFill("red");

        Element rectACP = animatedMaskClipPath.rect(100, 100, 100, 100, 20, 20).attr(attrrectAnimClipPath);

        Attributes attrcircleAnimClipPath = Attributes.create();
        attrcircleAnimClipPath.setStroke("#123456");
        attrcircleAnimClipPath.setStrokeWidth("20");
        attrcircleAnimClipPath.setFill("blue");

        Element circleACP = animatedMaskClipPath.circle(50, 50, 50).attr(attrcircleAnimClipPath);


        Attributes attrgroupAnimCLipPath = Attributes.create();
        attrgroupAnimCLipPath.setMask(clipG);

        Element gACP = animatedMaskClipPath.g(rectACP, circleACP).attr(attrgroupAnimCLipPath);

        Attributes attrgroupAnim = Attributes.create();
        attrgroupAnim.setTransform("r360,150,150");

        gACP.animate(attrgroupAnim, 3000, Mina.bounce, object -> {
        });

        Attributes attrClipGAnim = Attributes.create();
        attrClipGAnim.setTransform("t200, 0");

        Attributes attrClipGAnim2 = Attributes.create();
        attrClipGAnim2.setTransform("t0, 0");

        clipG.animate(attrClipGAnim, 3000, Mina.bounce, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
                clipG.animate(attrClipGAnim2, 3000, Mina.bounce,
                        new Callback<Object>() {
                            @Override
                            public void onCallback(Object object1) {
                            }
                        });
            }
        });


        Snap anotherMask = new Snap(snapAnotherMask);

        Attributes attrAMBigC = Attributes.create();
        attrAMBigC.setStroke("silver");
        attrAMBigC.setStrokeWidth("40");
        attrAMBigC.setFill("silver");

        Element AMBigC = anotherMask.circle(100, 100, 50).attr(attrAMBigC);

        Attributes attrAMBigC2 = Attributes.create();
        attrAMBigC2.setFill("red");
        attrAMBigC2.setCx("200");
        attrAMBigC2.setCy("200");

        Element AMBigC2 = AMBigC.clone().attr(attrAMBigC2);

        Attributes attrAMBigC3 = Attributes.create();
        attrAMBigC3.setFill("green");
        attrAMBigC3.setCx("200");
        attrAMBigC3.setCy("50");

        Element AMBigC3 = AMBigC.clone().attr(attrAMBigC3);

        Element AMClipGroup = anotherMask.g(AMBigC, AMBigC2, AMBigC3);

        Attributes attrAMC = Attributes.create();
        attrAMC.setStroke("#123456");
        attrAMC.setStrokeWidth("20");
        attrAMC.setFill("blue");

        Element AMC = anotherMask.circle(50, 50, 150).attr(attrAMC);

        Attributes attrAMCMask = Attributes.create();
        attrAMCMask.setMask(AMClipGroup);

        AMC.attr(attrAMCMask);

        Attributes attrAMCAnim = Attributes.create();
        attrAMCAnim.setCx("400");

        AMC.animate(attrAMCAnim, 2000, Mina.linear, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });



        Snap loadSVG = new Snap(loadingSvg);
        Snap.load("/img/arcbees.svg", new Callback<Element>() {
            @Override
            public void onCallback(Element element) {
                loadSVG.append(element);
            }
        });



        Snap loadSVGAnimate = new Snap(loadingSvgAndAnimate);


        Snap snapCircleInterSection = new Snap(pathCircleIntersection);

        Attributes attrCircleInter = Attributes.create();
        attrCircleInter.setStroke("red");
        attrCircleInter.setFill("none");

        Element cp = snapCircleInterSection.circle(100, 100, 100).attr(attrCircleInter);

        Attributes attrCircleInter2 = Attributes.create();
        attrCircleInter2.setStroke("blue");
        attrCircleInter2.setFill("none");

        Element cp2 = snapCircleInterSection.circle(150, 150, 100).attr(attrCircleInter2);

        Attributes attrCircleInter3 = Attributes.create();
        attrCircleInter3.setStroke("green");
        attrCircleInter3.setFill("none");

        Element cp3 = snapCircleInterSection.circle(100, 100, 100).attr(attrCircleInter3);

        Intersection[] intersections = Snap.path.intersection(cp, cp3);
        for (Intersection intersection : intersections) {
            snapCircleInterSection.circle(intersection.x, intersection.y, 10);
        }


        Snap animRotGroup = new Snap(animateRotateGroup);

        Attributes attrARGCircle = Attributes.create();
        attrARGCircle.setStroke("#123456");
        attrARGCircle.setStrokeWidth("20");
        attrARGCircle.setFill("blue");

        Element ARGCircle = animRotGroup.circle(50, 50, 50).attr(attrARGCircle);

        Attributes attrARGRect = Attributes.create();
        attrARGRect.setStroke("#123456");
        attrARGRect.setStrokeWidth("20");
        attrARGRect.setFill("red");

        Element ARGRect = animRotGroup.rect(100, 100, 100, 100, 20, 20).attr(attrARGRect);

        Element ARGGroup = animRotGroup.g(ARGRect, ARGCircle);

        Attributes AnimARGGroup = Attributes.create();
        AnimARGGroup.setTransform("r360, 150, 150");

        ARGGroup.animate(AnimARGGroup, 1000, Mina.bounce, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });


        Snap animGroupGroup = new Snap(transformGroupGroup);

        Attributes attrRectOrange = Attributes.create();
        attrRectOrange.setStroke("black");
        attrRectOrange.setStrokeWidth("3");
        attrRectOrange.setFill("orange");
        Element rectOrangeRect = animGroupGroup.rect(150, 150, 100, 100, 20, 20).attr(attrRectOrange);

        Attributes attrRectOrangeCircle = Attributes.create();
        attrRectOrangeCircle.setFill("grey");
        attrRectOrangeCircle.setStroke("black");
        attrRectOrangeCircle.setStrokeWidth("1");
        Element rectOrangeCircle = animGroupGroup.circle(225, 225, 10).attr(attrRectOrangeCircle);

        Element rectOrange = animGroupGroup.g(rectOrangeRect, rectOrangeCircle);

        Attributes animRectOrange = Attributes.create();
        animRectOrange.setTransform("r360, 225, 225");

        rectOrange.animate(animRectOrange, 4000, Mina.linear, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });
        rectOrange.drag();

        Attributes attrRectRedRect = Attributes.create();
        attrRectRedRect.setStroke("black");
        attrRectRedRect.setStrokeWidth("3");
        attrRectRedRect.setFill("red");
        attrRectRedRect.setOpacity(".8");
        Element rectRedRect = animGroupGroup.rect(100, 100, 100, 100, 20, 20).attr(attrRectRedRect);

        Attributes attrRectRedCircle = Attributes.create();
        attrRectRedCircle.setFill("grey");
        attrRectRedCircle.setStroke("black");
        attrRectRedCircle.setStrokeWidth("1");
        Element rectRedCircle = animGroupGroup.circle(175, 175, 10).attr(attrRectRedCircle);

        Element rectRed = animGroupGroup.g(rectRedRect, rectRedCircle);

        Attributes animRectRed = Attributes.create();
        animRectRed.setTransform("r360, 175, 175");

        rectRed.appendTo(rectOrange);
        rectRed.animate(animRectRed, 4000, Mina.linear, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });

        Attributes attrRectBlueRect = Attributes.create();
        attrRectBlueRect.setFill("blue");
        attrRectBlueRect.setX("50");
        attrRectBlueRect.setY("50");
        Element rectBlueRect = rectRedRect.clone().attr(attrRectBlueRect);

        Attributes attrRectBlueCircle = Attributes.create();
        attrRectBlueCircle.setCx("125");
        attrRectBlueCircle.setCy("125");
        Element rectBlueCircle = rectOrangeCircle.clone().attr(attrRectBlueCircle);

        Element rectBlue = animGroupGroup.g(rectBlueRect, rectBlueCircle);

        rectBlue.appendTo(rectRed);
        Attributes animRectBlue = Attributes.create();
        animRectBlue.setTransform("r360, 125, 125");

        rectBlue.animate(animRectBlue, 4000, Mina.linear, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });


//        Snap animTransGroup = new Snap(translatingGroup);


        Snap textPath = new Snap(animTextPath);

        String path = "M 100 200 C 200 100 300   0 400 100 C 500 200 600 300 700 200 C 800 100 900 100 900 100";

        Attributes attrTextPath = Attributes.create();
        attrTextPath.setTextpath(path);
        Element textPathText = textPath
                .text(50, 50, "hey hey joe")
                .attr(attrTextPath);


        Attributes attrTextPathAnimate = Attributes.create();
        attrTextPathAnimate.setStartOffset(2000);
        textPathText.getTextPath().animate(attrTextPathAnimate, 10000, Mina.linear, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
            }
        });


        Snap snapmatrix = new Snap(matrix);

        Attributes rectMatrix = Attributes.create();
        rectMatrix.setStroke("#123456");
        rectMatrix.setStrokeWidth("20");
        rectMatrix.setFill("red");

        Element rectMx = snapmatrix.rect(100, 100, 100, 100, 20, 20).attr(rectMatrix);

        Attributes circleMatrix = Attributes.create();
        circleMatrix.setStroke("#123456");
        circleMatrix.setStrokeWidth("20");
        circleMatrix.setFill("red");

        Element circleMx = snapmatrix.circle(50, 50, 50).attr(circleMatrix);

        Element textMx = snapmatrix.text(150, 75, "The order of transformation is important!");

        Element groupMatrix = snapmatrix.g(rectMx, circleMx, textMx);


        Snap snapSelectAll = new Snap(selectAll);


        Snap snapGettingStarted = new Snap(gettingStarted);

        Element smallCircle = snapGettingStarted.circle(100, 150, 50);

        Attributes attrP = Attributes.create();
        attrP.setFill("none");
        attrP.setStroke("#bada55");
        attrP.setStrokeWidth("5");

        Element p = snapGettingStarted.path("M10-5-10,15M15,0,0,15M0-5-20,15").attr(attrP).toPattern(0, 0, 10, 10);

        Attributes attrDisk = Attributes.create();
        attrDisk.setFill("R(150, 150, 100)#fff-#000");
        Element disc = snapGettingStarted.g(smallCircle, snapGettingStarted.circle(200, 150, 50)).attr(attrDisk);

        Attributes attrBigCircle = Attributes.create();
        attrBigCircle.setFill(p);
        attrBigCircle.setStroke("#000");
        attrBigCircle.setStrokeWidth("5");
        attrBigCircle.setMask(disc);

        Element bigCircle = snapGettingStarted.circle(150, 150, 100).attr(attrBigCircle);

        Attributes attText = Attributes.create();
        attText.setFill("#900");
        attText.setFontFamily("verdana");
        attText.setFontSize("20px");
        Element t = snapGettingStarted.text(200, 120, "Snap.svg").attr(attText);

        Snap.load("/img/mascot.svg", new Callback<Element>() {
            @Override
            public void onCallback(Element f) {
                Attributes attrMascot = Attributes.create();
                attrMascot.setFill("red");
                f.selectAll("polygon[fill='#09B39C']").attr(attrMascot);
                Element g = f.select("g");
                snapGettingStarted.append(g);
                g.drag();
            }
        });


        Snap test2 = new Snap(test2Html);

        Element circ1 = test2.circle(100,100,50);
        Element circ2 = test2.circle(200,150,100);

        Attributes attrGroup1 = Attributes.create();
        attrGroup1.setFill("red");
        attrGroup1.setStroke("blue");
        attrGroup1.setStrokeWidth("10");

        Element group1 = test2.g(circ1, circ2).attr(attrGroup1);

        Matrix myMatrix = new Matrix();
        myMatrix.scale(4, 2, 0, 0);

        Matrix myInvertMatrix = myMatrix.invert();

        Attributes group1Anim = Attributes.create();
        group1Anim.setTransform(myMatrix);


        group1.animate(group1Anim, 3000, Mina.bounce, new Callback<Object>() {
            @Override
            public void onCallback(Object object) {
                Attributes group1AnimInvert = Attributes.create();
                group1AnimInvert.setTransform(myInvertMatrix);
                group1.animate(group1AnimInvert, 3000, Mina.bounce, new Callback<Object>() {
                    @Override
                    public void onCallback(Object object) {
                    }
                });
            }
        });




//        rectFilter.hover();


//        Element rect = snap.rect(10, 10, 10, 10, 0, 0);
//        Attributes attrs = Attributes.create();
//        attrs.setTransform("r30,-100,100");
//
//        rect.animate(attrs, 8000, Mina.bounce, (e) -> {
//        });

//        Element circle = snap.circle(90, 120, 80);
//
//        Element square = snap.rect(210, 40, 160, 160, 0, 0);
//
//        Element gradient = snap.gradient("l(0, 0, 1, 1)#000-#f00-#fff");
//
//        Attributes attributes = Attributes.create();
//        attributes.setFill(gradient);
//        attributes.setStroke("blue");
//        attributes.setStrokeWidth("10");
//        attributes.setOpacity(".25");
//        Element ellipse = snap.ellipse(460, 120, 50, 80).attr(attributes);
//
//        Element path = snap.path(
//                "M179.4,83.5C179.4,83.5,241.8,71.70000000000002,241.8,71.70000000000002C257.1,115.1,165.8,174.3,219"
//                        + ".20000000000002,183.2C280.70000000000005,155.6,345.3,126.29999999999998,421.8,137.1C440.5,"
//                        + "156,443.3,176.89999999999998,434,199.39999999999998C250.6,296.7,52.400000000000006,259.2,"
//                        + "179.4,83.5C179.4,83.5,179.4,83.5,179.4,83.5");
//
//        Element line = snap.line(10, 10, 30, 30);
//
//        Attributes polyStroke = Attributes.create();
//        polyStroke.setStroke("#bada55");
//        polyStroke.setFill("transparent");
//        Element polyline = snap.polyline(10, 10, 30, 30, 100, 120, 220, 120).attr(polyStroke);
//
//        Attributes textAttr = Attributes.create();
//        textAttr.setFill("red");
//        textAttr.setWritingMode("tb");
//        Element text = snap.text(100, 10, "jimmy joe").attr(textAttr);
    }

    private native Element wrapElement(Object element) /*-{
        return new $wnd.Snap(element);
    }-*/;
}
