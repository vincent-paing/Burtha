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
    val input = "16/MaYaKa(C)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidMissingStateIndex() {
    val input = "MaYaKa(C)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidTownCodeOne() {
    val input = "12/MeYaKa(C)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidTownCodeTwo() {
    val input = "12/MaKa(C)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testMissingTownCode() {
    val input = "12/(C)123456"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidNumber() {
    val input = "12/MaYaKa(C)123"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testInvalidNumberTwo() {
    val input = "12/MaYaKa(C)12345678"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testValidAssociateCitizen() {
    //ဧည့်နိုင်ငံသား
    val input = "12/MaYaKa(AC)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testValidNaturalizedCitizen() {
    //နိုင်ငံသားပြုခွင့်ရသူ
    val input = "12/MaYaKa(NC)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testValidNationalVerification() {
    //နိုင်ငံသားစိစစ်ခံမည့်သူ
    val input =  "12/MaYaKa(V)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testValidMonk() {
    //သာသနာဝင်
    val input = "12/MaYaKa(M)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testValidNun() {
    //သာသနွယ်ဝွင်
    val input = "12/MaYaKa(N)123456"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }




}