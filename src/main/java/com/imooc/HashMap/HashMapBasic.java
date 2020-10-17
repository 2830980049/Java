package com.imooc.HashMap;

/**
 * @Author WuQiLi
 * @Date 2020/10/11 16:33
 * @Version 1.0
 */


/**
 *  onlyifAbsent 默认为false 当为true时 不改变value值
 *  evict 当为false时 表创建一个模块
 */
public class HashMapBasic {
//    final V putVal(int hash, K key, V value, boolean onlyIfAbsent, boolean evict){
//        Node<K,V>[] tab;
//        Node<K,V> p;
//        int n,i;
//        // 判断 哈希桶数组 是否存在
//        if ((tab = table) == null || (n = tab.length) == 0)
//            // 如果为空 则对HashMap进行扩容
//            n = (tab = resize()).length;
//        /**
//         *  通过 与运算 得到数组下标 JDK1.7 是 取余 但是进行与运算同样能达到一样效果
//         *  采用 素数与 hash进行 与运算 是因为偶数容易造成哈希冲突, 每位不一定参与运算
//         *  p = 对应节点值
//          */
//        if ((p = tab[i = (n-1) & hash]) == null)
//            tab[i] = newNode(hash,key,value,null);
//        else{
//            Node<K,V> e;
//            K k;
//            /**
//             *  判断 节点哈希值，键值 是否 和 传入参数相等
//             *  哈希值相等，不一定相等
//             *  e = 对应节点
//             */
//            if (p.hash == hash && ((k = p.key) == key || (key != null && key.equals(k))))
//                e = p;
//            /**
//             *  判断 p 是否为红黑树
//             *  如果 是 插入
//             */
//            else if (p instanceof ThreeNode)
//                e = ((TreeNode<K,V> p)).putTreeVal(this, tab, hash, key, value);
//            else {
//                // 遍历该链
//                for (int binCount = 0;; ++binCount){
//                    if ((e = p.next) == null){
//                        p.next = newNode(hash, key, value, null);
//                        /**
//                         *  是否达到扩容条件 默认 为 8
//                         *  从 -1 开始
//                         */
//                        if(binCount >= TREEIFY_THRESHOLD - 1)
//                            treeifyBin(tab, hash);
//                        break;
//                    }
//                }
//            }
//        }
//    }
}
