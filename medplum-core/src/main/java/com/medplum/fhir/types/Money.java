/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * An amount of economic utility in some recognized currency.
 */
public class Money extends FhirResource {
    public static final String RESOURCE_TYPE = "Money";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_CURRENCY = "currency";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Money(final JsonObject data) {
        super(data);
    }

    /**
     * Unique id for the element within a resource (for internal references).
     * This may be any string value that does not contain spaces.
     */
    public String id() {
        return getString(PROPERTY_ID);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the element. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * Numerical value (with implicit precision).
     */
    public Double value() {
        return data.getJsonNumber(PROPERTY_VALUE).doubleValue();
    }

    /**
     * ISO 4217 Currency Code.
     */
    public String currency() {
        return getString(PROPERTY_CURRENCY);
    }

    public static class Builder {
        private final JsonObjectBuilder b;

        private Builder() {
            b = Json.createObjectBuilder();
        }

        private Builder(final JsonObject data) {
            b = Json.createObjectBuilder(data);
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder value(final Double value) {
            b.add(PROPERTY_VALUE, value);
            return this;
        }

        public Builder currency(final String currency) {
            b.add(PROPERTY_CURRENCY, currency);
            return this;
        }

        public Money build() {
            return new Money(b.build());
        }
    }
}
