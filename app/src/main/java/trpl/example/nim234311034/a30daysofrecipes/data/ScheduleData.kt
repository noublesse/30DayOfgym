package trpl.example.nim234311034.a30daysofrecipes.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class ScheduleData(
    @StringRes val dateRes: Int,
    @StringRes val titleRes: Int,
    @StringRes val descriptionRes: Int,
    @DrawableRes val imageRes:Int )

