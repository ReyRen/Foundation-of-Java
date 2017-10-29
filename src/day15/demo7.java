package day15;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by reyren on 2017/2/25.
 */
/*集合的体系：
--------------------| Collection 单列集合根接口
------------------------| List 如果实现了List接口的集合类，具备的特点：有序，可重复
------------------------------| ArrayList底层是维护了一个Object实现的，特点是：查询速度快，增删慢
                                            因为数组的内存地址是连续的，所以查询快，但是每次添加的时候都要检查长度够不够，当不够的时候，需要将原元素拷贝到新的长度的数组中，删除需要将后面的元素全部移动位补齐。
------------------------------| LinkedList 底层是使用链表实现的，
------------------------------| Vector
------------------------| Set
*
*ArrayList特有的方法：
*   ensureCapacity(int minCapacity)指定Object数组的长度是多少，而不是默认的10，但是构造方法在7.0之后就能指定大小了
*   trimToSize()将ArrayList的存储容量调整成现在的需要的容量，一般不用，因为下次要加内存的时候，好得重新拷贝数据到新的数组中，所以一般能浪费点内存也不这样用
*
*   笔试：使用ArrayList创建一个无参的对象时，默认的容量是多少，如果容量不够使用时又自动增长多少
*           ArrayList地层是维护了Object数组实现的使用无参的构造函数时，默认Object数组默认的容量是10，当长度不够用时，自动增长0.5倍
*
*什么时候用ArrayList：
*   如果目前的的数据是查询比较多，增删比较少，那么就使用ArrayList存储这批数据。比如高校的图书馆
* */

public class demo7 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

    }
}
