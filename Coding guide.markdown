# Kannada Quran Coding changes

1. Change application iD in the build.gradle file
```groovy
  productFlavors {
    madani {
      applicationId "com.scalosphere.labs.kquran"
    }
  }
```
2. create new class `KannadaQuranApplication.kt` and extend the original `QuranApplication.kt`
3. 
3. Move the `QuranApplication.kt` file to `com.scalosphere.labs.kquran`

### Code

- [Ahmed El-Helw](https://twitter.com/ahmedre)

### Audio

- [Anas Saiyed](https://github.com/anassaiyed) - scripts and support for migrating many shuyookh from gapped to gapless.

### UI and Designer

- [Somaia Gabr](http://twitter.com/somaiagabr).

### Translators

- Farsi for version 2.0 by [M. Jafar Nakar](https://github.com/mjnanakar).

### and many more

- everyone we missed from the above lists - may Allah reward you!
