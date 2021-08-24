package com.mohammedragab.domainlayer.usecases

import com.mohammedragab.domainlayer.entities.ModelPostIngradient
import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import com.mohammedragab.domainlayer.repositry.NutritionInterfaceRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetAllLineNutritionDataImpl @Inject constructor(val nutritionInterfaceRepository: NutritionInterfaceRepository

):GetAllLineeNutritionData{
    override suspend fun getNutrionDataForAllLine(
        app_id: String,
        app_key: String,
        body: ModelPostIngradient?
    ): Flow<NutritionAnalysisDataDomainLayer> {
        return  nutritionInterfaceRepository.getNutrionDataForAllLine(app_id,app_key,body)
    }


}