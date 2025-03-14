package com.example.kotlinInAction.classHierarchyDefinition.sealedClass

class SealedExprAllowedClass : SealedExpr()

fun main() {
    println(sealedEval(SealedSum(SealedSum(SealedNum(1), SealedNum(2)), SealedNum(4))))
}