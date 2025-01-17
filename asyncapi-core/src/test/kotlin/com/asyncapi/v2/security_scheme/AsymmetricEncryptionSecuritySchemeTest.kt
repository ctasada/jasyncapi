package com.asyncapi.v2.security_scheme

import com.asyncapi.v2.SerDeTest

/**
 * @author Pavel Bodiachevskii
 */
class AsymmetricEncryptionSecuritySchemeTest: SerDeTest<SecurityScheme>() {

    override fun objectClass() = SecurityScheme::class.java

    override fun baseObjectJson() = "/json/security_scheme/asymmetricEncryption.json"

    override fun extendedObjectJson() = "/json/security_scheme/asymmetricEncryption - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/security_scheme/asymmetricEncryption - wrongly extended.json"

    override fun build(): SecurityScheme {
        return SecurityScheme.builder()
                .type(SecurityScheme.Type.ASYMMETRIC_ENCRYPTION)
                .description("asymmetricEncryption")
                .build()
    }

}
