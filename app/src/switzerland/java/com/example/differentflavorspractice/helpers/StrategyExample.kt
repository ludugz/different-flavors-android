package com.example.differentflavorspractice.helpers


fun interface Validator {
    fun validate(value: String): Boolean
}

//class PasswordValidator : Validator {
//    override fun validate(value: String): Boolean {
//        return value.length >= 8
//    }
//}
//
//class EmailValidator : Validator {
//    override fun validate(value: String): Boolean {
//        return value.contains("@")
//    }
//}
//

val passwordValidator =  Validator { value -> value.length >= 8 }

class FormField(private val value: String, private val validator: Validator) {

    fun isValid(): Boolean {
        return validator.validate(value = value)
    }
}