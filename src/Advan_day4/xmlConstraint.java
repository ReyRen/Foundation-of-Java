package Advan_day4;

/**
 * Created by reyren on 2017/5/28.
 */
/*
* XML语法：规范xml文件的基本编写规则（W3c）
* XML约束：规范XML文件数据内容格式的编写规则（由开发人员自行定义）
*
*   DTD 约束:语法相对简单，功能相对简单
*   Schema约束：语法相对复杂，功能也相对强大
*
* 导入DTD方式：
*   内部导入和外部导入
*   内部：
*       <?xml version="1.0"?>
        <!DOCTYPE note [
        <!ELEMENT note (to,from,heading,body)>
        <!ELEMENT to      (#PCDATA)>
        <!ELEMENT from    (#PCDATA)>
        <!ELEMENT heading (#PCDATA)>
        <!ELEMENT body    (#PCDATA)>
        ]>
        <note>
        <to>George</to>
        <from>John</from>
        <heading>Reminder</heading>
        <body>Don't forget the meeting!</body>
        </note>
     外部：
        本地导入：
            dtd文件
            <!DOCTYPE note SYSTEM "note.dtd">

        公共的外部导入（而不是本地导入）
            <!DOCTYPE note PUBLIC "http://.....">

     语法：
        约束标签：
            <!ELEMENT 元素名称 类别> 或 <!ELEMENT 元素名称(元素内容)>
        类别：
            空标签：EMPTY. 表示元素一定是空元素
            普通字符串：#PCDATA. 表示元素的内容一定是普通的字符串（不能含有子标签）
            任何内容：ANY. 表示元素的内容可以是任意内容（包括子标签）
        元素内容：
            顺序问题：
                <!ELEMENT 元素名称 （子元素名称1，子元素名称2.。。。）按顺序出现子标签
            次数问题:
                标签：必须且只能出现一次
                标签+：至少出现1次
                标签*:出现0次或n次
                标签？：出现0次或1次
        约束属性：
            <!ATTLIST 元素名称 属性名称 属性类型 默认值>
            默认值：
                #REQUIRED 属性值是必须的
                #IMPLIED 属性值不是必须的
                #FIXED value属性值是固定的,但是可以是不写的
            属性类型:（是控制属性值的）
                CDATA:普通的字符串
                (en1|en2|....):表示一定任选其中的一个值（只能是一个）
                ID:在一个xml文档中的该属性值必须唯一（这个值不能以数字开头）

 Schema约束
    名称空间：告诉xml文档当中的元素被那个schema文档约束，在xml文档中，不同的标签可以受到不同的schema文档的约束
        1.一个名称空间受到schema文档约束的情况
        2.多个名称空间受到schema文档约束的情况
        3.默认名称空间的情况
        4.没有名称空间的情况
    schema文件定义名称空间:
        targetNameSpace
    xml文档定义名称空间：
        xmlns
            1.xml文档中定义了一个itcast的名称空间 别名为：http://www.itcast.cn
            2.书架的标签现在引用了itcast名称的名称空间，itcast名称空间的别名是http://www.itcast.cn
            3.http://www.itcast.cn这个别名的schema文件的地址是当前目录下的book.xsd
    xml文档中定义名称空间别名的schema地址：
        schemaLocation
            名称空间别名 (空格) schema文件的地址。 也就是通过别名能找到一个地址。

* */
public class xmlConstraint {
    public static void main(String[] args) {

    }
}
