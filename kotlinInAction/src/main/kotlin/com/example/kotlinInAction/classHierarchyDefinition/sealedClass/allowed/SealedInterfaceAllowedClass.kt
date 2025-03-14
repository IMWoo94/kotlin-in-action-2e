package com.example.kotlinInAction.classHierarchyDefinition.sealedClass

// kotlin 1.5 이후 같은 파일내에 정의되어 있지 않아도 구현이 되도록 변경이 됨
// https://kotlinlang.org/docs/whatsnew15.html#package-wide-sealed-class-hierarchies
class SealedToggleAllowed : SealedToggleable {
    override fun toggle() {
        println("SealedToggleAllowed toggle")
    }
}
