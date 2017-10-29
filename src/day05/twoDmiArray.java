package day05;



/**
 * Created by reyren on 2016/10/29.
 */

/*
* 二维数组：二维数组就是数组中的数组
*
*   动态初始化：数据类型[][] 变量名 = new 数据类型[长度][长度]
*   静态初始化：数据类型[][] 变量名 = {{}, {}, .....}
* */
public class twoDmiArray {

    public static void main(String[] args){

        /*int[][] arr = new int[3][4];
        System.out.print("二维数组的长度"+ arr.length);
        System.out.print("二维数组的长度"+ arr[1].length);*/

        int[][] arr = {{10, 11, 9}, {67, 12}, {33, 35, 39, 40}};
        /*System.out.print("二维数组的长度"+ arr.length);
        System.out.print("二维数组的长度"+ arr[1].length);*/

        //遍历
        for (int i = 0; i < arr.length; i++){
            //System.out.print(arr[i]);//这样输出的是内存地址
            for (int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + ",");
            }
            //换行
            System.out.println();
        }
    }
}
