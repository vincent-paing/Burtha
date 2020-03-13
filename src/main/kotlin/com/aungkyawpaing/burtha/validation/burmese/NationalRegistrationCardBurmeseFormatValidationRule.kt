package com.aungkyawpaing.burtha.validation.burmese

import com.aungkyawpaing.burtha.validation.ValidationRule

intenral class NationalRegistrationCardBurmeseFormatValidationRule : ValidationRule {

  companion object {

    private const val MYANMAR_NUMBER_CHARACTERS = "\u1040-\u1049" //၀ - ၉
    private const val MYANMAR_CHARACTERS =
      "\u1000\u1001\u1002\u1003\u1004\u1005\u1006\u1007\u1008\u100A\u100E\u100F\u1010\u1011\u1012\u1013\u1014\u1015\u1016\u1017\u1018\u1019\u101A\u101B\u101C\u101D\u101E\u101F\u1020\u1025\u1027" //က - အ
    private const val MYANMAR_NAING_WORD = "\u1014\u102D\u102F\u1004\u103A" //Represents နိုင်
  }

  private val regexExpression =
    Regex("^([၁-၂]?[၁-၄])/([ကခဂဃငစဆဇဈညဎဏတထဒဓနပဖဗဘမယရလဝသဟဠဥဧ]{3})\\((?:နိုင်)\\)([၀-၉]{6})")

  override fun validate(valueInString: String): Boolean {
    val matchResult = regexExpression.matchEntire(valueInString)
    return matchResult != null
  }


}

