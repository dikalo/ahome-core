package com.ait.toolkit.core.client;

import com.google.gwt.core.client.ScriptInjector;
import com.google.gwt.core.shared.GWT;

/**
 * Utility class to inject jQuery in the application
 */
public final class JQueryUtil {

	private JQueryUtil() {

	}

	private static final JQueryResources resources = (JQueryResources) GWT.create(JQueryResources.class);

	public static void inject() {
		if (!isLoaded()) {
			ScriptInjector.fromString(resources.jq().getText()).setWindow(ScriptInjector.TOP_WINDOW).inject();
		}
	}

	public static native boolean isLoaded()/*-{
		if (typeof $wnd.jQuery === "undefined" || $wnd.jQuery === null) {
			return false;
		}
		return true;
	}-*/;

}
