package com.aungkyawpaing.burtha.validation


interface ValidationRule {

  fun validate(valueInString: String): Boolean


}