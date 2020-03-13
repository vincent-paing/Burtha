package com.aungkyawpaing.burtha.validation

import org.junit.Assert
import org.junit.Test

class NationalRegistrationCardFormatValidatorTest {

  private val falseRule = object : ValidationRule {
    override fun validate(valueInString: String): Boolean {
      return false
    }
  }

  private val trueRule = object : ValidationRule {
    override fun validate(valueInString: String): Boolean {
      return true
    }
  }

  @Test
  fun testAndMode() {
    val validator = NationalRegistrationCardFormatValidator(
      validationRules = listOf(falseRule, trueRule),
      validateMode = NationalRegistrationCardFormatValidator.ValidateMode.AND
    )

    val expected = false

    val actual = validator.validateFormat("I love you whoever reading this")

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testOrMode() {
    val validator = NationalRegistrationCardFormatValidator(
      validationRules = listOf(falseRule, trueRule),
      validateMode = NationalRegistrationCardFormatValidator.ValidateMode.OR
    )

    val expected = true

    val actual = validator.validateFormat("I love you whoever reading this")

    Assert.assertEquals(expected, actual)
  }
}

