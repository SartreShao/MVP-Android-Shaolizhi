# MVP-Android-Shaolizhi
这是一个最简单的MVP模式的Android编写案例

程序功能：读取一个字符串，加载字符串到我们的的TextView上面

## Model类：
 输入：无
 
 输出：数据
 
 数据来源：远程服务器


## View类：
 输入：数据
 
 输出：一个加载了数据的TextView
 
 数据来源：Model类中的数据

## Presenter类：
我们在Presenter类中，把Model「输出」的数据，「输入」到View类中

为了能让Presenter有这个功能，我们把Model类的「获取数据功能」和View类的「加载数据到TextView功能」通过写成「回调函数」，让Presenter回调。因此创建了「View Interface」和「Model Interface」两个接口

## 怎么通过「接口」写「回调函数」
建议阅读知乎的一篇文章：https://www.zhihu.com/question/19801131/answer/26586203
