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

import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.user.client.rpc.RpcRequestBuilder;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 * Utility class to make GWT RPC work on stand alone apps like Titanium, Adobe
 * AIR, PhoneGap
 */
public class RpcUtil {

	private RpcUtil() {

	}

	public static void prepareRpcService(ServiceDefTarget service,
			final String moduleUrl, final String relativeServiceUrl) {
		service.setServiceEntryPoint(moduleUrl + relativeServiceUrl);
		service.setRpcRequestBuilder(new RpcRequestBuilder() {
			@Override
			protected void doFinish(RequestBuilder rb) {
				super.doFinish(rb);
				rb.setHeader(MODULE_BASE_HEADER, moduleUrl);
			}
		});
	}
}
