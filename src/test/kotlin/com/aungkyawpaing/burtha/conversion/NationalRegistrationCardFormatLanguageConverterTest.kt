package com.aungkyawpaing.burtha.conversion

import org.junit.Assert
import org.junit.Test

class NationalRegistrationCardFormatLanguageConverterTest {

  @Test
  fun testBurmeseToEnglishOne() {
    val input = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"

    val expected = "12/MaRaKa(C)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglishTwo() {
    val input = "၁/ကခန(နိုင်)၉၈၇၆၅၄"

    val expected = "1/KaKhNa(C)987654"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_CitizenCardType() {
    val input = "၁၂/မစက(နိုင်)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(C)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_AssociateCitizenCardType() {
    val input = "၁၂/မစက(ဧည့်)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(AC)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_NaturalizedCitizenCardType() {
    val input = "၁၂/မစက(ပြု)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(NC)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_NationalVerificationCardType() {
    val input = "၁၂/မစက(စ)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(V)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_MonkCardType() {
    val input = "၁၂/မစက(သ)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(M)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testBurmeseToEnglish_NunCardType() {
    val input = "၁၂/မစက(သီ)၁၂၃၄၅၆"

    val expected = "12/MaCaKa(N)123456"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToEnglishFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmeseOne() {
    val input = "12/MaRaKa(C)123456"

    val expected = "၁၂/မရက(နိုင်)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmeseTwo() {
    val input = "1/KaKhNa(C)987654"

    val expected = "၁/ကခန(နိုင်)၉၈၇၆၅၄"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmese_CitizenCardType() {
    val input = "12/MaCaKa(C)123456"

    val expected = "၁၂/မစက(နိုင်)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }


  @Test
  fun testEnglishToBurmese_AssociateCitizenCardType() {
    val input = "12/MaCaKa(AC)123456"

    val expected = "၁၂/မစက(ဧည့်)၁၂၃၄၅၆"


    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmese_NaturalizedCitizenCardType() {
    val input = "12/MaCaKa(NC)123456"

    val expected = "၁၂/မစက(ပြု)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmese_NationalVerificationCardType() {
    val input = "12/MaCaKa(V)123456"

    val expected = "၁၂/မစက(စ)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmese_MonkCardType() {
    val input = "12/MaCaKa(M)123456"

    val expected = "၁၂/မစက(သ)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }

  @Test
  fun testEnglishToBurmese_NunCardType() {
    val input = "12/MaCaKa(N)123456"

    val expected = "၁၂/မစက(သီ)၁၂၃၄၅၆"

    val actual = NationalRegistrationCardFormatLanguageConverter.convertToBurmeseFormat(input)

    Assert.assertEquals(expected, actual)
  }
}

