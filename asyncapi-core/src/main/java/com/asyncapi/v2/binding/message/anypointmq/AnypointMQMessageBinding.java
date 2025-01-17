package com.asyncapi.v2.binding.message.anypointmq;

import com.asyncapi.v2.binding.message.MessageBinding;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

/**
 * Describes Anypoint MQ message binding.
 *
 * @version 0.0.1
 * @see <a href="https://github.com/asyncapi/bindings/blob/master/anypointmq/README.md#message-binding-object">Anypoint MQ message binding</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class AnypointMQMessageBinding extends MessageBinding {

    /**
     * OPTIONAL.
     * <p>
     * A Schema object containing the definitions for Anypoint MQ-specific headers (so-called protocol headers).
     * This schema MUST be of type object and have a properties key. Examples of Anypoint MQ protocol headers are
     * messageId and messageGroupId.
     */
    @Nullable
    private Object headers;

    /**
     * OPTIONAL, defaults to latest. The version of this binding.
     */
    @Nullable
    @Builder.Default
    private String bindingVersion = "0.0.1";

}
