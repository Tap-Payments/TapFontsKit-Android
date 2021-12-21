package com.tap.tapfontskit.enums


/**
 * Created by AhlaamK on 6/17/20.

Copyright (c) 2020    Tap Payments.
All rights reserved.
 **/
enum class TapFont {
    latoThin,
    latoLight,
    latoMedium,
    latoRegular,
    latoBold,

    robotoThin,
    robotoLight,
    robotoMedium,
    robotoRegular,
    robotoBold,

    tajawalThin,
    tajawalLight,
    tajawalMedium,
    tajawalRegular,
    tajawalBold,


    circeExtraLight,
    circeLight,
    circeRegular,
    circeBold,



    systemDefault;



    companion object {
        fun tapFontType(tapFont: TapFont):String {
            return when(tapFont){
                robotoRegular -> "fonts/Roboto-Regular.ttf"
                robotoThin ->"fonts/Roboto-Thin.ttf"
                robotoLight->"fonts/Roboto-Light.ttf"
                robotoMedium->"fonts/Roboto-Medium.ttf"
                robotoBold->"fonts/Roboto-Bold.ttf"

                tajawalRegular -> "fonts/Tajawal-Bold.ttf"
                tajawalThin ->"fonts/Tajawal-Thin.ttf"
                tajawalLight->"fonts/Tajawal-Light.ttf"
                tajawalMedium->"fonts/Tajawal-Medium.ttf"
                tajawalBold->"fonts/Tajawal-Bold.ttf"

                circeExtraLight->"fonts/Circe-ExtraLight.ttf"
                circeLight->"fonts/Circe-Light.ttf"
                circeRegular->"fonts/Circe-Regular.ttf"
                circeBold->"fonts/Circe-Bold.ttf"

                latoBold->"fonts/Lato-Bold.ttf"
                latoLight->"fonts/Lato-Light.ttf"
                latoRegular->"fonts/Lato-Regular.ttf"
               else->"fonts/Roboto-Regular.ttf"
            }
        }
    }


}





