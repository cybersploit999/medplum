/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

import { Annotation } from './Annotation';
import { CodeableConcept } from './CodeableConcept';
import { ContactDetail } from './ContactDetail';
import { Extension } from './Extension';
import { Identifier } from './Identifier';
import { Meta } from './Meta';
import { Narrative } from './Narrative';
import { Period } from './Period';
import { Reference } from './Reference';
import { RelatedArtifact } from './RelatedArtifact';
import { Resource } from './Resource';
import { UsageContext } from './UsageContext';

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesis {

  /**
   * This is a RiskEvidenceSynthesis resource
   */
  readonly resourceType: 'RiskEvidenceSynthesis';

  /**
   * The logical id of the resource, as used in the URL for the resource.
   * Once assigned, this value never changes.
   */
  readonly id?: string;

  /**
   * The metadata about the resource. This is content that is maintained by
   * the infrastructure. Changes to the content might not always be
   * associated with version changes to the resource.
   */
  readonly meta?: Meta;

  /**
   * A reference to a set of rules that were followed when the resource was
   * constructed, and which must be understood when processing the content.
   * Often, this is a reference to an implementation guide that defines the
   * special rules along with other profiles etc.
   */
  readonly implicitRules?: string;

  /**
   * The base language in which the resource is written.
   */
  readonly language?: string;

  /**
   * A human-readable narrative that contains a summary of the resource and
   * can be used to represent the content of the resource to a human. The
   * narrative need not encode all the structured data, but is required to
   * contain sufficient detail to make it &quot;clinically safe&quot; for a human to
   * just read the narrative. Resource definitions may define what content
   * should be represented in the narrative to ensure clinical safety.
   */
  readonly text?: Narrative;

  /**
   * These resources do not have an independent existence apart from the
   * resource that contains them - they cannot be identified independently,
   * and nor can they have their own independent transaction scope.
   */
  readonly contained?: Resource[];

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the resource. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * An absolute URI that is used to identify this risk evidence synthesis
   * when it is referenced in a specification, model, design or an
   * instance; also called its canonical identifier. This SHOULD be
   * globally unique and SHOULD be a literal address at which at which an
   * authoritative instance of this risk evidence synthesis is (or will be)
   * published. This URL can be the target of a canonical reference. It
   * SHALL remain the same when the risk evidence synthesis is stored on
   * different servers.
   */
  readonly url?: string;

  /**
   * A formal identifier that is used to identify this risk evidence
   * synthesis when it is represented in other formats, or referenced in a
   * specification, model, design or an instance.
   */
  readonly identifier?: Identifier[];

  /**
   * The identifier that is used to identify this version of the risk
   * evidence synthesis when it is referenced in a specification, model,
   * design or instance. This is an arbitrary value managed by the risk
   * evidence synthesis author and is not expected to be globally unique.
   * For example, it might be a timestamp (e.g. yyyymmdd) if a managed
   * version is not available. There is also no expectation that versions
   * can be placed in a lexicographical sequence.
   */
  readonly version?: string;

  /**
   * A natural language name identifying the risk evidence synthesis. This
   * name should be usable as an identifier for the module by machine
   * processing applications such as code generation.
   */
  readonly name?: string;

  /**
   * A short, descriptive, user-friendly title for the risk evidence
   * synthesis.
   */
  readonly title?: string;

  /**
   * The status of this risk evidence synthesis. Enables tracking the
   * life-cycle of the content.
   */
  readonly status?: string;

  /**
   * The date  (and optionally time) when the risk evidence synthesis was
   * published. The date must change when the business version changes and
   * it must change if the status code changes. In addition, it should
   * change when the substantive content of the risk evidence synthesis
   * changes.
   */
  readonly date?: Date;

  /**
   * The name of the organization or individual that published the risk
   * evidence synthesis.
   */
  readonly publisher?: string;

  /**
   * Contact details to assist a user in finding and communicating with the
   * publisher.
   */
  readonly contact?: ContactDetail[];

  /**
   * A free text natural language description of the risk evidence
   * synthesis from a consumer's perspective.
   */
  readonly description?: string;

  /**
   * A human-readable string to clarify or explain concepts about the
   * resource.
   */
  readonly note?: Annotation[];

  /**
   * The content was developed with a focus and intent of supporting the
   * contexts that are listed. These contexts may be general categories
   * (gender, age, ...) or may be references to specific programs
   * (insurance plans, studies, ...) and may be used to assist with
   * indexing and searching for appropriate risk evidence synthesis
   * instances.
   */
  readonly useContext?: UsageContext[];

  /**
   * A legal or geographic region in which the risk evidence synthesis is
   * intended to be used.
   */
  readonly jurisdiction?: CodeableConcept[];

  /**
   * A copyright statement relating to the risk evidence synthesis and/or
   * its contents. Copyright statements are generally legal restrictions on
   * the use and publishing of the risk evidence synthesis.
   */
  readonly copyright?: string;

  /**
   * The date on which the resource content was approved by the publisher.
   * Approval happens once when the content is officially approved for
   * usage.
   */
  readonly approvalDate?: Date;

  /**
   * The date on which the resource content was last reviewed. Review
   * happens periodically after approval but does not change the original
   * approval date.
   */
  readonly lastReviewDate?: Date;

  /**
   * The period during which the risk evidence synthesis content was or is
   * planned to be in active use.
   */
  readonly effectivePeriod?: Period;

  /**
   * Descriptive topics related to the content of the
   * RiskEvidenceSynthesis. Topics provide a high-level categorization
   * grouping types of EffectEvidenceSynthesiss that can be useful for
   * filtering and searching.
   */
  readonly topic?: CodeableConcept[];

  /**
   * An individiual or organization primarily involved in the creation and
   * maintenance of the content.
   */
  readonly author?: ContactDetail[];

  /**
   * An individual or organization primarily responsible for internal
   * coherence of the content.
   */
  readonly editor?: ContactDetail[];

  /**
   * An individual or organization primarily responsible for review of some
   * aspect of the content.
   */
  readonly reviewer?: ContactDetail[];

  /**
   * An individual or organization responsible for officially endorsing the
   * content for use in some setting.
   */
  readonly endorser?: ContactDetail[];

  /**
   * Related artifacts such as additional documentation, justification, or
   * bibliographic references.
   */
  readonly relatedArtifact?: RelatedArtifact[];

  /**
   * Type of synthesis eg meta-analysis.
   */
  readonly synthesisType?: CodeableConcept;

  /**
   * Type of study eg randomized trial.
   */
  readonly studyType?: CodeableConcept;

  /**
   * A reference to a EvidenceVariable resource that defines the population
   * for the research.
   */
  readonly population?: Reference;

  /**
   * A reference to a EvidenceVariable resource that defines the exposure
   * for the research.
   */
  readonly exposure?: Reference;

  /**
   * A reference to a EvidenceVariable resomece that defines the outcome
   * for the research.
   */
  readonly outcome?: Reference;

  /**
   * A description of the size of the sample involved in the synthesis.
   */
  readonly sampleSize?: RiskEvidenceSynthesisSampleSize;

  /**
   * The estimated risk of the outcome.
   */
  readonly riskEstimate?: RiskEvidenceSynthesisRiskEstimate;

  /**
   * A description of the certainty of the risk estimate.
   */
  readonly certainty?: RiskEvidenceSynthesisCertainty[];
}

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesisCertainty {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * A rating of the certainty of the effect estimate.
   */
  readonly rating?: CodeableConcept[];

  /**
   * A human-readable string to clarify or explain concepts about the
   * resource.
   */
  readonly note?: Annotation[];

  /**
   * A description of a component of the overall certainty.
   */
  readonly certaintySubcomponent?: RiskEvidenceSynthesisCertaintySubcomponent[];
}

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesisCertaintySubcomponent {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * Type of subcomponent of certainty rating.
   */
  readonly type?: CodeableConcept;

  /**
   * A rating of a subcomponent of rating certainty.
   */
  readonly rating?: CodeableConcept[];

  /**
   * A human-readable string to clarify or explain concepts about the
   * resource.
   */
  readonly note?: Annotation[];
}

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesisPrecisionEstimate {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * Examples include confidence interval and interquartile range.
   */
  readonly type?: CodeableConcept;

  /**
   * Use 95 for a 95% confidence interval.
   */
  readonly level?: number;

  /**
   * Lower bound of confidence interval.
   */
  readonly from?: number;

  /**
   * Upper bound of confidence interval.
   */
  readonly to?: number;
}

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesisRiskEstimate {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * Human-readable summary of risk estimate.
   */
  readonly description?: string;

  /**
   * Examples include proportion and mean.
   */
  readonly type?: CodeableConcept;

  /**
   * The point estimate of the risk estimate.
   */
  readonly value?: number;

  /**
   * Specifies the UCUM unit for the outcome.
   */
  readonly unitOfMeasure?: CodeableConcept;

  /**
   * The sample size for the group that was measured for this risk
   * estimate.
   */
  readonly denominatorCount?: number;

  /**
   * The number of group members with the outcome of interest.
   */
  readonly numeratorCount?: number;

  /**
   * A description of the precision of the estimate for the effect.
   */
  readonly precisionEstimate?: RiskEvidenceSynthesisPrecisionEstimate[];
}

/**
 * The RiskEvidenceSynthesis resource describes the likelihood of an
 * outcome in a population plus exposure state where the risk estimate is
 * derived from a combination of research studies.
 */
export interface RiskEvidenceSynthesisSampleSize {

  /**
   * Unique id for the element within a resource (for internal references).
   * This may be any string value that does not contain spaces.
   */
  readonly id?: string;

  /**
   * May be used to represent additional information that is not part of
   * the basic definition of the element. To make the use of extensions
   * safe and manageable, there is a strict set of governance  applied to
   * the definition and use of extensions. Though any implementer can
   * define an extension, there is a set of requirements that SHALL be met
   * as part of the definition of the extension.
   */
  readonly extension?: Extension[];

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
  readonly modifierExtension?: Extension[];

  /**
   * Human-readable summary of sample size.
   */
  readonly description?: string;

  /**
   * Number of studies included in this evidence synthesis.
   */
  readonly numberOfStudies?: number;

  /**
   * Number of participants included in this evidence synthesis.
   */
  readonly numberOfParticipants?: number;
}
