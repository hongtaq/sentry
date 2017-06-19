/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.sentry.provider.db;

import org.apache.hadoop.conf.Configuration;
import org.apache.sentry.SentryUserException;
import org.apache.sentry.provider.db.service.persistent.SentryStore;
import org.apache.sentry.provider.db.service.thrift.TAlterSentryRoleAddGroupsRequest;
import org.apache.sentry.provider.db.service.thrift.TAlterSentryRoleDeleteGroupsRequest;
import org.apache.sentry.provider.db.service.thrift.TAlterSentryRoleGrantPrivilegeRequest;
import org.apache.sentry.provider.db.service.thrift.TAlterSentryRoleRevokePrivilegeRequest;
import org.apache.sentry.provider.db.service.thrift.TDropPrivilegesRequest;
import org.apache.sentry.provider.db.service.thrift.TDropSentryRoleRequest;
import org.apache.sentry.provider.db.service.thrift.TRenamePrivilegesRequest;
import org.apache.sentry.provider.db.service.thrift.TSentryPrivilege;

import java.util.Map;

import static org.apache.sentry.hdfs.Updateable.Update;

/**
 * Interface for processing delta changes of Sentry permission and generate corresponding
 * update. The updates will be persisted into Sentry store afterwards along with the actual
 * operation.
 *
 * TODO: SENTRY-1588: add user level privilege change support. e.g. onAlterSentryRoleDeleteUsers,
 * TODO: onAlterSentryRoleDeleteUsers.
 */
public interface SentryPolicyStorePlugin {

  @SuppressWarnings("serial")
  public static class SentryPluginException extends SentryUserException {
    public SentryPluginException(String msg) {
      super(msg);
    }
    public SentryPluginException(String msg, Throwable t) {
      super(msg, t);
    }
  }

  public void initialize(Configuration conf, SentryStore sentryStore) throws SentryPluginException;

  Update onAlterSentryRoleAddGroups(TAlterSentryRoleAddGroupsRequest tRequest) throws SentryPluginException;

  Update onAlterSentryRoleDeleteGroups(TAlterSentryRoleDeleteGroupsRequest tRequest) throws SentryPluginException;

  void onAlterSentryRoleGrantPrivilege(TAlterSentryRoleGrantPrivilegeRequest tRequest,
        Map<TSentryPrivilege, Update> privilegesUpdateMap) throws SentryPluginException;

  void onAlterSentryRoleRevokePrivilege(TAlterSentryRoleRevokePrivilegeRequest tRequest,
        Map<TSentryPrivilege, Update> privilegesUpdateMap) throws SentryPluginException;

  Update onDropSentryRole(TDropSentryRoleRequest tRequest) throws SentryPluginException;

  Update onRenameSentryPrivilege(TRenamePrivilegesRequest request) throws SentryPluginException;

  Update onDropSentryPrivilege(TDropPrivilegesRequest request) throws SentryPluginException;
}
