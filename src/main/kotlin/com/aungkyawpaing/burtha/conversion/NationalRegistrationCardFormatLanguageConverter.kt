package com.aungkyawpaing.burtha.conversion

import com.aungkyawpaing.burtha.internal.BurmeseNumberUtils
import com.aungkyawpaing.burtha.internal.utils.NationalRegistrationCardFormatConstants
import com.aungkyawpaing.burtha.validation.NationalRegistrationCardFormatValidator


object NationalRegistrationCardFormatLanguageConverter {


  /**
   * Convert a valid Burmese format into English format
   * Use [NationalRegistrationCardFormatValidator.burmese] to validate if it's Burmese format first
   *
   * @param burmeseFormat the NRC format in Burmese Language
   * @return NRC format in English
   */
  fun convertToEnglishFormat(burmeseFormat: String): String {
    var englishFormat = burmeseFormat

    NationalRegistrationCardFormatConstants.BURMESE_CARD_TYPE_TO_ENGLISH_CARD_TYPE_MAP.forEach { (key, value) ->
      englishFormat = englishFormat.replace("($key)", "($value)")
    }


    NationalRegistrationCardFormatConstants.BURMESE_TOWN_CODE_TO_ENGLISH_TOWN_CODE_MAP.forEach { (key, value) ->
      englishFormat = englishFormat.replace(key, value)
    }

    englishFormat.forEach { character ->
      if (BurmeseNumberUtils.isBurmeseNumber(character)) {
        englishFormat = englishFormat.replace(character, BurmeseNumberUtils.convertBurmeseToEnglishNumber(character))
      }
    }

    return englishFormat
  }

  /**
   * Convert a valid English format into Burmese format
   * Use [NationalRegistrationCardFormatValidator.english] to validate if it's English format first
   *
   * @param englishFormat the NRC format in English Language
   * @return NRC format in English
   */
  fun convertToBurmeseFormat(englishFormat: String): String {
    var burmeseFormat = englishFormat

    NationalRegistrationCardFormatConstants.ENGLISH_CARD_TYPE_TO_BURMESE_CARD_TYPE_MAP.forEach { (key, value) ->
      burmeseFormat = burmeseFormat.replace("($key)", "($value)")
    }

    NationalRegistrationCardFormatConstants.ENGLISH_TOWN_CODE_TO_BURMESE_TOWN_CODE_MAP.forEach { (key, value) ->
      burmeseFormat = burmeseFormat.replace(key, value)
    }

    burmeseFormat.forEach { character ->
      if (character.isDigit()) {
        burmeseFormat = burmeseFormat.replace(character, BurmeseNumberUtils.convertEnglishToBurmeseNumber(character))
      }
    }

    return burmeseFormat
  }


}