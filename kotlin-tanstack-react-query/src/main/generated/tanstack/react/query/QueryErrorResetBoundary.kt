// Automatically generated - do not modify!

@file:JsModule("@tanstack/react-query")
@file:JsNonModule

package tanstack.react.query

external interface QueryErrorResetBoundaryValue {
    var clearReset: () -> Unit
    var isReset: () -> Boolean
    var reset: () -> Unit
}

external val useQueryErrorResetBoundary: () -> QueryErrorResetBoundaryValue

external interface QueryErrorResetBoundaryProps : react.Props {
    var children: (value: QueryErrorResetBoundaryValue) -> react.ReactNode
}

external val QueryErrorResetBoundary: react.FC<QueryErrorResetBoundaryProps>
