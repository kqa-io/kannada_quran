# Kannada Quran Coding changes

1. Add new flavor
```groovy
   productFlavors {
    madani {
        applicationId "com.quran.labs.androidquran"
    }

   //  The "kannada" flavor is being added to the product flavors.

    kannada {
        applicationId "com.scalosphere.labs.kquran"
    }
}
```
2. create new class `KannadaQuranApplication.kt` and extend the original `QuranApplication.kt`