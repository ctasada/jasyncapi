package com.asyncapi.v2._0_0.model.channel.operation

import com.asyncapi.v2.SerDeTest
import com.asyncapi.v2._0_0.model.ExternalDocumentation
import com.asyncapi.v2._0_0.model.Reference
import com.asyncapi.v2._0_0.model.Tag
import com.asyncapi.v2._0_0.model.channel.message.MessageTest
import com.asyncapi.v2.binding.operation.OperationBinding
import com.asyncapi.v2.binding.operation.amqp.AMQPOperationBindingTest
import com.asyncapi.v2.binding.operation.amqp1.AMQP1OperationBinding
import com.asyncapi.v2.binding.operation.anypointmq.AnypointMQOperationBinding
import com.asyncapi.v2.binding.operation.googlepubsub.GooglePubSubOperationBinding
import com.asyncapi.v2.binding.operation.http.HTTPOperationBindingTest
import com.asyncapi.v2.binding.operation.ibmmq.IBMMQOperationBinding
import com.asyncapi.v2.binding.operation.jms.JMSOperationBinding
import com.asyncapi.v2.binding.operation.kafka.KafkaOperationBindingTest
import com.asyncapi.v2.binding.operation.mercure.MercureOperationBinding
import com.asyncapi.v2.binding.operation.mqtt.MQTTOperationBindingTest
import com.asyncapi.v2.binding.operation.mqtt5.MQTT5OperationBinding
import com.asyncapi.v2.binding.operation.nats.NATSOperationBindingTest
import com.asyncapi.v2.binding.operation.pulsar.PulsarOperationBinding
import com.asyncapi.v2.binding.operation.redis.RedisOperationBinding
import com.asyncapi.v2.binding.operation.sns.SNSOperationBinding
import com.asyncapi.v2.binding.operation.solace.SolaceOperationBindingTest
import com.asyncapi.v2.binding.operation.sqs.SQSOperationBinding
import com.asyncapi.v2.binding.operation.stomp.STOMPOperationBinding
import com.asyncapi.v2.binding.operation.ws.WebSocketsOperationBinding

/**
 * @author Pavel Bodiachevskii
 */
class OperationWithReferenceToMessageTest: SerDeTest<Operation>() {

    override fun objectClass() = Operation::class.java

    override fun baseObjectJson() = "/json/2.0.0/model/channel/operation/operation with reference to message.json"

    override fun extendedObjectJson() = "/json/2.0.0/model/channel/operation/operation with reference to message - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/2.0.0/model/channel/operation/operation with reference to message - wrongly extended.json"

    override fun build(): Operation {
        return Operation.builder()
                .operationId("sendMessage")
                .summary("Send message")
                .description("Send message to remote server")
                .tags(listOf(
                        Tag.builder()
                                .name("messages")
                                .description("operations with messages")
                                .externalDocs(ExternalDocumentation("Messages validation rules", "messages/validation-rules"))
                                .build()
                ))
                .externalDocs(ExternalDocumentation("Messages sending rules", "messages/sending-rules"))
                .bindings(OperationTest.bindings())
                .traits(listOf(
                        Reference("#/components/operationTraits/sendMessage"),
                        OperationTraitTest().build()
                ))
                .message(Reference("#/components/schemas/sendMessage"))
                .build()
    }

}

class OperationWithMessageTest: SerDeTest<Operation>() {

    override fun objectClass() = Operation::class.java

    override fun baseObjectJson() = "/json/2.0.0/model/channel/operation/operation with message.json"

    override fun extendedObjectJson() = "/json/2.0.0/model/channel/operation/operation with message - extended.json"

    override fun wronglyExtendedObjectJson() = "/json/2.0.0/model/channel/operation/operation with message - wrongly extended.json"

    override fun build(): Operation {
        return Operation.builder()
                .operationId("sendMessage")
                .summary("Send message")
                .description("Send message to remote server")
                .tags(listOf(
                        Tag.builder()
                                .name("messages")
                                .description("operations with messages")
                                .externalDocs(ExternalDocumentation("Messages validation rules", "messages/validation-rules"))
                                .build()
                ))
                .externalDocs(ExternalDocumentation("Messages sending rules", "messages/sending-rules"))
                .bindings(OperationTest.bindings())
                .traits(listOf(
                        Reference("#/components/operationTraits/sendMessage"),
                        OperationTraitTest().build()
                ))
                .message(MessageTest().build())
                .build()
    }
}

class OperationTest {
    companion object {
        @JvmStatic
        fun bindings(): Map<String, OperationBinding> {
            return mapOf(
                    Pair("amqp", AMQPOperationBindingTest().build()),
                    Pair("amqp1", AMQP1OperationBinding()),
                    Pair("anypointmq", AnypointMQOperationBinding()),
                    Pair("googlepubsub", GooglePubSubOperationBinding()),
                    Pair("http", HTTPOperationBindingTest().build()),
                    Pair("ibmmq", IBMMQOperationBinding()),
                    Pair("jms", JMSOperationBinding()),
                    Pair("kafka", KafkaOperationBindingTest().build()),
                    Pair("mercure", MercureOperationBinding()),
                    Pair("mqtt", MQTTOperationBindingTest().build()),
                    Pair("mqtt5", MQTT5OperationBinding()),
                    Pair("nats", NATSOperationBindingTest().build()),
                    Pair("pulsar", PulsarOperationBinding()),
                    Pair("redis", RedisOperationBinding()),
                    Pair("sns", SNSOperationBinding()),
                    Pair("solace", SolaceOperationBindingTest().build()),
                    Pair("sqs", SQSOperationBinding()),
                    Pair("stomp", STOMPOperationBinding()),
                    Pair("ws", WebSocketsOperationBinding())
            )
        }
    }
}
