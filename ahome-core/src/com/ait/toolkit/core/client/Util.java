/**
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.core.client;

import java.util.Random;

import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * Utility class
 */
public class Util {

	private Util() {

	}

	/**
	 * Convenient method to detect if the application is running in the browser Useful when Mobile web app are running inside a webview of a native mobile application like Apache
	 * Cordova or Titanium
	 * 
	 * @return true if we are running in the regular browser
	 */
	public native static boolean isWebMode()/*-{
		return ((typeof ($wnd) != 'undefined') || (typeof (window) != 'undefined'));
	}-*/;

	/**
	 * __gwt_ObjectId in devMode needs to be removed in some cases.
	 * 
	 * @param jso
	 */
	public final static void cleanObjectId(JavaScriptObject jso) {
		if (jso == null) {
			return;
		}
		if (!GWT.isScript()) {
			removeGwtObjectIdImpl(jso);
		}
	}

	private final static native void removeGwtObjectIdImpl(JavaScriptObject jso) /*-{
		if (jso['__gwt_ObjectId']) {
			delete jso['__gwt_ObjectId'];
		}
	}-*/;

	/**
	 * Utility method to get the GWT module base URL. Use this method if you are using a custom linker since <code>GWT.getModuleBaseURL()</code> could return null.
	 * 
	 * @return
	 */
	public static String getModuleBaseUrl() {
		String toReturn = GWT.getModuleBaseURL();
		if (toReturn == null) {
			return GWT.getHostPageBaseURL() + GWT.getModuleName() + "/";
		}
		return toReturn;
	}

	public static String randomString() {
		Random random = new Random();
		return Long.toString(Math.abs(random.nextLong()), 36);
	}

}
