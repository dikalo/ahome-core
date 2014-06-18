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

import com.google.gwt.dom.client.Element;

/**
 * Utility class to generate random ids
 * 
 */
public class IdGenerator {

    private IdGenerator() {

    }

    public static String generateId() {
        Random random = new Random();
        return Long.toString(Math.abs(random.nextLong()), 36);
    }

    public static String getOrCreateId(Element element) {
        String id = element.getId();
        if (id == null || id.isEmpty()) {
            id = generateId();
            element.setId(id);
        }
        return id;

    }

}
