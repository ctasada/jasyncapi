package com.asyncapi.v2.binding.server.pulsar;

import com.asyncapi.v2.binding.server.ServerBinding;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.jetbrains.annotations.Nullable;

/**
 * Describes Pulsar server binding.
 *
 * @version 0.1.0
 * @see <a href="https://github.com/asyncapi/bindings/tree/master/pulsar#server-binding-object">Redis server binding</a>
 * @author Pavel Bodiachevskii
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PulsarServerBinding extends ServerBinding {

    /**
     * The pulsar tenant. If omitted, "public" MUST be assumed.
     */
    @Nullable
    @Builder.Default
    private String tenant = "public";

    /**
     * The version of this binding.
     */
    @Nullable
    @Builder.Default
    private String bindingVersion = "0.1.0";

}
