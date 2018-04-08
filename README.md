# JUnit 入门

via [tutorial point](https://www.tutorialspoint.com/junit/index.htm)

将教程上的代码誊抄到了一遍，以供查阅。

- 运行环境
 1. Eclipse IDE Oxygen
 1. JDK 1.8
 1. junit-4.10.jar（包含在项目中）
- 使用方法
 1. import "Existing Projects in Workplace"
 1. 右键项目 -> Properties -> Java Build Path -> Libraries -> Add External JARs ->选择项目文件夹下的junit-4.10.jar -> Apply

- 注：之所以使用 junit-4.10 而不使用更新的 4.11、4.12 是因为新版本不再包含hamcrest 包，编译时会在 import 阶段找不到包，详见：[JUnit-4.11使用报java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing错误](https://blog.csdn.net/castle07/article/details/8553704)