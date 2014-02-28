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
package org.estatio.services.settings;

import java.io.Serializable;
import java.util.StringTokenizer;

/**
 * @see http://www.datanucleus.org/products/datanucleus/jdo/primary_key.html
 */
public class UserSettingPrimaryKey implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public String user;
    public String key;
    
    public UserSettingPrimaryKey () {
    }

    public String getUser() {
        return user;
    }

    public void setUser(final String user) {
        this.user = user;
    }

    public String getKey() {
        return key;
    }
    public void setKey(final String key) {
        this.key = key;
    }


    /**
     * Constructor accepting same input as generated by toString().
     */
    public UserSettingPrimaryKey(final String value) {
        StringTokenizer token = new StringTokenizer (value, ";;");
        token.nextToken();               // className
        this.setUser(token.nextToken());   // user
        this.setKey(token.nextToken());    // key
    }

    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof UserSettingPrimaryKey)) {
            return false;
        }
        UserSettingPrimaryKey c = (UserSettingPrimaryKey)obj;

        return getUser().equals(c.getUser()) && getKey().equals(c.getKey());
    }

    public int hashCode () {
        return this.getUser().hashCode() ^ this.getKey().hashCode();
    }

    public String toString () {
        // Give output expected by String constructor
        return this.getClass().getName() + ";;"  + this.getUser() + ";;" + this.getKey();
    }

}