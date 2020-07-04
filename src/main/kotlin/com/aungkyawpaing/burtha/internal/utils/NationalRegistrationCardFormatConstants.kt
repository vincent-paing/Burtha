package com.aungkyawpaing.burtha.internal.utils

internal object NationalRegistrationCardFormatConstants {

  /**
   * References: https://github.com/greenlikeorange/NRCPrefix/blob/master/index.js#L36
   */
  val BURMESE_TOWN_CODE_TO_ENGLISH_TOWN_CODE_MAP = mapOf<String, String>(
    "က" to "Ka",
    "ခ" to "Kh",
    "ဂ" to "Ga",
    "ဃ" to "Gh",
    "င" to "Ng",
    "စ" to "Ca",
    "ဆ" to "Ch",
    "ဇ" to "Ja",
    "ဈ" to "Jh",
    "ည" to "Ny",
    "ဎ" to "Dd",
    "ဏ" to "Nn",
    "တ" to "Ta",
    "ထ" to "Th",
    "ဒ" to "Da",
    "ဓ" to "Dh",
    "န" to "Na",
    "ပ" to "Pa",
    "ဖ" to "Ph",
    "ဗ" to "Ba",
    "ဘ" to "Bh",
    "မ" to "Ma",
    "ယ" to "Ya",
    "ရ" to "Ra",
    "လ" to "La",
    "ဝ" to "Wa",
    "သ" to "Sa",
    "ဟ" to "Ha",
    "ဠ" to "Ll",
    "ဥ" to "U",
    "ဧ" to "E",
    "အ" to "Ah"
  )

  val ENGLISH_TOWN_CODE_TO_BURMESE_TOWN_CODE_MAP = mapOf<String, String>(
    "Ka" to "က",
    "Kh" to "ခ",
    "Ga" to "ဂ",
    "Gh" to "ဃ",
    "Ng" to "င",
    "Ca" to "စ",
    "Ch" to "ဆ",
    "Ja" to "ဇ",
    "Jh" to "ဈ",
    "Ny" to "ည",
    "Dd" to "ဎ",
    "Nn" to "ဏ",
    "Ta" to "တ",
    "Th" to "ထ",
    "Da" to "ဒ",
    "Dh" to "ဓ",
    "Na" to "န",
    "Pa" to "ပ",
    "Ph" to "ဖ",
    "Ba" to "ဗ",
    "Bh" to "ဘ",
    "Ma" to "မ",
    "Ya" to "ယ",
    "Ra" to "ရ",
    "La" to "လ",
    "Wa" to "ဝ",
    "Sa" to "သ",
    "Ha" to "ဟ",
    "Ll" to "ဠ",
    "U" to "ဥ",
    "E" to "ဧ",
    "Ah" to "အ"
  )

  //Reference : https://www.facebook.com/ZawThureinTun/posts/2516338305050217?hc_location=ufi
  val BURMESE_CARD_TYPE_TO_ENGLISH_CARD_TYPE_MAP = mapOf<String, String>(
    "နိုင်" to "C",
    "ဧည့်" to "AC",
    "ပြု" to "NC",
    "စ" to "V",
    "သ" to "M",
    "သီ" to "N"
  )

  val ENGLISH_CARD_TYPE_TO_BURMESE_CARD_TYPE_MAP = mapOf<String, String>(
    "C" to "နိုင်",
    "AC" to "ဧည့်",
    "NC" to "ပြု",
    "V" to "စ",
    "M" to "သ",
    "N" to "သီ"
  )
}

