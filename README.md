# EspressoDemo
Set up Android Studio environment to use Espresso 

Uses android.support.test.runner.AndroidJUnitRunner

If test running failed due to
```sh
Unable to find instrumentation info for: ComponentInfo{com.saran.espressodemo.test/android.support.test.runner.AndroidJUnitRunner}
   ```

is encountered, add  
```sh
testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
   ```
in defaultConfig of build.gradle

Espresso cheat sheet can be found here https://google.github.io/android-testing-support-library/docs/espresso/cheatsheet/
