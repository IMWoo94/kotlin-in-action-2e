package com.example.kotlinInAction.classHierarchyDefinition.sealedClass

sealed class SealedExpr // sealed -> abstract class
class SealedNum(val value: Int) : SealedExpr()
class SealedSum(val left: SealedExpr, val right: SealedExpr) : SealedExpr()
class SealedMul(val left: SealedExpr, val right: SealedExpr) :
    SealedExpr() // Create a new class that inherits the SealedExpr class

fun sealedEval(e: SealedExpr): Int =
    when (e) {
        is SealedNum -> e.value
        is SealedSum -> sealedEval(e.left) + sealedEval(e.right)
        is SealedExprAllowedClass -> -1
        is SealedMul -> sealedEval(e.left) * sealedEval(e.right)
        // 신규 추가된 SealedMul 에 의해서 컴파일 과정에서 정의하라고 알려준다.
        // 'when' expression must be exhaustive, add necessary 'is SealedMul' branch or 'else' branch instead
    }