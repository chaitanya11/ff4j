package org.ff4j.test.audit;

/*
 * #%L
 * ff4j-core
 * %%
 * Copyright (C) 2013 - 2016 FF4J
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import org.ff4j.FF4j;
import org.ff4j.audit.proxy.FeatureStoreAuditProxy;
import org.ff4j.core.FeatureStore;
import org.ff4j.store.InMemoryFeatureStore;
import org.ff4j.test.store.FStoreTestSupport;

public class FeatureStoreAuditProxyTest extends FStoreTestSupport {

    /** {@inheritDoc} */
    @Override
    public FeatureStore initStore() {
        FF4j ff4j = new FF4j();
        InMemoryFeatureStore imfs = new InMemoryFeatureStore();
        imfs.setLocation("ff4j.xml");
        ff4j.setFeatureStore(imfs);
        return new FeatureStoreAuditProxy(ff4j, imfs);
    }

}
