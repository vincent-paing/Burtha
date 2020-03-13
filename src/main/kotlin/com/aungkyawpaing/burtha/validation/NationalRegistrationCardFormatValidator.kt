package com.aungkyawpaing.burtha.validation

import com.aungkyawpaing.burtha.validation.burmese.NationalRegistrationCardBurmeseFormatValidationRule
import com.aungkyawpaing.burtha.validation.english.NationalRegistrationCardEnglishFormatValidationRule


/**
 * Validator used to validate nrc format
 */
class NationalRegistrationCardFormatValidator constructor(
  private val validationRules: List<ValidationRule> = listOf(
    NationalRegistrationCardBurmeseFormatValidationRule(),
    NationalRegistrationCardEnglishFormatValidationRule()
  ),
  private val validateMode: ValidateMode = ValidateMode.OR
) {

  enum class ValidateMode {
    AND, //Only valid if all validation rules pass
    OR //Valid as soon as one of the rule pass
  }


  companion object {

    fun burmese(): NationalRegistrationCardFormatValidator {
      return NationalRegistrationCardFormatValidator(
        listOf(NationalRegistrationCardBurmeseFormatValidationRule())
      )
    }

    fun english(): NationalRegistrationCardFormatValidator {
      return NationalRegistrationCardFormatValidator(
        listOf(NationalRegistrationCardEnglishFormatValidationRule())
      )
    }


  }

  fun validateFormat(formatString: String): Boolean {

    val validationResults = validationRules.map {
      it.validate(formatString)
    }

    return when (validateMode) {
      ValidateMode.AND -> {
        return !validationResults.contains(false)
      }
      ValidateMode.OR -> {
        return validationResults.contains(true)
      }

    }

  }

}

