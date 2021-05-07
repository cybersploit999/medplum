/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * Defines the characteristics of a message that can be shared between
 * systems, including the type of event that initiates the message, the
 * content to be transmitted and what response(s), if any, are permitted.
 */
public class MessageDefinition extends FhirResource {
    public static final String RESOURCE_TYPE = "MessageDefinition";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_URL = "url";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_VERSION = "version";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_TITLE = "title";
    public static final String PROPERTY_REPLACES = "replaces";
    public static final String PROPERTY_STATUS = "status";
    public static final String PROPERTY_EXPERIMENTAL = "experimental";
    public static final String PROPERTY_DATE = "date";
    public static final String PROPERTY_PUBLISHER = "publisher";
    public static final String PROPERTY_CONTACT = "contact";
    public static final String PROPERTY_DESCRIPTION = "description";
    public static final String PROPERTY_USE_CONTEXT = "useContext";
    public static final String PROPERTY_JURISDICTION = "jurisdiction";
    public static final String PROPERTY_PURPOSE = "purpose";
    public static final String PROPERTY_COPYRIGHT = "copyright";
    public static final String PROPERTY_BASE = "base";
    public static final String PROPERTY_PARENT = "parent";
    public static final String PROPERTY_EVENT_CODING = "eventCoding";
    public static final String PROPERTY_EVENT_URI = "eventUri";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_FOCUS = "focus";
    public static final String PROPERTY_RESPONSE_REQUIRED = "responseRequired";
    public static final String PROPERTY_ALLOWED_RESPONSE = "allowedResponse";
    public static final String PROPERTY_GRAPH = "graph";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public MessageDefinition(final JsonObject data) {
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
     * The business identifier that is used to reference the
     * MessageDefinition and *is* expected to be consistent from server to
     * server.
     */
    public java.net.URI url() {
        return getUri(PROPERTY_URL);
    }

    /**
     * A formal identifier that is used to identify this message definition
     * when it is represented in other formats, or referenced in a
     * specification, model, design or an instance.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The identifier that is used to identify this version of the message
     * definition when it is referenced in a specification, model, design or
     * instance. This is an arbitrary value managed by the message definition
     * author and is not expected to be globally unique. For example, it
     * might be a timestamp (e.g. yyyymmdd) if a managed version is not
     * available. There is also no expectation that versions can be placed in
     * a lexicographical sequence.
     */
    public String version() {
        return getString(PROPERTY_VERSION);
    }

    /**
     * A natural language name identifying the message definition. This name
     * should be usable as an identifier for the module by machine processing
     * applications such as code generation.
     */
    public String name() {
        return getString(PROPERTY_NAME);
    }

    /**
     * A short, descriptive, user-friendly title for the message definition.
     */
    public String title() {
        return getString(PROPERTY_TITLE);
    }

    /**
     * A MessageDefinition that is superseded by this definition.
     */
    public java.util.List<String> replaces() {
        return getList(String.class, PROPERTY_REPLACES);
    }

    /**
     * The status of this message definition. Enables tracking the life-cycle
     * of the content.
     */
    public String status() {
        return getString(PROPERTY_STATUS);
    }

    /**
     * A Boolean value to indicate that this message definition is authored
     * for testing purposes (or education/evaluation/marketing) and is not
     * intended to be used for genuine usage.
     */
    public Boolean experimental() {
        return data.getBoolean(PROPERTY_EXPERIMENTAL);
    }

    /**
     * The date  (and optionally time) when the message definition was
     * published. The date must change when the business version changes and
     * it must change if the status code changes. In addition, it should
     * change when the substantive content of the message definition changes.
     */
    public java.time.Instant date() {
        return getInstant(PROPERTY_DATE);
    }

    /**
     * The name of the organization or individual that published the message
     * definition.
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
     * A free text natural language description of the message definition
     * from a consumer's perspective.
     */
    public String description() {
        return getString(PROPERTY_DESCRIPTION);
    }

    /**
     * The content was developed with a focus and intent of supporting the
     * contexts that are listed. These contexts may be general categories
     * (gender, age, ...) or may be references to specific programs
     * (insurance plans, studies, ...) and may be used to assist with
     * indexing and searching for appropriate message definition instances.
     */
    public java.util.List<UsageContext> useContext() {
        return getList(UsageContext.class, PROPERTY_USE_CONTEXT);
    }

    /**
     * A legal or geographic region in which the message definition is
     * intended to be used.
     */
    public java.util.List<CodeableConcept> jurisdiction() {
        return getList(CodeableConcept.class, PROPERTY_JURISDICTION);
    }

    /**
     * Explanation of why this message definition is needed and why it has
     * been designed as it has.
     */
    public String purpose() {
        return getString(PROPERTY_PURPOSE);
    }

    /**
     * A copyright statement relating to the message definition and/or its
     * contents. Copyright statements are generally legal restrictions on the
     * use and publishing of the message definition.
     */
    public String copyright() {
        return getString(PROPERTY_COPYRIGHT);
    }

    /**
     * The MessageDefinition that is the basis for the contents of this
     * resource.
     */
    public String base() {
        return getString(PROPERTY_BASE);
    }

    /**
     * Identifies a protocol or workflow that this MessageDefinition
     * represents a step in.
     */
    public java.util.List<String> parent() {
        return getList(String.class, PROPERTY_PARENT);
    }

    /**
     * Event code or link to the EventDefinition.
     */
    public Coding eventCoding() {
        return getObject(Coding.class, PROPERTY_EVENT_CODING);
    }

    /**
     * Event code or link to the EventDefinition.
     */
    public String eventUri() {
        return getString(PROPERTY_EVENT_URI);
    }

    /**
     * The impact of the content of the message.
     */
    public String category() {
        return getString(PROPERTY_CATEGORY);
    }

    /**
     * Identifies the resource (or resources) that are being addressed by the
     * event.  For example, the Encounter for an admit message or two Account
     * records for a merge.
     */
    public java.util.List<MessageDefinitionFocus> focus() {
        return getList(MessageDefinitionFocus.class, PROPERTY_FOCUS);
    }

    /**
     * Declare at a message definition level whether a response is required
     * or only upon error or success, or never.
     */
    public String responseRequired() {
        return getString(PROPERTY_RESPONSE_REQUIRED);
    }

    /**
     * Indicates what types of messages may be sent as an application-level
     * response to this message.
     */
    public java.util.List<MessageDefinitionAllowedResponse> allowedResponse() {
        return getList(MessageDefinitionAllowedResponse.class, PROPERTY_ALLOWED_RESPONSE);
    }

    /**
     * Canonical reference to a GraphDefinition. If a URL is provided, it is
     * the canonical reference to a [[[GraphDefinition]]] that it controls
     * what resources are to be added to the bundle when building the
     * document. The GraphDefinition can also specify profiles that apply to
     * the various resources.
     */
    public java.util.List<String> graph() {
        return getList(String.class, PROPERTY_GRAPH);
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

        public Builder url(final java.net.URI url) {
            b.add(PROPERTY_URL, url.toString());
            return this;
        }

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder version(final String version) {
            b.add(PROPERTY_VERSION, version);
            return this;
        }

        public Builder name(final String name) {
            b.add(PROPERTY_NAME, name);
            return this;
        }

        public Builder title(final String title) {
            b.add(PROPERTY_TITLE, title);
            return this;
        }

        public Builder replaces(final java.util.List<String> replaces) {
            b.add(PROPERTY_REPLACES, FhirObject.toStringArray(replaces));
            return this;
        }

        public Builder status(final String status) {
            b.add(PROPERTY_STATUS, status);
            return this;
        }

        public Builder experimental(final Boolean experimental) {
            b.add(PROPERTY_EXPERIMENTAL, experimental);
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

        public Builder purpose(final String purpose) {
            b.add(PROPERTY_PURPOSE, purpose);
            return this;
        }

        public Builder copyright(final String copyright) {
            b.add(PROPERTY_COPYRIGHT, copyright);
            return this;
        }

        public Builder base(final String base) {
            b.add(PROPERTY_BASE, base);
            return this;
        }

        public Builder parent(final java.util.List<String> parent) {
            b.add(PROPERTY_PARENT, FhirObject.toStringArray(parent));
            return this;
        }

        public Builder eventCoding(final Coding eventCoding) {
            b.add(PROPERTY_EVENT_CODING, eventCoding);
            return this;
        }

        public Builder eventUri(final String eventUri) {
            b.add(PROPERTY_EVENT_URI, eventUri);
            return this;
        }

        public Builder category(final String category) {
            b.add(PROPERTY_CATEGORY, category);
            return this;
        }

        public Builder focus(final java.util.List<MessageDefinitionFocus> focus) {
            b.add(PROPERTY_FOCUS, FhirObject.toArray(focus));
            return this;
        }

        public Builder responseRequired(final String responseRequired) {
            b.add(PROPERTY_RESPONSE_REQUIRED, responseRequired);
            return this;
        }

        public Builder allowedResponse(final java.util.List<MessageDefinitionAllowedResponse> allowedResponse) {
            b.add(PROPERTY_ALLOWED_RESPONSE, FhirObject.toArray(allowedResponse));
            return this;
        }

        public Builder graph(final java.util.List<String> graph) {
            b.add(PROPERTY_GRAPH, FhirObject.toStringArray(graph));
            return this;
        }

        public MessageDefinition build() {
            return new MessageDefinition(b.build());
        }
    }

    /**
     * Defines the characteristics of a message that can be shared between
     * systems, including the type of event that initiates the message, the
     * content to be transmitted and what response(s), if any, are permitted.
     */
    public static class MessageDefinitionAllowedResponse extends FhirObject {
        public static final String RESOURCE_TYPE = "MessageDefinitionAllowedResponse";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_MESSAGE = "message";
        public static final String PROPERTY_SITUATION = "situation";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MessageDefinitionAllowedResponse(final JsonObject data) {
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
         * A reference to the message definition that must be adhered to by this
         * supported response.
         */
        public String message() {
            return getString(PROPERTY_MESSAGE);
        }

        /**
         * Provides a description of the circumstances in which this response
         * should be used (as opposed to one of the alternative responses).
         */
        public String situation() {
            return getString(PROPERTY_SITUATION);
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

            public Builder message(final String message) {
                b.add(PROPERTY_MESSAGE, message);
                return this;
            }

            public Builder situation(final String situation) {
                b.add(PROPERTY_SITUATION, situation);
                return this;
            }

            public MessageDefinitionAllowedResponse build() {
                return new MessageDefinitionAllowedResponse(b.build());
            }
        }
    }

    /**
     * Defines the characteristics of a message that can be shared between
     * systems, including the type of event that initiates the message, the
     * content to be transmitted and what response(s), if any, are permitted.
     */
    public static class MessageDefinitionFocus extends FhirObject {
        public static final String RESOURCE_TYPE = "MessageDefinitionFocus";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_PROFILE = "profile";
        public static final String PROPERTY_MIN = "min";
        public static final String PROPERTY_MAX = "max";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public MessageDefinitionFocus(final JsonObject data) {
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
         * The kind of resource that must be the focus for this message.
         */
        public String code() {
            return getString(PROPERTY_CODE);
        }

        /**
         * A profile that reflects constraints for the focal resource (and
         * potentially for related resources).
         */
        public String profile() {
            return getString(PROPERTY_PROFILE);
        }

        /**
         * Identifies the minimum number of resources of this type that must be
         * pointed to by a message in order for it to be valid against this
         * MessageDefinition.
         */
        public Integer min() {
            return data.getInt(PROPERTY_MIN);
        }

        /**
         * Identifies the maximum number of resources of this type that must be
         * pointed to by a message in order for it to be valid against this
         * MessageDefinition.
         */
        public String max() {
            return getString(PROPERTY_MAX);
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

            public Builder code(final String code) {
                b.add(PROPERTY_CODE, code);
                return this;
            }

            public Builder profile(final String profile) {
                b.add(PROPERTY_PROFILE, profile);
                return this;
            }

            public Builder min(final Integer min) {
                b.add(PROPERTY_MIN, min);
                return this;
            }

            public Builder max(final String max) {
                b.add(PROPERTY_MAX, max);
                return this;
            }

            public MessageDefinitionFocus build() {
                return new MessageDefinitionFocus(b.build());
            }
        }
    }
}
