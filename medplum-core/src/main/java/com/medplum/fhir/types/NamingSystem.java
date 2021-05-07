/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * A curated namespace that issues unique symbols within that namespace
 * for the identification of concepts, people, devices, etc.  Represents
 * a &quot;System&quot; used within the Identifier and Coding data types.
 */
public class NamingSystem extends FhirResource {
    public static final String RESOURCE_TYPE = "NamingSystem";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_KIND = "kind";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_RESPONSIBLE = "responsible";
    public static final String PROPERTY_TYPE = "type";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_USE_CONTEXT = "useContext";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_USAGE = "usage";
    public static final String PROPERTY_UNIQUE_ID = "uniqueId";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public NamingSystem(final JsonObject data) {
        super(data);
    }

    /**
     * A reference to a set of rules that were followed when the resource was
     * constructed, and which must be understood when processing the content.
     * Often, this is a reference to an implementation guide that defines the
     * special rules along with other profiles etc.
     */
    public java.net.URI implicitRules() {
        return getUri(PROPERTY_IMPLICIT_RULES);
    }

    /**
     * The base language in which the resource is written.
     */
    public String language() {
        return getString(PROPERTY_LANGUAGE);
    }

    /**
     * A human-readable narrative that contains a summary of the resource and
     * can be used to represent the content of the resource to a human. The
     * narrative need not encode all the structured data, but is required to
     * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
     * just read the narrative. Resource definitions may define what content
     * should be represented in the narrative to ensure clinical safety.
     */
    public Narrative text() {
        return getObject(Narrative.class, PROPERTY_TEXT);
    }

    /**
     * These resources do not have an independent existence apart from the
     * resource that contains them - they cannot be identified independently,
     * and nor can they have their own independent transaction scope.
     */
    public java.util.List<FhirResource> contained() {
        return getList(FhirResource.class, PROPERTY_CONTAINED);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource. To make the use of extensions
     * safe and manageable, there is a strict set of governance  applied to
     * the definition and use of extensions. Though any implementer can
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension.
     */
    public java.util.List<Extension> extension() {
        return getList(Extension.class, PROPERTY_EXTENSION);
    }

    /**
     * May be used to represent additional information that is not part of
     * the basic definition of the resource and that modifies the
     * understanding of the element that contains it and/or the understanding
     * of the containing element's descendants. Usually modifier elements
     * provide negation or qualification. To make the use of extensions safe
     * and manageable, there is a strict set of governance applied to the
     * definition and use of extensions. Though any implementer is allowed to
     * define an extension, there is a set of requirements that SHALL be met
     * as part of the definition of the extension. Applications processing a
     * resource are required to check for modifier extensions.
     *
     * Modifier extensions SHALL NOT change the meaning of any elements on
     * Resource or DomainResource (including cannot change the meaning of
     * modifierExtension itself).
     */
    public java.util.List<Extension> modifierExtension() {
        return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
    }

    /**
     * A natural language name identifying the naming system. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * The status of this naming system. Enables tracking the life-cycle of
     * the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * Indicates the purpose for the naming system - what kinds of things
     * does it make unique?
     */
    public String kind() {
        return getString(PROPERTY_KIND);
    }

    /**
     * The date  (and optionally time) when the naming system was published.
     * The date must change when the business version changes and it must
     * change if the status code changes. In addition, it should change when
     * the substantive content of the naming system changes.
     */
    public java.time.Instant date() {
        return getInstant(PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the naming
     * system.
     */
    public String publisher() {
        return getString(PROPERTY_PUBLISHER);
    }

    /**
     * Contact details to assist a user in finding and communicating with the
     * publisher.
     */
    public java.util.List<ContactDetail> contact() {
        return getList(ContactDetail.class, PROPERTY_CONTACT);
    }

    /**
     * The name of the organization that is responsible for issuing
     * identifiers or codes for this namespace and ensuring their
     * non-collision.
     */
    public String responsible() {
        return getString(PROPERTY_RESPONSIBLE);
    }

    /**
     * Categorizes a naming system for easier search by grouping related
     * naming systems.
     */
    public CodeableConcept type() {
        return getObject(CodeableConcept.class, PROPERTY_TYPE);
    }

    /**
     * A free text natural language description of the naming system from a
     * consumer's perspective. Details about what the namespace identifies
     * including scope, granularity, version labeling, etc.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate naming system instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the naming system is intended to
     * be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * Provides guidance on the use of the namespace, including the handling
     * of formatting characters, use of upper vs. lower case, etc.
     */
    public String usage() {
        return getString(PROPERTY_USAGE);
    }

    /**
     * Indicates how the system may be identified when referenced in
     * electronic exchange.
     */
    public java.util.List<NamingSystemUniqueId> uniqueId() {
        return getList(NamingSystemUniqueId.class, PROPERTY_UNIQUE_ID);
    }

    public static class Builder extends FhirResource.Builder {

        private Builder() {
            super(RESOURCE_TYPE);
        }

        private Builder(final JsonObject data) {
            super(RESOURCE_TYPE, data);
        }

        public Builder resourceType(final String resourceType) {
            b.add(PROPERTY_RESOURCE_TYPE, resourceType);
            return this;
        }

        public Builder id(final String id) {
            b.add(PROPERTY_ID, id);
            return this;
        }

        public Builder meta(final Meta meta) {
            b.add(PROPERTY_META, meta);
            return this;
        }

        public Builder implicitRules(final java.net.URI implicitRules) {
            b.add(PROPERTY_IMPLICIT_RULES, implicitRules.toString());
            return this;
        }

        public Builder language(final String language) {
            b.add(PROPERTY_LANGUAGE, language);
            return this;
        }

        public Builder text(final Narrative text) {
            b.add(PROPERTY_TEXT, text);
            return this;
        }

        public Builder contained(final java.util.List<FhirResource> contained) {
            b.add(PROPERTY_CONTAINED, FhirObject.toArray(contained));
            return this;
        }

        public Builder extension(final java.util.List<Extension> extension) {
            b.add(PROPERTY_EXTENSION, FhirObject.toArray(extension));
            return this;
        }

        public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
            b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder kind(final String kind) {
            b.add(PROPERTY_KIND, kind);
            return this;
        }

        public Builder date(final java.time.Instant date) {
            b.add(PROPERTY_DATE, date.toString());
            return this;
        }

        public Builder publisher(final String publisher) {
            b.add(PROPERTY_PUBLISHER, publisher);
            return this;
        }

        public Builder contact(final java.util.List<ContactDetail> contact) {
            b.add(PROPERTY_CONTACT, FhirObject.toArray(contact));
            return this;
        }

        public Builder responsible(final String responsible) {
            b.add(PROPERTY_RESPONSIBLE, responsible);
            return this;
        }

        public Builder type(final CodeableConcept type) {
            b.add(PROPERTY_TYPE, type);
            return this;
        }

        public Builder description(final String description) {
            b.add(PROPERTY_DESCRIPTION, description);
            return this;
        }

        public Builder useContext(final java.util.List<UsageContext> useContext) {
            b.add(PROPERTY_USE_CONTEXT, FhirObject.toArray(useContext));
            return this;
        }

        public Builder jurisdiction(final java.util.List<CodeableConcept> jurisdiction) {
            b.add(PROPERTY_JURISDICTION, FhirObject.toArray(jurisdiction));
            return this;
        }

        public Builder usage(final String usage) {
            b.add(PROPERTY_USAGE, usage);
            return this;
        }

        public Builder uniqueId(final java.util.List<NamingSystemUniqueId> uniqueId) {
            b.add(PROPERTY_UNIQUE_ID, FhirObject.toArray(uniqueId));
            return this;
        }

        public NamingSystem build() {
            return new NamingSystem(b.build());
        }
    }

    /**
     * A curated namespace that issues unique symbols within that namespace
     * for the identification of concepts, people, devices, etc.  Represents
     * a &quot;System&quot; used within the Identifier and Coding data types.
     */
    public static class NamingSystemUniqueId extends FhirObject {
        public static final String RESOURCE_TYPE = "NamingSystemUniqueId";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TYPE = "type";
        public static final String PROPERTY_VALUE = "value";
        public static final String PROPERTY_PREFERRED = "preferred";
        public static final String PROPERTY_COMMENT = "comment";
        public static final String PROPERTY_PERIOD = "period";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public NamingSystemUniqueId(final JsonObject data) {
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
         * May be used to represent additional information that is not part of
         * the basic definition of the element and that modifies the
         * understanding of the element in which it is contained and/or the
         * understanding of the containing element's descendants. Usually
         * modifier elements provide negation or qualification. To make the use
         * of extensions safe and manageable, there is a strict set of governance
         * applied to the definition and use of extensions. Though any
         * implementer can define an extension, there is a set of requirements
         * that SHALL be met as part of the definition of the extension.
         * Applications processing a resource are required to check for modifier
         * extensions.
         *
         * Modifier extensions SHALL NOT change the meaning of any elements on
         * Resource or DomainResource (including cannot change the meaning of
         * modifierExtension itself).
         */
        public java.util.List<Extension> modifierExtension() {
            return getList(Extension.class, PROPERTY_MODIFIER_EXTENSION);
        }

        /**
         * Identifies the unique identifier scheme used for this particular
         * identifier.
         */
        public String type() {
            return getString(PROPERTY_TYPE);
        }

        /**
         * The string that should be sent over the wire to identify the code
         * system or identifier system.
         */
        public String value() {
            return getString(PROPERTY_VALUE);
        }

        /**
         * Indicates whether this identifier is the &quot;preferred&quot; identifier of
         * this type.
         */
        public Boolean preferred() {
            return data.getBoolean(PROPERTY_PREFERRED);
        }

        /**
         * Notes about the past or intended usage of this identifier.
         */
        public String comment() {
            return getString(PROPERTY_COMMENT);
        }

        /**
         * Identifies the period of time over which this identifier is considered
         * appropriate to refer to the naming system.  Outside of this window,
         * the identifier might be non-deterministic.
         */
        public Period period() {
            return getObject(Period.class, PROPERTY_PERIOD);
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

            public Builder modifierExtension(final java.util.List<Extension> modifierExtension) {
                b.add(PROPERTY_MODIFIER_EXTENSION, FhirObject.toArray(modifierExtension));
                return this;
            }

            public Builder type(final String type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public Builder value(final String value) {
                b.add(PROPERTY_VALUE, value);
                return this;
            }

            public Builder preferred(final Boolean preferred) {
                b.add(PROPERTY_PREFERRED, preferred);
                return this;
            }

            public Builder comment(final String comment) {
                b.add(PROPERTY_COMMENT, comment);
                return this;
            }

            public Builder period(final Period period) {
                b.add(PROPERTY_PERIOD, period);
                return this;
            }

            public NamingSystemUniqueId build() {
                return new NamingSystemUniqueId(b.build());
            }
        }
    }
}
