// //循环
// println("测试1：<for循环打印0-10>")
// for (int i = 0; i <= 10; i++) {
//     System.out.println(i)
// }

// println("测试2：<for循环打印10-0>")
// for (i = 10; i > 0; i--) {
//     println i
//     //等价于
//     //println(i)
// }

// println("测试3：<for(i in 0..10)>")
// for (i in 0..10) {
//     println(i)
// }

println("测试4：<upto>")
0.upto(10) {
    //$it  代表循环的索引值
    println("$it")
}

println("测试5：times")
3.times {
//    打印三次
    println("abc")
}

println("测试6：step")
//从0-10 间隔为3
0.step(10, 3) {
    println("$it")
}

// "ls -l".execute.text






