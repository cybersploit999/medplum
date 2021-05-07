/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

import { Extension } from './Extension';
import { Reference } from './Reference';

/**
 * A  text note which also  contains information about who made the
 * statement and when.
 */
export interface Annotation {

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
   * The individual responsible for making the annotation.
   */
  readonly authorReference?: Reference;

  /**
   * The individual responsible for making the annotation.
   */
  readonly authorString?: string;

  /**
   * Indicates when this particular annotation was made.
   */
  readonly time?: Date;

  /**
   * The text of the annotation in markdown format.
   */
  readonly text?: string;
}
