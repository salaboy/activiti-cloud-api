/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.cloud.api.process.model.impl.events;

import org.activiti.api.process.model.IntegrationContext;
import org.activiti.api.process.model.events.IntegrationEvent;
import org.activiti.cloud.api.model.shared.impl.events.CloudRuntimeEventImpl;
import org.activiti.cloud.api.process.model.events.CloudIntegrationRequestedEvent;

public class CloudIntegrationRequestedImpl extends CloudRuntimeEventImpl<IntegrationContext, IntegrationEvent.IntegrationEvents>
        implements CloudIntegrationRequestedEvent {

    public CloudIntegrationRequestedImpl() {
    }

    public CloudIntegrationRequestedImpl(IntegrationContext integrationContext) {
        super(integrationContext);
        if (getEntity()!=null) 
            setEntityId(getEntity().getId());
    }

    @Override
    public IntegrationEvent.IntegrationEvents getEventType() {
        return IntegrationEvent.IntegrationEvents.INTEGRATION_REQUESTED;
    }
}
