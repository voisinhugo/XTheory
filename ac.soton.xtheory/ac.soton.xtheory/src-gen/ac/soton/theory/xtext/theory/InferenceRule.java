/**
 * generated by Xtext 2.14.0
 */
package ac.soton.theory.xtext.theory;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inference Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.theory.xtext.theory.InferenceRule#getGiven <em>Given</em>}</li>
 *   <li>{@link ac.soton.theory.xtext.theory.InferenceRule#getInfer <em>Infer</em>}</li>
 * </ul>
 *
 * @see ac.soton.theory.xtext.theory.TheoryPackage#getInferenceRule()
 * @model
 * @generated
 */
public interface InferenceRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Given</b></em>' containment reference list.
   * The list contents are of type {@link ac.soton.theory.xtext.theory.Given}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Given</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Given</em>' containment reference list.
   * @see ac.soton.theory.xtext.theory.TheoryPackage#getInferenceRule_Given()
   * @model containment="true"
   * @generated
   */
  EList<Given> getGiven();

  /**
   * Returns the value of the '<em><b>Infer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Infer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Infer</em>' containment reference.
   * @see #setInfer(Infer)
   * @see ac.soton.theory.xtext.theory.TheoryPackage#getInferenceRule_Infer()
   * @model containment="true"
   * @generated
   */
  Infer getInfer();

  /**
   * Sets the value of the '{@link ac.soton.theory.xtext.theory.InferenceRule#getInfer <em>Infer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Infer</em>' containment reference.
   * @see #getInfer()
   * @generated
   */
  void setInfer(Infer value);

} // InferenceRule
