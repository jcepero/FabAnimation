package com.example.fabanimation.input

object Constants {
    const val HEADER_APPLICATION_JSON = "application/mx.com.invex.api.v1+json"
    const val HEADER_CONTENT_TYPE_APPLICATION_JSON = "Content-Type: $HEADER_APPLICATION_JSON"
    const val URL_OAUTH_GET_TOKEN = "oauth/token"
    const val AUTHORIZATION = "Authorization"
    const val CONTENT_TYPE = "Content-Type"
    const val ACCEPT = "Accept"
    const val BEARER = "Bearer"

    const val MINIMUM_AGE = 18

    const val FONT_PRIMARY_NORMAL = "sans-serif"
    const val FONT_PRIMARY_MEDIUM = "sans-serif-medium"

    const val FORMAT_CURRENCY_PATTERN = "###,###,##0.00"
    const val FORMAT_DOUBLE_ZERO_PATTERN = "00"
    const val FORMAT_CARD_PATTERN = ".{4}(?!$)"
    const val FORMAT_CLABE_PATTERN = ".{3}(?!$)"
    const val FORMAT_REPLACE_ANY_PATTERN = "[^.]"

    const val FORMAT_DATE_PATTERN = "dd/MM/yyyy"
    const val FORMAT_SHORT_DATE_PATTERN = "MM/yy"
    const val FORMAT_DATE_NUMBER_PATTERN = "ddMMyy"
    const val FORMAT_MONTH_PATTERN = "MMMM"
    const val FORMAT_DATE_RAW_PATTERN = "ddMMyyyy"

    const val EMPTY_STRING = ""

    const val TIMEOUT = 1L

    const val MAX_CARD_NUMBERS_TO_SHOW = 4

    const val TOTAL_CARD_NUMBERS = 16

    const val TOTAL_CLABE_NUMBERS = 18

    const val SHARED_PREFERENCES_NAME = "prefs_now"

    const val MIN_VERSION_BIOMETRIC_SUPPORT = 23

    const val CHARSET_UTF_8 = "UTF-8"

    const val HYPHEN = "-"

    const val SLASH = "/"

    const val SPACE = " "

    const val AT = "@"
    const val ASTERISK = "*"
    const val DOLLAR = "$"

    const val NUMBER_OF_ELEMENTS_IN_DATE = 3

    const val PLUS_SIGN = "+"
    const val PHONE_DIGITS = 10
    const val FIRST_PHONE_DIGIT = 0
    const val THIRD_PHONE_DIGIT = 2
    const val EIGHTH_PHONE_DIGIT = 7
    const val TENTH_PHONE_DIGIT = 9
    const val X_PHONE_DIGIT = "xxxx xx"

    const val ONE_SECOND_IN_MILLIS = 1000
    const val ONE_MINUTE_IN_SECONDS = 60

    const val MILLIS_TO_EXPIRE_OTP = 120000
    const val MILLIS_TO_AVOID_ERROR_CHAIN = 20000L

    const val MINIMUM_DATE_DIGITS = 2
    const val ZIP_CODE_LENGTH = 5

    const val COLON = ":"

    const val SCALE_UP_FACTOR = 0.25f

    const val TEXT_PLAIN = "text/plain"

    const val VALUE_WITH_SPACE = "$0 "

    const val CACHED_PAGE_LIMIT = 3

    const val BUNDLE_EMAIL_RECOVERY_SENDED = "bundle_email_recovery_sended"
    const val BUNDLE_OTP_VALIDATION = "bundle_otp_validation"

    const val PAY_CARD_DROP_DOWN_FORMAT = "%s **** %s"
    const val SPAN_DOLLAR_SYMBOL_SIZE = 60

    const val TRANSACTION_DEFAULT_RANGE = -3
    const val LOCALE_SPANISH = "es"

    const val COMMA = ","

    const val ZERO_MONEY = 0.00

    const val CLABE_LENGTH = 18
    const val CARD_NUMBER_LENGTH = 16
    const val BENEFICIARY_ACCOUNT_LENGTH = 11

    const val INTEGER_DIVISOR = 100
    const val ZERO = 0
    const val HINT_DEFAULT_SIZE = 14f
    const val BITMAP_QUALITY = 100
    const val IMAGE_JPG = "image/jpg"
    const val MAX_SIZE_FOR_TAB_DIRECTION = 2

    const val TRACK_NUMBER_URL = "https://www.banxico.org.mx/cep/"
}

fun emptyString() = Constants.EMPTY_STRING
