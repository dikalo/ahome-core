package com.ait.toolkit.core.client;

/**
 * Detects in wich platform that app is running
 */
public class Platform {

	private Platform() {

	}

	/**
	 * Returns true if we are running inside NodeWebkit
	 */
	public static native boolean isNodeWebkit()/*-{
		try {
			var nw = $wnd.require('nw.gui');
			if (nw) {
				return true;
			}
			return false;
		} catch (e) {
			return false;
		}

	}-*/;

}
