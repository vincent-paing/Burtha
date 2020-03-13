package com.aungkyawpaing.burtha.conversion

import org.junit.Assert
import org.junit.Test

class NationalRegistrationCardFormatLanguageConverterTest {

  @Test
  fun testBurmeseToEnglishOne() {
    val input = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"

    val expected = "12/MaRaKa(N)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglishTwo() {
    val input = "၁/ကခန(နိုင်)၉၈၇၆၅၄"

    val expected = "1/KaKhNa(N)987654"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmeseOne() {
    val input = "12/MaRaKa(N)123456"

    val expected = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmeseTwo() {
    val input = "1/KaKhNa(N)987654"

    val expected = "၁/ကခန(နိုင်)၉၈၇၆၅၄"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }
}

