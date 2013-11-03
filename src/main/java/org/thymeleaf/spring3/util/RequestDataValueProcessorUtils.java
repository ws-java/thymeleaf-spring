/*
 * =============================================================================
 * 
 *   Copyright (c) 2011-2013, The THYMELEAF team (http://www.thymeleaf.org)
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 * 
 * =============================================================================
 */
package org.thymeleaf.spring3.util;

import java.util.Collections;
import java.util.Map;

import org.thymeleaf.Configuration;
import org.thymeleaf.context.IProcessingContext;


/**
 * 
 * @author Daniel Fern&aacute;ndez
 *
 * @since 2.1.0
 *
 */
public final class RequestDataValueProcessorUtils {


    public static String processAction(
            final Configuration configuration, final IProcessingContext processingContext,
            final String action, final String httpMethod) {
        return action;
    }

    public static String processFormFieldValue(
            final Configuration configuration, final IProcessingContext processingContext,
            final String name, final String value, final String type) {
        return value;
    }

    public static Map<String, String> getExtraHiddenFields(
            final Configuration configuration, final IProcessingContext processingContext) {
        return Collections.emptyMap();
    }

    public static String processUrl(
            final Configuration configuration, final IProcessingContext processingContext, final String url) {
        return url;
    }




    private RequestDataValueProcessorUtils() {
	    super();
    }

	
}
