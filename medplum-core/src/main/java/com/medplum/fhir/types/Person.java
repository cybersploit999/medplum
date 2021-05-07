/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * Demographics and administrative information about a person independent
 * of a specific health-related context.
 */
public class Person extends FhirResource {
    public static final String RESOURCE_TYPE = "Person";
    public static final String PROPERTY_RESOURCE_TYPE = "resourceType";
    public static final String PROPERTY_ID = "id";
    public static final String PROPERTY_META = "meta";
    public static final String PROPERTY_IMPLICIT_RULES = "implicitRules";
    public static final String PROPERTY_LANGUAGE = "language";
    public static final String PROPERTY_TEXT = "text";
    public static final String PROPERTY_CONTAINED = "contained";
    public static final String PROPERTY_EXTENSION = "extension";
    public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
    public static final String PROPERTY_IDENTIFIER = "identifier";
    public static final String PROPERTY_NAME = "name";
    public static final String PROPERTY_TELECOM = "telecom";
    public static final String PROPERTY_GENDER = "gender";
    public static final String PROPERTY_BIRTH_DATE = "birthDate";
    public static final String PROPERTY_ADDRESS = "address";
    public static final String PROPERTY_PHOTO = "photo";
    public static final String PROPERTY_MANAGING_ORGANIZATION = "managingOrganization";
    public static final String PROPERTY_ACTIVE = "active";
    public static final String PROPERTY_LINK = "link";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Person(final JsonObject data) {
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
     * Identifier for a person within a particular scope.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * A name associated with the person.
     */
    public java.util.List<HumanName> name() {
        return getList(HumanName.class, PROPERTY_NAME);
    }

    /**
     * A contact detail for the person, e.g. a telephone number or an email
     * address.
     */
    public java.util.List<ContactPoint> telecom() {
        return getList(ContactPoint.class, PROPERTY_TELECOM);
    }

    /**
     * Administrative Gender.
     */
    public String gender() {
        return getString(PROPERTY_GENDER);
    }

    /**
     * The birth date for the person.
     */
    public java.time.LocalDate birthDate() {
        return getLocalDate(PROPERTY_BIRTH_DATE);
    }

    /**
     * One or more addresses for the person.
     */
    public java.util.List<Address> address() {
        return getList(Address.class, PROPERTY_ADDRESS);
    }

    /**
     * An image that can be displayed as a thumbnail of the person to enhance
     * the identification of the individual.
     */
    public Attachment photo() {
        return getObject(Attachment.class, PROPERTY_PHOTO);
    }

    /**
     * The organization that is the custodian of the person record.
     */
    public Reference managingOrganization() {
        return getObject(Reference.class, PROPERTY_MANAGING_ORGANIZATION);
    }

    /**
     * Whether this person's record is in active use.
     */
    public Boolean active() {
        return data.getBoolean(PROPERTY_ACTIVE);
    }

    /**
     * Link to a resource that concerns the same actual person.
     */
    public java.util.List<PersonLink> link() {
        return getList(PersonLink.class, PROPERTY_LINK);
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

        public Builder identifier(final java.util.List<Identifier> identifier) {
            b.add(PROPERTY_IDENTIFIER, FhirObject.toArray(identifier));
            return this;
        }

        public Builder name(final java.util.List<HumanName> name) {
            b.add(PROPERTY_NAME, FhirObject.toArray(name));
            return this;
        }

        public Builder telecom(final java.util.List<ContactPoint> telecom) {
            b.add(PROPERTY_TELECOM, FhirObject.toArray(telecom));
            return this;
        }

        public Builder gender(final String gender) {
            b.add(PROPERTY_GENDER, gender);
            return this;
        }

        public Builder birthDate(final java.time.LocalDate birthDate) {
            b.add(PROPERTY_BIRTH_DATE, birthDate.toString());
            return this;
        }

        public Builder address(final java.util.List<Address> address) {
            b.add(PROPERTY_ADDRESS, FhirObject.toArray(address));
            return this;
        }

        public Builder photo(final Attachment photo) {
            b.add(PROPERTY_PHOTO, photo);
            return this;
        }

        public Builder managingOrganization(final Reference managingOrganization) {
            b.add(PROPERTY_MANAGING_ORGANIZATION, managingOrganization);
            return this;
        }

        public Builder active(final Boolean active) {
            b.add(PROPERTY_ACTIVE, active);
            return this;
        }

        public Builder link(final java.util.List<PersonLink> link) {
            b.add(PROPERTY_LINK, FhirObject.toArray(link));
            return this;
        }

        public Person build() {
            return new Person(b.build());
        }
    }

    /**
     * Demographics and administrative information about a person independent
     * of a specific health-related context.
     */
    public static class PersonLink extends FhirObject {
        public static final String RESOURCE_TYPE = "PersonLink";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_TARGET = "target";
        public static final String PROPERTY_ASSURANCE = "assurance";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public PersonLink(final JsonObject data) {
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
         * The resource to which this actual person is associated.
         */
        public Reference target() {
            return getObject(Reference.class, PROPERTY_TARGET);
        }

        /**
         * Level of assurance that this link is associated with the target
         * resource.
         */
        public String assurance() {
            return getString(PROPERTY_ASSURANCE);
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

            public Builder target(final Reference target) {
                b.add(PROPERTY_TARGET, target);
                return this;
            }

            public Builder assurance(final String assurance) {
                b.add(PROPERTY_ASSURANCE, assurance);
                return this;
            }

            public PersonLink build() {
                return new PersonLink(b.build());
            }
        }
    }
}
