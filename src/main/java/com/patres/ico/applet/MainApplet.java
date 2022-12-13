package com.patres.ico.applet;

import processing.core.PApplet;
import processing.video.Capture;

public class MainApplet extends PApplet {

        private static final int SIZE_X = 1920;
        private static final int SIZE_Y = 1080;
        private static final int CAMERA_RESOLUTION_WIDTH = 640;
        private static final int CAMERA_RESOLUTION_HEIGHT = 480;
        private static final double SCALE_X = (double) SIZE_X / (double) CAMERA_RESOLUTION_WIDTH;
        private static final double SCALE_Y = (double) SIZE_Y / (double) CAMERA_RESOLUTION_HEIGHT;

    public void settings() {
        size(SIZE_X, SIZE_Y);

        final String[] list = Capture.list();
        System.out.println("list = " + list);
    }

    public void draw() {
        background(200);
    }

}
