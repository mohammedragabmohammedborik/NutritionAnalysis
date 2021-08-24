package com.mohammedragab.domainlayer.usecases

import com.mohammedragab.domainlayer.UtileTest
import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import com.mohammedragab.domainlayer.repositry.NutritionInterfaceRepository

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.ConflatedBroadcastChannel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.runBlocking
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.runner.RunWith
import org.junit.runners.JUnit4
import org.mockito.Mock
import org.mockito.Mockito.times
import org.mockito.Mockito.verify
import org.mockito.MockitoAnnotations
import org.mockito.junit.MockitoJUnitRunner

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@FlowPreview
@ExperimentalCoroutinesApi
@RunWith(JUnit4::class)
class SingleLineNutritionTest {
    private  lateinit var getSingleLineNutritionDataImpl:GetSingleLineNutritionDataImpl

    @Mock
    private lateinit var nutritionInterfaceRepository:NutritionInterfaceRepository

    @Before
    fun setup() {
        MockitoAnnotations.initMocks(this)
        getSingleLineNutritionDataImpl = GetSingleLineNutritionDataImpl(nutritionInterfaceRepository)
    }
    @Test
    fun getSingleNutrition() {
        val nutritionDat=UtileTest.generateNutritionData()
//        runBlocking {
//            val channelCompanyInfo = ConflatedBroadcastChannel<NutritionAnalysisDataDomainLayer>()
//            channelCompanyInfo.offer(nutritionDat)
//
//
//            // When
//            val actualValue = UtileTest.generateNutritionData()
//
//            // Then
//            verify(nutritionInterfaceRepository, times(1)).getNutrionDataForSingleLine("dokdofk","cmskdks","cooking","1 cub")
//            assertEquals(nutritionDat, actualValue)
//        }


    }
}


