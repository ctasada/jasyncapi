package com.asyncapi.v2._6_0.jackson.model.channel.operation;

import com.asyncapi.v2._6_0.model.Reference;
import com.asyncapi.v2._6_0.model.channel.operation.OperationTrait;
import com.asyncapi.v2.jackson.ListOfReferencesOrObjectsDeserializer;

/**
 * Serializes operation traits list.
 *
 * @author Pavel Bodiachevskii
 */
public class OperationTraitsDeserializer extends ListOfReferencesOrObjectsDeserializer<OperationTrait> {

    @Override
    public Class<OperationTrait> objectTypeClass() {
        return OperationTrait.class;
    }

    @Override
    public Class<?> referenceClass() {
        return Reference.class;
    }

}
