/*
 *
 *  Copyright 2012-2013 Eurocommercial Properties NV
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
package org.estatio.dom.asset;

import org.junit.Test;

import org.estatio.dom.AbstractBeanPropertiesTest;
import org.estatio.dom.asset.registration.FixedAssetRegistration;
import org.estatio.dom.asset.registration.FixedAssetRegistrationType;

public class FixedAssetRegistrationTest_beanProperties extends AbstractBeanPropertiesTest {

    @Test
    public void test() {
        final FixedAssetRegistration pojo = new FixedAssetRegistration(){};
        newPojoTester()
            .withFixture(pojos(FixedAsset.class, FixedAssetForTesting.class))
            .withFixture(pojos(FixedAssetRegistrationType.class))
            .exercise(pojo);
    }
    
}