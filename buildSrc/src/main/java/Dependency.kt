/**
 * Using buildSrc folder,I record all the dependencies in the file for
 * unified management.
 */
object Versions {
    const val compileSdkVersion = 32
    const val minSdk = 24
    const val targetSdk = 32
    const val lifecycle_version = "2.6.0-alpha01"
    const val logging_interceptor_version = "4.10.0"
    const val arouter_api_version = "1.5.2"
    const val arouter_compiler_version = "1.2.2"
    const val retrofit_version = "2.9.0"
}
object Libs{
    //LiveData
    const val livedata_ktx = "androidx.lifecycle:lifecycle-livedata-ktx:${Versions.lifecycle_version}"
    //ViewModel
    const val viewmodel_ktx = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.lifecycle_version}"
    const val viewmodel = "androidx.lifecycle:lifecycle-viewmodel-savedstate:${Versions.lifecycle_version}"
    //OKHttp & interceptor
    const val logging_interceptor = "com.squareup.okhttp3:logging-interceptor:${Versions.logging_interceptor_version}"
    //Arouter
    const val arouter_api = "com.alibaba:arouter-api:${Versions.arouter_api_version}"
    const val arouter_compiler = "com.alibaba:arouter-compiler:${Versions.arouter_compiler_version}"
    //Retrofit
    const val retofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit_version}"
    const val converter_gson = "com.squareup.retrofit2:converter-gson:${Versions.retrofit_version}"
}