// Automatically generated - do not modify!

package typescript

sealed external interface ShorthandPropertyAssignment : ObjectLiteralElement, JSDocContainer,
    Union.ShorthandPropertyAssignment_ {
    override val kind: SyntaxKind.ShorthandPropertyAssignment
    override val parent: ObjectLiteralExpression
    override val name: Identifier
    val questionToken: QuestionToken?
    val exclamationToken: ExclamationToken?
    val equalsToken: EqualsToken?
    val objectAssignmentInitializer: Expression?
}
