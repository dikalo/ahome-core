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

/**
 * Base class for representing a native JavaScript class.
 * 
 * <b>Note: For internal use only.</b>
 */
public class JsObject {

	protected JavaScriptObject jsObj;

	protected JsObject() {
	}

	protected JsObject(JavaScriptObject jsObj) {
		this.jsObj = jsObj;
	}

	protected boolean isCreated() {
		return jsObj != null;
	}

	public static JsObject create(JavaScriptObject obj) {
		return new JsObject(obj);
	}

	public JavaScriptObject getJsObj() {
		Util.cleanObjectId(jsObj);
		return jsObj;
	}

	protected void setJsObj(JavaScriptObject jsObj) {
		this.jsObj = jsObj;
	}

	public native String[] getObjectProperties() /*-{
		var jsObj = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return @com.ait.toolkit.core.client.JsoHelper::getProperties(Lcom/google/gwt/core/client/JavaScriptObject;)(jsObj);
	}-*/;

}
