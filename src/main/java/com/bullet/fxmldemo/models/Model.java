package com.bullet.fxmldemo.models;

import com.bullet.fxmldemo.views.ViewFactory;

public class Model {
    private static Model model;
    private final ViewFactory viewFactory;

    private Model() {
        this.viewFactory = new ViewFactory();
    }

    public ViewFactory getViewFactory() {
        return viewFactory;
    }

    public static synchronized Model getInstance() {
        if (model == null) {
            model = new Model();
        }
        return model;
    }
}
