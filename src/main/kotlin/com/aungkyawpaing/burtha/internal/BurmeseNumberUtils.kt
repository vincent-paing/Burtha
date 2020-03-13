package com.aungkyawpaing.burtha.internal


internal object BurmeseNumberUtils {

  /**
   * Transform English number to Burmese number (e.g "30" -> "၃၀");
   * This does not validate before converting, use [isBurmeseNumber] to check if it's valid Burmese number
   *
   * @param burmeseNumberCharacter A Burmese number character, ၀ - ၉.
   * @return English version of number string
   */
  internal fun convertBurmeseToEnglishNumber(burmeseNumberCharacter: Char): Char {
    return (burmeseNumberCharacter.toInt() - 4112).toChar()
  }

  /**
   * Transform Burmese number to English number (e.g "30" -> "၃၀");
   * This does not validate before converting, use [Char.isDigit] to check if it's valid English number
   *
   * @param burmeseNumberCharacter A English number character, 0 - 9.
   * @return Burmese version of number string
   */
  internal fun convertEnglishToBurmeseNumber(burmeseNumberCharacter: Char): Char {
    return (burmeseNumberCharacter.toInt() + 4112).toChar()
  }


  /**
   * Check whether a [character] is a Burmese number, ၀ - ၉
   * @param character any [Char]
   * @return true if burmese number, false if it's not burmese not
   */
  internal fun isBurmeseNumber(character: Char): Boolean {
    return character in '၀'..'၉';
  }
}


