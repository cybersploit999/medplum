/*
 * Generated by com.medplum.generator.Generator
 * Do not edit manually.
 */

import { Extension } from './Extension';

/**
 * A expression that is evaluated in a specified context and returns a
 * value. The context of use of the expression must specify the context
 * in which the expression is evaluated, and how the result of the
 * expression is used.
 */
export interface Expression {

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
   * A brief, natural language description of the condition that
   * effectively communicates the intended semantics.
   */
  readonly description?: string;

  /**
   * A short name assigned to the expression to allow for multiple reuse of
   * the expression in the context where it is defined.
   */
  readonly name?: string;

  /**
   * The media type of the language for the expression.
   */
  readonly language?: string;

  /**
   * An expression in the specified language that returns a value.
   */
  readonly expression?: string;

  /**
   * A URI that defines where the expression is found.
   */
  readonly reference?: string;
}
