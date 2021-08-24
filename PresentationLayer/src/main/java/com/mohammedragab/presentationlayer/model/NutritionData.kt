package com.mohammedragab.presentationlayer.model

import com.mohammedragab.domainlayer.entities.TotalDaily
import com.mohammedragab.domainlayer.entities.TotalNutrients
import com.mohammedragab.domainlayer.entities.TotalNutrientsKCal

data class NutritionData(
    val calories: Int,
    val cautions: List<Any>,
    val dietLabels: List<String>,
    val healthLabels: List<String>,
    val totalDaily: TotalDaily,
    val totalNutrients: TotalNutrients,
    val totalNutrientsKCal: TotalNutrientsKCal,
    val totalWeight: Double,
    val uri: String,
    val yield: Double
     ) {
}