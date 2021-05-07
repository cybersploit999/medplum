/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * An identifier - identifies some entity uniquely and unambiguously.
 * Typically this is used for business identifiers.
 */
public class Identifier extends FhirResource {
    public static final String RESOURCE_TYPE = "Identifier";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_USE = "use";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_SYSTEM = "system";
    public static final String PROPERTY_VALUE = "value";
    public static final String PROPERTY_PERIOD = "period";
    public static final String PROPERTY_ASSIGNER = "assigner";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Identifier(final JsonObject data) {
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
     * The purpose of this identifier.
     */
    public String use() {
        return getString(PROPERTY_USE);
    }

    /**
     * A coded type for the identifier that can be used to determine which
     * identifier to use for a specific purpose.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * Establishes the namespace for the value - that is, a URL that
     * describes a set values that are unique.
     */
    public java.net.URI system() {
        return getUri(PROPERTY_SYSTEM);
    }

    /**
     * The portion of the identifier typically relevant to the user and which
     * is unique within the context of the system.
     */
    public String value() {
        return getString(PROPERTY_VALUE);
    }

    /**
     * Time period during which identifier is/was valid for use.
     */
    public Period period() {
        return getObject(Period.class, PROPERTY_PERIOD);
    }

    /**
     * Organization that issued/manages the identifier.
     */
    public Reference assigner() {
        return getObject(Reference.class, PROPERTY_ASSIGNER);
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

        public Builder use(final String use) {
            b.add(PROPERTY_USE, use);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder system(final java.net.URI system) {
            b.add(PROPERTY_SYSTEM, system.toString());
            return this;
        }

        public Builder value(final String value) {
            b.add(PROPERTY_VALUE, value);
            return this;
        }

        public Builder period(final Period period) {
            b.add(PROPERTY_PERIOD, period);
            return this;
        }

        public Builder assigner(final Reference assigner) {
            b.add(PROPERTY_ASSIGNER, assigner);
            return this;
        }

        public Identifier build() {
            return new Identifier(b.build());
        }
    }
}
