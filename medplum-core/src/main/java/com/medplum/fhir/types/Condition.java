/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

package com.medplum.fhir.types;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;

/**
 * A clinical condition, problem, diagnosis, or other event, situation,
 * issue, or clinical concept that has risen to a level of concern.
 */
public class Condition extends FhirResource {
    public static final String RESOURCE_TYPE = "Condition";
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
    public static final String PROPERTY_CLINICAL_STATUS = "clinicalStatus";
    public static final String PROPERTY_VERIFICATION_STATUS = "verificationStatus";
    public static final String PROPERTY_CATEGORY = "category";
    public static final String PROPERTY_SEVERITY = "severity";
    public static final String PROPERTY_CODE = "code";
    public static final String PROPERTY_BODY_SITE = "bodySite";
    public static final String PROPERTY_SUBJECT = "subject";
    public static final String PROPERTY_ENCOUNTER = "encounter";
    public static final String PROPERTY_ONSET_DATE_TIME = "onsetDateTime";
    public static final String PROPERTY_ONSET_AGE = "onsetAge";
    public static final String PROPERTY_ONSET_PERIOD = "onsetPeriod";
    public static final String PROPERTY_ONSET_RANGE = "onsetRange";
    public static final String PROPERTY_ONSET_STRING = "onsetString";
    public static final String PROPERTY_ABATEMENT_DATE_TIME = "abatementDateTime";
    public static final String PROPERTY_ABATEMENT_AGE = "abatementAge";
    public static final String PROPERTY_ABATEMENT_PERIOD = "abatementPeriod";
    public static final String PROPERTY_ABATEMENT_RANGE = "abatementRange";
    public static final String PROPERTY_ABATEMENT_STRING = "abatementString";
    public static final String PROPERTY_RECORDED_DATE = "recordedDate";
    public static final String PROPERTY_RECORDER = "recorder";
    public static final String PROPERTY_ASSERTER = "asserter";
    public static final String PROPERTY_STAGE = "stage";
    public static final String PROPERTY_EVIDENCE = "evidence";
    public static final String PROPERTY_NOTE = "note";

    public static Builder create() {
        return new Builder();
    }

    public static Builder create(final JsonObject data) {
        return new Builder(data);
    }

    public Condition(final JsonObject data) {
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
     * Business identifiers assigned to this condition by the performer or
     * other systems which remain constant as the resource is updated and
     * propagates from server to server.
     */
    public java.util.List<Identifier> identifier() {
        return getList(Identifier.class, PROPERTY_IDENTIFIER);
    }

    /**
     * The clinical status of the condition.
     */
    public CodeableConcept clinicalStatus() {
        return getObject(CodeableConcept.class, PROPERTY_CLINICAL_STATUS);
    }

    /**
     * The verification status to support the clinical status of the
     * condition.
     */
    public CodeableConcept verificationStatus() {
        return getObject(CodeableConcept.class, PROPERTY_VERIFICATION_STATUS);
    }

    /**
     * A category assigned to the condition.
     */
    public java.util.List<CodeableConcept> category() {
        return getList(CodeableConcept.class, PROPERTY_CATEGORY);
    }

    /**
     * A subjective assessment of the severity of the condition as evaluated
     * by the clinician.
     */
    public CodeableConcept severity() {
        return getObject(CodeableConcept.class, PROPERTY_SEVERITY);
    }

    /**
     * Identification of the condition, problem or diagnosis.
     */
    public CodeableConcept code() {
        return getObject(CodeableConcept.class, PROPERTY_CODE);
    }

    /**
     * The anatomical location where this condition manifests itself.
     */
    public java.util.List<CodeableConcept> bodySite() {
        return getList(CodeableConcept.class, PROPERTY_BODY_SITE);
    }

    /**
     * Indicates the patient or group who the condition record is associated
     * with.
     */
    public Reference subject() {
        return getObject(Reference.class, PROPERTY_SUBJECT);
    }

    /**
     * The Encounter during which this Condition was created or to which the
     * creation of this record is tightly associated.
     */
    public Reference encounter() {
        return getObject(Reference.class, PROPERTY_ENCOUNTER);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public String onsetDateTime() {
        return getString(PROPERTY_ONSET_DATE_TIME);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Age onsetAge() {
        return getObject(Age.class, PROPERTY_ONSET_AGE);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Period onsetPeriod() {
        return getObject(Period.class, PROPERTY_ONSET_PERIOD);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public Range onsetRange() {
        return getObject(Range.class, PROPERTY_ONSET_RANGE);
    }

    /**
     * Estimated or actual date or date-time  the condition began, in the
     * opinion of the clinician.
     */
    public String onsetString() {
        return getString(PROPERTY_ONSET_STRING);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public String abatementDateTime() {
        return getString(PROPERTY_ABATEMENT_DATE_TIME);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Age abatementAge() {
        return getObject(Age.class, PROPERTY_ABATEMENT_AGE);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Period abatementPeriod() {
        return getObject(Period.class, PROPERTY_ABATEMENT_PERIOD);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public Range abatementRange() {
        return getObject(Range.class, PROPERTY_ABATEMENT_RANGE);
    }

    /**
     * The date or estimated date that the condition resolved or went into
     * remission. This is called &quot;abatement&quot; because of the many overloaded
     * connotations associated with &quot;remission&quot; or &quot;resolution&quot; - Conditions
     * are never really resolved, but they can abate.
     */
    public String abatementString() {
        return getString(PROPERTY_ABATEMENT_STRING);
    }

    /**
     * The recordedDate represents when this particular Condition record was
     * created in the system, which is often a system-generated date.
     */
    public java.time.Instant recordedDate() {
        return getInstant(PROPERTY_RECORDED_DATE);
    }

    /**
     * Individual who recorded the record and takes responsibility for its
     * content.
     */
    public Reference recorder() {
        return getObject(Reference.class, PROPERTY_RECORDER);
    }

    /**
     * Individual who is making the condition statement.
     */
    public Reference asserter() {
        return getObject(Reference.class, PROPERTY_ASSERTER);
    }

    /**
     * Clinical stage or grade of a condition. May include formal severity
     * assessments.
     */
    public java.util.List<ConditionStage> stage() {
        return getList(ConditionStage.class, PROPERTY_STAGE);
    }

    /**
     * Supporting evidence / manifestations that are the basis of the
     * Condition's verification status, such as evidence that confirmed or
     * refuted the condition.
     */
    public java.util.List<ConditionEvidence> evidence() {
        return getList(ConditionEvidence.class, PROPERTY_EVIDENCE);
    }

    /**
     * Additional information about the Condition. This is a general
     * notes/comments entry  for description of the Condition, its diagnosis
     * and prognosis.
     */
    public java.util.List<Annotation> note() {
        return getList(Annotation.class, PROPERTY_NOTE);
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

        public Builder clinicalStatus(final CodeableConcept clinicalStatus) {
            b.add(PROPERTY_CLINICAL_STATUS, clinicalStatus);
            return this;
        }

        public Builder verificationStatus(final CodeableConcept verificationStatus) {
            b.add(PROPERTY_VERIFICATION_STATUS, verificationStatus);
            return this;
        }

        public Builder category(final java.util.List<CodeableConcept> category) {
            b.add(PROPERTY_CATEGORY, FhirObject.toArray(category));
            return this;
        }

        public Builder severity(final CodeableConcept severity) {
            b.add(PROPERTY_SEVERITY, severity);
            return this;
        }

        public Builder code(final CodeableConcept code) {
            b.add(PROPERTY_CODE, code);
            return this;
        }

        public Builder bodySite(final java.util.List<CodeableConcept> bodySite) {
            b.add(PROPERTY_BODY_SITE, FhirObject.toArray(bodySite));
            return this;
        }

        public Builder subject(final Reference subject) {
            b.add(PROPERTY_SUBJECT, subject);
            return this;
        }

        public Builder encounter(final Reference encounter) {
            b.add(PROPERTY_ENCOUNTER, encounter);
            return this;
        }

        public Builder onsetDateTime(final String onsetDateTime) {
            b.add(PROPERTY_ONSET_DATE_TIME, onsetDateTime);
            return this;
        }

        public Builder onsetAge(final Age onsetAge) {
            b.add(PROPERTY_ONSET_AGE, onsetAge);
            return this;
        }

        public Builder onsetPeriod(final Period onsetPeriod) {
            b.add(PROPERTY_ONSET_PERIOD, onsetPeriod);
            return this;
        }

        public Builder onsetRange(final Range onsetRange) {
            b.add(PROPERTY_ONSET_RANGE, onsetRange);
            return this;
        }

        public Builder onsetString(final String onsetString) {
            b.add(PROPERTY_ONSET_STRING, onsetString);
            return this;
        }

        public Builder abatementDateTime(final String abatementDateTime) {
            b.add(PROPERTY_ABATEMENT_DATE_TIME, abatementDateTime);
            return this;
        }

        public Builder abatementAge(final Age abatementAge) {
            b.add(PROPERTY_ABATEMENT_AGE, abatementAge);
            return this;
        }

        public Builder abatementPeriod(final Period abatementPeriod) {
            b.add(PROPERTY_ABATEMENT_PERIOD, abatementPeriod);
            return this;
        }

        public Builder abatementRange(final Range abatementRange) {
            b.add(PROPERTY_ABATEMENT_RANGE, abatementRange);
            return this;
        }

        public Builder abatementString(final String abatementString) {
            b.add(PROPERTY_ABATEMENT_STRING, abatementString);
            return this;
        }

        public Builder recordedDate(final java.time.Instant recordedDate) {
            b.add(PROPERTY_RECORDED_DATE, recordedDate.toString());
            return this;
        }

        public Builder recorder(final Reference recorder) {
            b.add(PROPERTY_RECORDER, recorder);
            return this;
        }

        public Builder asserter(final Reference asserter) {
            b.add(PROPERTY_ASSERTER, asserter);
            return this;
        }

        public Builder stage(final java.util.List<ConditionStage> stage) {
            b.add(PROPERTY_STAGE, FhirObject.toArray(stage));
            return this;
        }

        public Builder evidence(final java.util.List<ConditionEvidence> evidence) {
            b.add(PROPERTY_EVIDENCE, FhirObject.toArray(evidence));
            return this;
        }

        public Builder note(final java.util.List<Annotation> note) {
            b.add(PROPERTY_NOTE, FhirObject.toArray(note));
            return this;
        }

        public Condition build() {
            return new Condition(b.build());
        }
    }

    /**
     * A clinical condition, problem, diagnosis, or other event, situation,
     * issue, or clinical concept that has risen to a level of concern.
     */
    public static class ConditionEvidence extends FhirObject {
        public static final String RESOURCE_TYPE = "ConditionEvidence";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_CODE = "code";
        public static final String PROPERTY_DETAIL = "detail";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ConditionEvidence(final JsonObject data) {
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
         * A manifestation or symptom that led to the recording of this
         * condition.
         */
        public java.util.List<CodeableConcept> code() {
            return getList(CodeableConcept.class, PROPERTY_CODE);
        }

        /**
         * Links to other relevant information, including pathology reports.
         */
        public java.util.List<Reference> detail() {
            return getList(Reference.class, PROPERTY_DETAIL);
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

            public Builder code(final java.util.List<CodeableConcept> code) {
                b.add(PROPERTY_CODE, FhirObject.toArray(code));
                return this;
            }

            public Builder detail(final java.util.List<Reference> detail) {
                b.add(PROPERTY_DETAIL, FhirObject.toArray(detail));
                return this;
            }

            public ConditionEvidence build() {
                return new ConditionEvidence(b.build());
            }
        }
    }

    /**
     * A clinical condition, problem, diagnosis, or other event, situation,
     * issue, or clinical concept that has risen to a level of concern.
     */
    public static class ConditionStage extends FhirObject {
        public static final String RESOURCE_TYPE = "ConditionStage";
        public static final String PROPERTY_ID = "id";
        public static final String PROPERTY_EXTENSION = "extension";
        public static final String PROPERTY_MODIFIER_EXTENSION = "modifierExtension";
        public static final String PROPERTY_SUMMARY = "summary";
        public static final String PROPERTY_ASSESSMENT = "assessment";
        public static final String PROPERTY_TYPE = "type";

        public static Builder create() {
            return new Builder();
        }

        public static Builder create(final JsonObject data) {
            return new Builder(data);
        }

        public ConditionStage(final JsonObject data) {
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
         * A simple summary of the stage such as &quot;Stage 3&quot;. The determination of
         * the stage is disease-specific.
         */
        public CodeableConcept summary() {
            return getObject(CodeableConcept.class, PROPERTY_SUMMARY);
        }

        /**
         * Reference to a formal record of the evidence on which the staging
         * assessment is based.
         */
        public java.util.List<Reference> assessment() {
            return getList(Reference.class, PROPERTY_ASSESSMENT);
        }

        /**
         * The kind of staging, such as pathological or clinical staging.
         */
        public CodeableConcept type() {
            return getObject(CodeableConcept.class, PROPERTY_TYPE);
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

            public Builder summary(final CodeableConcept summary) {
                b.add(PROPERTY_SUMMARY, summary);
                return this;
            }

            public Builder assessment(final java.util.List<Reference> assessment) {
                b.add(PROPERTY_ASSESSMENT, FhirObject.toArray(assessment));
                return this;
            }

            public Builder type(final CodeableConcept type) {
                b.add(PROPERTY_TYPE, type);
                return this;
            }

            public ConditionStage build() {
                return new ConditionStage(b.build());
            }
        }
    }
}
