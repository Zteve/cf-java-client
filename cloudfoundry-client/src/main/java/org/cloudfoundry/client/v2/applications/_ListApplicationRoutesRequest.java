/*
 * Copyright 2013-2016 the original author or authors.
 *
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
 */

package org.cloudfoundry.client.v2.applications;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.cloudfoundry.Nullable;
import org.cloudfoundry.client.v2.InFilterParameter;
import org.cloudfoundry.client.v2.PaginatedRequest;
import org.immutables.value.Value;

import java.util.List;

/**
 * The request payload for the List all Routes for the Application operation
 */
@Value.Immutable
abstract class _ListApplicationRoutesRequest extends PaginatedRequest {

    /**
     * The application id
     */
    @JsonIgnore
    abstract String getApplicationId();

    /**
     * The domain ids
     */
    @InFilterParameter("domain_guid")
    @Nullable
    abstract List<String> getDomainIds();

    /**
     * The hosts
     */
    @InFilterParameter("host")
    @Nullable
    abstract List<String> getHosts();

    /**
     * The paths
     */
    @InFilterParameter("path")
    @Nullable
    abstract List<String> getPaths();

    /**
     * The ports
     */
    @InFilterParameter("port")
    @Nullable
    abstract List<Integer> getPorts();

}
