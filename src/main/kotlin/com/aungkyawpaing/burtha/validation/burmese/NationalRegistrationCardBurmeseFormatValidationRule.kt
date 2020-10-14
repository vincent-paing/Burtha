package com.aungkyawpaing.burtha.validation.burmese

import com.aungkyawpaing.burtha.validation.ValidationRule

internal class NationalRegistrationCardBurmeseFormatValidationRule : ValidationRule {

  private val regexExpression =
    Regex("^([၁-၂][၀-၄]|[၁-၉])/([ကခဂဃငစဆဇဈညဎဏတထဒဓနပဖဗဘမယရလဝသဟဠဥဧအ]{3})\\((?:နိုင်|ဧည့်|ပြု|စ|သ|သီ)\\)([၀-၉]{6})")

  override fun validate(valueInString: String): Boolean {
    val matchResult = regexExpression.matchEntire(valueInString)
    return matchResult != null
  }

}

