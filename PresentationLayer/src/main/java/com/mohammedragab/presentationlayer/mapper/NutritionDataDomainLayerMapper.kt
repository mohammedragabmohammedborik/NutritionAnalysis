package com.mohammedragab.presentationlayer.mapper

import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import com.mohammedragab.presentationlayer.model.NutritionData

class NutritionDataDomainLayerMapper:Mapper<NutritionAnalysisDataDomainLayer, NutritionData> {
    override fun from(e: NutritionData): NutritionAnalysisDataDomainLayer {
        return NutritionAnalysisDataDomainLayer(e.calories
            ,e.cautions,
            e.dietLabels,
            e.healthLabels,
            e.totalDaily,
            e.totalNutrients,
            e.totalNutrientsKCal,
            e.totalWeight,
            e.uri,
            e.yield
        )

    }

    override fun to(t: NutritionAnalysisDataDomainLayer): NutritionData {
        return NutritionData(t.calories
            ,t.cautions,
            t.dietLabels,
            t.healthLabels,
            t.totalDaily,
            t.totalNutrients,
            t.totalNutrientsKCal,
            t.totalWeight,
            t.uri,
            t.yield
        )
    }
}