package com.aungkyawpaing.burtha.validation.english

import com.aungkyawpaing.burtha.validation.ValidationRule

internal class NationalRegistrationCardEnglishFormatValidationRule : ValidationRule {

  companion object {

    //References : https://github.com/yeyintkoko/myanmar-nrc-x/blob/master/index.js
    //But we use small letters for second character so we can process data easily
    //If needed, maybe we can change to all caps in future
    private const val POSSIBLE_ENGLISH_CHARACTER =
      "Ka|Kh|Ga|Gh|Ng|Ca|Ch|Ja|Jh|Ny|Dd|Nn|Ta|Th|Da|Dh|Na|Pa|Ph|Ba|Bh|Ma|Ya|Ra|La|Wa|Sa|Ha|Ll|u|E"

  }

  private val regexExpression =
    Regex("^^([1-2]?[1-4])/(?:${POSSIBLE_ENGLISH_CHARACTER}){1}(?:${POSSIBLE_ENGLISH_CHARACTER}){1}(?:${POSSIBLE_ENGLISH_CHARACTER}){1}\\((?:N)\\)([\\d]{6})\$")

  override fun validate(valueInString: String): Boolean {
    val matchResult = regexExpression.matchEntire(valueInString)
    return matchResult != null
  }


}

