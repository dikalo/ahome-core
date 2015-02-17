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
package com.ait.toolkit.application.client;

/**
 * Utility class to detect the device form factor
 */
public class FormFactor {

	private FormFactor() {

	}

	public static boolean isDesktop() {
		return getFormFactor().equalsIgnoreCase("desktop");
	}

	public static boolean isPhone() {
		return getFormFactor().equalsIgnoreCase("phone");
	}

	public static boolean isTablet() {
		return getFormFactor().equalsIgnoreCase("tablet");
	}

	public static boolean isMobile() {
		return isPhone() || isTablet();
	}

	private static native String getFormFactor()/*-{

		// Look for the formfactor as a url argument.
		var args = $wnd.location.search;
		var start = args.indexOf("formfactor");
		if (start >= 0) {
			var value = args.substring(start);
			var begin = value.indexOf("=") + 1;
			var end = value.indexOf("&");
			if (end == -1) {
				end = value.length;
			}
			var toReturn = value.substring(begin, end);
			if (toReturn != 'desktop' && toReturn != 'phone'
					&& toReturn != 'tablet') {
				toReturn = 'desktop';
			}
			return toReturn;
		}

		// Detect form factor from user agent.
		var ua = navigator.userAgent.toLowerCase();
		if (ua.indexOf("iphone") != -1 || ua.indexOf("ipod") != -1) {
			// iphone and ipod.
			return "phone";
		} else if (ua.indexOf("ipad") != -1) {
			// ipad.
			return "tablet";
		} else if (ua.indexOf("android") != -1 || ua.indexOf("phone") != -1) {

			// Android - determine the form factor of android devices based on the diagonal screen
			// size. Anything under six inches is a phone, anything over six inches is a tablet.

			var dpi = 160;
			var width = $wnd.screen.width / dpi;
			var height = $wnd.screen.height / dpi;
			var size = Math.sqrt(width * width + height * height);
			return (size < 6) ? "phone" : "tablet";
		}

		// Everything else is a desktop.
		return "desktop";
	}-*/;

}
