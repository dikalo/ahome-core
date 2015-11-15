package com.ait.toolkit.core.client;

public class Platform {

    private Platform() {

    }

    public static native boolean isNodeWebkit()/*-{
		if ($wnd.nw && $wnd.nw.process && $wnd.nw.process.versions) {
			return true;
		}
		return false;
    }-*/;

}
