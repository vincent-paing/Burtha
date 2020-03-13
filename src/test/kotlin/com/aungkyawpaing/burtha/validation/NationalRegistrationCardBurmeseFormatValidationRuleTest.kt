package com.aungkyawpaing.burtha.validation

import com.aungkyawpaing.burtha.validation.burmese.NationalRegistrationCardBurmeseFormatValidationRule
import org.junit.Assert
import org.junit.Test

class NationalRegistrationCardBurmeseFormatValidationRuleTest {

  private val rule = NationalRegistrationCardBurmeseFormatValidationRule()

  @Test
  fun testValidFormat() {
    val input = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"

    val expected = true

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }


  @Test
  fun testIncompleteFormat() {
    val input = "၁၂"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testWrongStateIndex() {
    val input = "၁၆/မရက(နိုင်)၁၂၃၄၅၆"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testWrongTownCode() {
    val input = "၁၆/ကခကခကခ(နိုင်)၁၂၃၄၅၆"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testWrongNoNaing() {
    val input = "၁၂/မရက၁၂၃၄၅၆"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)

  }

  @Test
  fun testWrongNumberOne() {
    val input = "၁၆/ကခကခကခ(နိုင်)၁၂၃၄၅"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testWrongNumberTwo() {
    val input = "၁၆/ကခကခကခ(နိုင်)၁၂၃၄၅၆၇၈"

    val expected = false

    val actual = rule.validate(input)

    Assert.assertEquals(expected, actual)
  }



}