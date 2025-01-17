package com.asyncapi.v2.security_scheme.oauth2.flow

import com.asyncapi.v2.SerDeTest

class OAuthFlowTest: SerDeTest<OAuthFlow>() {

    override fun objectClass() = OAuthFlow::class.java

    override fun baseObjectJson() = "/json/security_scheme/oauth2/flow/oauthFlow.json"

    override fun extendedObjectJson() = "/json/security_scheme/oauth2/flow/oauthFlow - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/security_scheme/oauth2/flow/oauthFlow - wrongly extended.json"

    override fun build(): OAuthFlow {
        return OAuthFlow.builder()
                .refreshUrl("https://example.com/api/oauth/refresh")
                .scopes(mapOf(
                        Pair("write:pets", "modify pets in your account"),
                        Pair("read:pets", "read your pets")
                ))
                .build()
    }

}