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

import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;

/**
 * Base class for all Events
 * 
 * @author Alain Ekambi
 * 
 */
public class BaseEvent extends JsObject {

	protected BaseEvent() {

	}

	protected BaseEvent(JavaScriptObject peer) {
		jsObj = peer;
	}

	public native void preventDefault()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		if (peer.preventDefault) {
			peer.preventDefault();
		} else {
			peer.returnValue = false;
		}

	}-*/;

	public native void stopPropagation()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.stopPropagation();
	}-*/;

	public boolean isBubbles() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "bubbles");
	}

	public boolean isCancelBubble() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "cancelBubble");
	}

	public JavaScriptObject getClipboardData() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "clipboardData");
	}

	public boolean isCancelable() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "cancelable");
	}

	public int getCharCode() {
		return JsoHelper.getAttributeAsInt(jsObj, "charcode");
	}

	public JavaScriptObject getCurrentTarget() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "currentTarget");
	}

	public boolean isDefaultPrevented() {
		return JsoHelper.getAttributeAsBoolean(jsObj, "defaultPrevented");
	}

	public int getDetail() {
		return JsoHelper.getAttributeAsInt(jsObj, "detail");
	}

	public int getEventPhase() {
		return JsoHelper.getAttributeAsInt(jsObj, "eventPhase");
	}

	public String getIdentifier() {
		return JsoHelper.getAttribute(jsObj, "eventPhase");
	}

	public String getType() {
		return JsoHelper.getAttribute(jsObj, "type");
	}

	public double getTimeStamp() {
		return JsoHelper.getAttributeAsDouble(jsObj, "timeStamp");
	}

	public Element getSrcElement() {
		return JsoHelper.getAttributeAsElement(jsObj, "srcElement");
	}

	public Element getTarget() {
		return JsoHelper.getAttributeAsElement(jsObj, "target");
	}

	public int getWitch() {
		return JsoHelper.getAttributeAsInt(jsObj, "witch");
	}

	public JavaScriptObject getView() {
		return JsoHelper.getAttributeAsJavaScriptObject(jsObj, "view");
	}

	public int getPageX() {
		return JsoHelper.getAttributeAsInt(jsObj, "pageX");
	}

	public int getPageY() {
		return JsoHelper.getAttributeAsInt(jsObj, "pageY");
	}

	public int getKeyCode() {
		return JsoHelper.getAttributeAsInt(jsObj, "keyCode");
	}

	public double getLayerY() {
		return JsoHelper.getAttributeAsDouble(jsObj, "layerY");
	}
}
