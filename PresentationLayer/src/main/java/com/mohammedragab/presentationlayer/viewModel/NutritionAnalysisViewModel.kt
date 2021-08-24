package com.mohammedragab.presentationlayer.viewModel
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mohammedragab.domainlayer.entities.NutritionAnalysisDataDomainLayer
import com.mohammedragab.domainlayer.repositry.NutritionInterfaceRepository
import com.mohammedragab.domainlayer.usecases.GetSingleNutritionData
import com.mohammedragab.presentationlayer.mapper.Mapper
import com.mohammedragab.presentationlayer.model.NutritionData
import kotlinx.coroutines.*
import kotlinx.coroutines.flow.collect
import java.lang.Exception
import javax.inject.Inject
@ExperimentalCoroutinesApi
class NutritionAnalysisViewModel @Inject constructor(private val singleLineNutrition:GetSingleNutritionData,
                                                     private val  allLinesNutrition:GetSingleNutritionData,
                                                     private  val mapper:Mapper<NutritionAnalysisDataDomainLayer, NutritionData>
) :ViewModel() {
    //  check for response loading
    private val _loading = SingleLiveEvent<Boolean>()
    val loading: SingleLiveEvent<Boolean>
        get() = _loading

    // for check  get message error and print response value
    private val _responseErrorMessage = SingleLiveEvent<String>()
    val responseErrorMessage: SingleLiveEvent<String>
        get() = _responseErrorMessage
    //
    private val errorHandler = CoroutineExceptionHandler { _, exception ->
        _loading.value = false

    }

    fun  getNutritionForSingleLine(app_id:String, app_key:String, nutrition_type:String, ingr:String){
        _loading.value=true
        viewModelScope.launch(Dispatchers.IO+errorHandler) {

                val baseResponse=singleLineNutrition.getNutrionDataForSingleLine(app_id
                    ,app_key,nutrition_type,ingr)
                    .collect {model->
                        val launchModel=mapper.to(model)
                        withContext(Dispatchers.Main){

                        }



                    }





        }
    }
}