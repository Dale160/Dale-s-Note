> 本文由 [简悦 SimpRead](http://ksria.com/simpread/) 转码， 原文地址 [github.com](https://github.com/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/Collection%E6%8E%A5%E5%8F%A3.md)

1. Java 类中集合的关系图
----------------

[![](https://github.com/Dale160/Java_Basic_Introduction/raw/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_01.png)](/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_01.png)

[![](https://github.com/Dale160/Java_Basic_Introduction/raw/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_02.png)](/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_02.png)

2. 集合类概述
--------

在程序中可以通过数组来保存多个对象，但在某些情况下开发人员无法预先确定需要保存对象的个数，此时数组将不再适用，因为数组的长度不可变。例如，要保存一个学校的学生信息，由于不停有新生来报道，同时也有学生毕业离开学校，这时学生的数目就很难确定。为了在程序中可以保存这些数目不确定的对象，JDK 中提供了一系列特殊的类，这些类可以存储任意类型的对象，并且长度可变，在 Java 中这些类被统称为集合。集合类都位于 java.util 包中，在使用时一定要注意导包的问题，否则会出现异常。

### 2.1 为什么出现集合类？

面向对象语言对事物的体现都是以对象的形式，所以为了方便对多个对象的操作，Java 就提供了集合类。

### 2.2 数组和集合类同是容器，有何不同？

[![](https://github.com/Dale160/Java_Basic_Introduction/raw/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_03.png)](/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_03.png)

### 2.3 集合类的特点

集合只用于存储对象，集合长度是可变的，集合可以存储不同类型的对象。

3. Collection 接口概述
------------------

Collection：单列集合类的根接口，用于存储一系列符合某种规则的元素，它有两个重要的子接口，分别是 List 和 Set。其中，List 的特点是元素有序、元素可重复。Set 的特点是元素无序，而且不可重复。List 接口的主要实现类有 ArrayList 和 LinkedList，Set 接口的主要实现类有 HashSet 和 TreeSet。

Collection 层次结构中的根接口。Collection 表示一组对象，这些对象也称为 collection 的元素。一些 collection 允许有重复的元素，而另一些则不允许。一些 collection 是有序的，而另一些则是无序的。

[![](https://github.com/Dale160/Java_Basic_Introduction/raw/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_04.png)](/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_04.png)

4. Collection 接口成员方法
--------------------

集合层次结构中的根接口。Collection 表示一组对象，这些对象也称为 Collection 的元素。一些 Collection 允许有重复的元素，而另一些则不允许。一些 Collection 是有序的，而另一些则是无序的。

### 添加功能

<table><thead><tr><th align="left">方法声明</th><th align="left">功能描述</th></tr></thead><tbody><tr><td align="left">add()</td><td align="left">添加元素</td></tr><tr><td align="left">addAll()</td><td align="left">添加一个集合的元素</td></tr></tbody></table>

### 删除功能

<table><thead><tr><th>方法声明</th><th>功能描述</th></tr></thead><tbody><tr><td>remove()</td><td>删除元素</td></tr><tr><td>removeAll()</td><td>删除一个集合的元素</td></tr><tr><td>clear()</td><td>清空集合</td></tr></tbody></table>

### 判断功能

<table><thead><tr><th>方法声明</th><th>功能描述</th></tr></thead><tbody><tr><td>contains()</td><td>判断集合是否包含指定的元素</td></tr><tr><td>containsAll()</td><td>判断一个集合是否包含一个集合的元素</td></tr><tr><td>isEmpty()</td><td>判断集合是否为空</td></tr></tbody></table>

### 获取功能

<table><thead><tr><th>方法声明</th><th>功能描述</th></tr></thead><tbody><tr><td>size()</td><td>获取集合的长度</td></tr><tr><td>retainAll()</td><td>取两个集合的交集</td></tr></tbody></table>

### 其他功能

<table><thead><tr><th>方法声明</th><th>功能描述</th></tr></thead><tbody><tr><td>toArray()</td><td>把集合转成数组，可以实现集合的遍历</td></tr><tr><td>iterator()</td><td>迭代器，集合的专用遍历方式</td></tr></tbody></table>

[![](https://github.com/Dale160/Java_Basic_Introduction/raw/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_05.png)](/Dale160/Java_Basic_Introduction/blob/master/%E7%AC%AC6%E7%AB%A0%20%E9%9B%86%E5%90%88%E6%A1%86%E6%9E%B6/images/Collection_05.png)