/*
 *
 *  Copyright 2012-2014 Eurocommercial Properties NV
 *
 *
 *  Licensed under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package org.incode.module.documents.dom.mixins;

import org.incode.module.documents.dom.impl.docs.DocumentAbstract;
import org.incode.module.documents.dom.impl.docs.DocumentTemplate;

public class T_createDocumentAndRender<T> extends T_createDocumentAbstract<T> {

    public T_createDocumentAndRender(final T domainObject) {
        super(domainObject);
    }

    @Override
    protected DocumentAbstract doCreate(final DocumentTemplate template, final String additionalTextIfAny) {
        return template.createAndRender(domainObject, additionalTextIfAny);
    }
}