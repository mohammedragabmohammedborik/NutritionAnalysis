package com.mohammedragab.domainlayer.usecases

import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import kotlinx.coroutines.flow.Flow

interface GetSingleNutritionData {
    suspend fun  getNutrionDataForSingleLine(app_id:String,app_key:String,nutrition_type:String,ingr:String): Flow<NutritionAnalysisDataDomainLayer>
}