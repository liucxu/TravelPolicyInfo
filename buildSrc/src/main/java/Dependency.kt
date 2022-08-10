object Versions {
    const val compileSdkVersion = 32
    const val minSdk = 24
    const val targetSdk = 32
    const val lifecycle_version = "2.6.0-alpha01"
    const val logging_interceptor_version = "4.10.0"
    const val arouter_api_version = "1.5.0"
    const val arouter_compiler_version = "1.2.2"
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
}