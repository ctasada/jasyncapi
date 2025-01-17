package com.asyncapi.v2.binding.operation.solace.topic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * Describes Solace topic.
 * <p>
 * Contains information about the topic in Solace PubSub+ Broker.
 *
 * @version 0.3.0
 * @see <a href="https://github.com/asyncapi/bindings/tree/master/solace#operation-binding-object">Solace operation binding</a>
 * @author Dennis Brinley, Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SolaceTopic {

    /**
     * A list of topics that the client subscribes to, only applicable when destinationType is 'topic'.
     * If none is given, the client subscribes to the topic as represented by the channel name.
     */
    @Nullable
    protected List<String> topicSubscriptions;

}
