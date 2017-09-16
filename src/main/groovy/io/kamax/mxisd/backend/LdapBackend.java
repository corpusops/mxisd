/*
 * mxisd - Matrix Identity Server Daemon
 * Copyright (C) 2017 Maxime Dor
 *
 * https://max.kamax.io/
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package io.kamax.mxisd.backend;

import io.kamax.mxisd.config.ldap.LdapConfig;
import org.apache.commons.lang.StringUtils;
import org.apache.directory.api.ldap.model.exception.LdapException;
import org.apache.directory.ldap.client.api.LdapConnection;
import org.apache.directory.ldap.client.api.LdapNetworkConnection;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LdapBackend {

    private Logger log = LoggerFactory.getLogger(LdapBackend.class);

    @Autowired
    private LdapConfig ldapCfg;

    protected LdapConnection getConn() {
        return new LdapNetworkConnection(ldapCfg.getConn().getHost(), ldapCfg.getConn().getPort(), ldapCfg.getConn().isTls());
    }

    protected void bind(LdapConnection conn) throws LdapException {
        if (StringUtils.isBlank(ldapCfg.getConn().getBindDn()) && StringUtils.isBlank(ldapCfg.getConn().getBindPassword())) {
            conn.anonymousBind();
        } else {
            conn.bind(ldapCfg.getConn().getBindDn(), ldapCfg.getConn().getBindPassword());
        }
    }

    protected LdapConfig getCfg() {
        return ldapCfg;
    }

}