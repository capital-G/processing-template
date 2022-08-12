# Processing 3 gradle template

A template which allows you to use Processing within IntelliJ instead of using the Processing IDE.
This introduces capabilities such as autocomplete or debugging.

## How to add OscP5

[OscP5](https://sojamo.de/libraries/oscP5/) is a library which adds OSC functionality to Processing.

To add it, simply download the library from the website, copy the file `oscP5.jar` to the folder `library` and add

```kotlin
implementation(files("$rootDir/library/oscP5.jar"))
```

to `build.gradle.kts` within the `dependencies {...}` block (or simply uncomment it).

After this run `File/Invalidate Caches` within IntelliJ so IntelliJ will scan the new dependencies.

**Disclaimer:** OscP5 did not receive any updates since 10 years - it is probably best to switch to a maintained library.
