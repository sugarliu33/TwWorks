###项目结构简单描述 项目共分为三个模块，并分别对应三个接口，分别是：

1、输入模块，对应接口（\src\main\java\service\input\InputService.java），主要功能：将用户输入数据转化为GameData类型，数据结构主要为：第一种
为一个Round类型的数组，分别记录每一局的第一次发球状态first，第二次发球状态second，以及设立一个boolean变量，IsStrike，IsSparse，记录该局发球的状
态是否为Strike 或者为 Sparse，最后score记录该局比赛的得分情况。第二种数据变量lastIsStrike,lastIsSparse记录最后一次的发球状况，默认值为false。
第三种数据变量firstPlus，secondPlus记录最后附加发球的分数，最后一项为记录总分的变量sumSocore；

3、处理模块，对应接口（\src\main\java\service\compute\ComputeService.java），主要功能：将输入模块传入的GameData数据，分为三个部分进行处理，
计算比赛总分。

4、输出模块，对应接口（\src\main\java\com\tw\service\ouput\OutputEachItem.java），主要功能：将处理模块传入的ComputeScore处理得到GameData
类型中的sumData数据进行输出。


自动化编译 
<pre><code>gradlew clean build</code></pre>

