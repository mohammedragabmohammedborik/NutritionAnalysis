package com.mohammedragab.domainlayer.usecases

import com.mohammedragab.domainlayer.entities.ModelPostIngradient
import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import kotlinx.coroutines.flow.Flow

interface GetAllLineeNutritionData {
    suspend fun  getNutrionDataForAllLine(app_id:String,app_key:String,body: ModelPostIngradient?):Flow<NutritionAnalysisDataDomainLayer>
}