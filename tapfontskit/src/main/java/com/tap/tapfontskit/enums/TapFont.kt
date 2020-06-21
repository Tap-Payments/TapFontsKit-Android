package com.tap.tapfontskit.enums


/**
 * Created by AhlaamK on 6/17/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
enum class TapFont {
    helveticaNeueThin,
    helveticaNeueLight,
    helveticaNeueMedium,
    helveticaNeueRegular,
    helveticaNeueBold,

    robotoThin,
    robotoLight,
    robotoMedium,
    robotoRegular,
    robotoBold,

    circeExtraLight,
    circeLight,
    circeRegular,
    circeBold,

    arabicHelveticaNeueLight,
    arabicHelveticaNeueRegular,
    arabicHelveticaNeueBold,

    systemDefault;

    companion object {
        fun tapFontType(tapFont: TapFont):String {
            return when(tapFont){
                robotoRegular -> "fonts/Roboto-Regular.ttf"
                robotoThin ->"fonts/Roboto-Thin.ttf"
                robotoLight->"fonts/Roboto-Light.ttf"
                robotoMedium->"fonts/Roboto-Medium.ttf"
                robotoBold->"fonts/Roboto-Bold.ttf"
                circeExtraLight->"fonts/Circe-ExtraLight.ttf"
                circeLight->"fonts/Circe-Light.ttf"
                circeRegular->"fonts/Circe-Regular.ttf"
                circeBold->"fonts/Circe-Bold.ttf"
                helveticaNeueBold->"fonts/HelveticaNeueLTW20-Bold.ttf"
                helveticaNeueLight->"fonts/HelveticaNeueLTW20-Light.ttf"
                helveticaNeueRegular->"fonts/HelveticaNeueLTW20-Roman.ttf"
               else->"fonts/Roboto-Regular.ttf"
            }
        }
    }


}




