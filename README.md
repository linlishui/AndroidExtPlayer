
### 配置环境

#### 1. 设置JDK 11

编译时出现错误：
```
java.lang.AssertionError: annotationType(): unrecognized Attribute name MODULE (class com.sun.tools.javac.util.UnsharedNameTable$NameImpl)
        at com.sun.tools.javac.util.Assert.error(Assert.java:133)
        at com.sun.tools.javac.code.TypeAnnotations.annotationType(TypeAnnotations.java:231)
        ...
```
如需适配Android 31版本，则不能继续使用`JDK 8`，而是变更为`JDK 11`

> On Windows: Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JDK

> On Mac: Android Studio > Preferences > Build, Execution, Deployment > Build Tools > Gradle > Gradle JDK


### 播放器实现

播放器基于ExoPlayer实现。