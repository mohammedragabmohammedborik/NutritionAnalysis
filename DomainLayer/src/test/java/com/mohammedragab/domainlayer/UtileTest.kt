package com.mohammedragab.domainlayer

import com.mohammedragab.domainlayer.entities.*


class UtileTest {

    companion object {
        fun generateNutritionData(): NutritionAnalysisDataDomainLayer {
            val totalNutrients=TotalNutrients(
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal")
                ,MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal")
            )
            val totalNutrientsKCal=TotalNutrientsKCal(MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                )
            return NutritionAnalysisDataDomainLayer(2,
                mutableListOf("test"),
                mutableListOf("Fav"),
                mutableListOf("Diet"),
                TotalDaily(MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal")
                   ,MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal"),
                MainFeatureData("label",1.1,"cal"),
                    MainFeatureData("label",1.1,"cal")),totalNutrients
                ,totalNutrientsKCal,11.1
                ,"uri",1.2

            )
        }

    }
}