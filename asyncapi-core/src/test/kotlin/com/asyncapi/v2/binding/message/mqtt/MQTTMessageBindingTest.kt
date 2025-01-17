package com.asyncapi.v2.binding.message.mqtt

import com.asyncapi.v2.SerDeTest

class MQTTMessageBindingTest: SerDeTest<MQTTMessageBinding>() {

    override fun objectClass() = MQTTMessageBinding::class.java

    override fun baseObjectJson() = "/json/binding/message/mqtt/mqttMessageBinding.json"

    override fun extendedObjectJson() = "/json/binding/message/mqtt/mqttMessageBinding - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/binding/message/mqtt/mqttMessageBinding - wrongly extended.json"

    override fun build(): MQTTMessageBinding {
        return MQTTMessageBinding.builder()
                .build()
    }

}