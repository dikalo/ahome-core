package com.ait.toolkit.core.client;

public class Platform {

    private Platform() {

    }

    /**
    * Returns true if we are running inside NodeWebkit
    */
    public static native boolean isNodeWebkit()/*-{
		if ($wnd.nw && $wnd.nw.process && $wnd.nw.process.versions) {
			return true;
		}
		return false;
    }-*/;

}
