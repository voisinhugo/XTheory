/**
 * generated by Xtext 2.14.0
 */
package ac.soton.theory.xtext.theory;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ac.soton.theory.xtext.theory.Rule#getComments <em>Comments</em>}</li>
 *   <li>{@link ac.soton.theory.xtext.theory.Rule#getName <em>Name</em>}</li>
 *   <li>{@link ac.soton.theory.xtext.theory.Rule#getRule <em>Rule</em>}</li>
 * </ul>
 *
 * @see ac.soton.theory.xtext.theory.TheoryPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Comments</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comments</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comments</em>' attribute.
   * @see #setComments(String)
   * @see ac.soton.theory.xtext.theory.TheoryPackage#getRule_Comments()
   * @model
   * @generated
   */
  String getComments();

  /**
   * Sets the value of the '{@link ac.soton.theory.xtext.theory.Rule#getComments <em>Comments</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comments</em>' attribute.
   * @see #getComments()
   * @generated
   */
  void setComments(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see ac.soton.theory.xtext.theory.TheoryPackage#getRule_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link ac.soton.theory.xtext.theory.Rule#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rule</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rule</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rule</em>' containment reference.
   * @see #setRule(EObject)
   * @see ac.soton.theory.xtext.theory.TheoryPackage#getRule_Rule()
   * @model containment="true"
   * @generated
   */
  EObject getRule();

  /**
   * Sets the value of the '{@link ac.soton.theory.xtext.theory.Rule#getRule <em>Rule</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rule</em>' containment reference.
   * @see #getRule()
   * @generated
   */
  void setRule(EObject value);

} // Rule
