/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * A measured amount (or an amount that can potentially be measured).
 * Note that measured amounts include amounts that are not precisely
 * quantified, including amounts involving arbitrary units and floating
 * currencies.
 */
public class Quantity extends FhirResource {
    public static final String RESOURCE_TYPE = "Quantity";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_COMPARATOR = "comparator";
    public static final String PROPERTY_UNIT = "unit";
    public static final String PROPERTY_SYSTEM = "system";
    public static final String PROPERTY_CODE = "code";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Quantity(final JsonObject data) {
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
     * The value of the measured amount. The value includes an implicit
     * precision in the presentation of the value.
     */
    public Double value() {
        return data.getJsonNumber(PROPERTY_VALUE).doubleValue();
    }

    /**
     * How the value should be understood and represented - whether the
     * actual value is greater or less than the stated value due to
     * measurement issues; e.g. if the comparator is &quot;&lt;&quot; , then the real
     * value is &lt; stated value.
     */
    public String comparator() {
        return getString(PROPERTY_COMPARATOR);
    }

    /**
     * A human-readable form of the unit.
     */
    public String unit() {
        return getString(PROPERTY_UNIT);
    }

    /**
     * The identification of the system that provides the coded form of the
     * unit.
     */
    public java.net.URI system() {
        return getUri(PROPERTY_SYSTEM);
    }

    /**
     * A computer processable form of the unit in some unit representation
     * system.
     */
    public String code() {
        return getString(PROPERTY_CODE);
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

        public Builder comparator(final String comparator) {
            b.add(PROPERTY_COMPARATOR, comparator);
            return this;
        }

        public Builder unit(final String unit) {
            b.add(PROPERTY_UNIT, unit);
            return this;
        }

        public Builder system(final java.net.URI system) {
            b.add(PROPERTY_SYSTEM, system.toString());
            return this;
        }

        public Builder code(final String code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Quantity build() {
            return new Quantity(b.build());
        }
    }
}
