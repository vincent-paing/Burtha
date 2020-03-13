package com.aungkyawpaing.burtha.validation

import com.aungkyawpaing.burtha.validation.english.NationalRegistrationCardEnglishFormatValidationRule
import org.junit.Assert
import org.junit.Test

class NationalRegistrationCardEnglishFormatValidationRuleTest {

  private val rule =
    NationalRegistrationCardEnglishFormatValidationRule()

  @Test
  fun testValidFormat() {
    val input = "12/MaYaKa(N)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidStateIndex() {
    val input = "16/MaYaKa(N)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidMissingStateIndex() {
    val input = "MaYaKa(N)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidTownCodeOne() {
    val input = "12/MeYaKa(N)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidTownCodeTwo() {
    val input = "12/MaKa(N)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testMissingTownCode() {
    val input = "12/(N)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidNumber() {
    val input = "12/MaYaKa(N)123"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidNumberTwo() {
    val input = "12/MaYaKa(N)12345678"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }


}