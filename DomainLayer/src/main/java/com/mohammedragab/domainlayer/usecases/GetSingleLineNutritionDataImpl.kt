package com.mohammedragab.domainlayer.usecases

import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import com.mohammedragab.domainlayer.repositry.NutritionInterfaceRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetSingleLineNutritionDataImpl @Inject constructor(val nutritionInterfaceRepository: NutritionInterfaceRepository

):GetSingleNutritionData{
    override suspend fun getNutrionDataForSingleLine(
        app_id: String,
        app_key: String,
        nutrition_type: String,
        ingr: String
    ): Flow<NutritionAnalysisDataDomainLayer> {
        TODO("Not yet implemented")
    }

}