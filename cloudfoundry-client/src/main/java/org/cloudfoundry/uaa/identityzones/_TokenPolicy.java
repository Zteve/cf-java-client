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

package org.cloudfoundry.uaa.identityzones;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.cloudfoundry.Nullable;
import org.immutables.value.Value;

import java.util.Map;
import java.util.Optional;

/**
 * The payload for the identity zone token policy
 */
@JsonDeserialize
@Value.Immutable
abstract class _TokenPolicy {

    /**
     * Time in seconds between when a access token is issued and when it expires
     */
    @JsonProperty("accessTokenValidity")
    abstract Optional<Integer> getAccessTokenValidity();

    /**
     * The ID of the key that is used to sign tokens
     */
    @JsonProperty("activeKeyId")
    abstract Optional<String> getActiveKeyId();

    /**
     * Whether the JWT token is revocable
     */
    @JsonProperty("jwtRevocable")
    abstract Optional<Boolean> getJwtRevocable();

    /**
     * The keys of the token policy
     */
    @JsonProperty("keys")
    @Nullable
    abstract Map<String, Object> getKeys();

    /**
     * Time in seconds between when a refresh token is issued and when it expires
     */
    @JsonProperty("refreshTokenValidity")
    abstract Optional<Integer> getRefreshTokenValidity();

}