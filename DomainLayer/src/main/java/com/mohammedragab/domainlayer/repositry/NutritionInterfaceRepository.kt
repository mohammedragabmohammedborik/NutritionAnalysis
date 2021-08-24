package com.mohammedragab.domainlayer.repositry

import com.mohammedragab.domainlayer.entities.ModelPostIngradient
import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import kotlinx.coroutines.flow.Flow

interface NutritionInterfaceRepository {
    suspend fun  getNutrionDataForSingleLine(app_id:String,app_key:String,nutrition_type:String,ingr:String): Flow<NutritionAnalysisDataDomainLayer>
    suspend fun  getNutrionDataForAllLine(app_id:String,app_key:String,body: ModelPostIngradient?):Flow<NutritionAnalysisDataDomainLayer>

}