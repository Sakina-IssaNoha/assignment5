fun main(){
   var w= multiply(arrayOf(43,56,21,3,11))
    println(w)
   var m= mixedArray(arrayOf(6.6,"Sammy",0.22,8.9F))
    println(m)
var t =characters(arrayOf("a","e","i","o","u"))
    println(t)
}

fun multiply(nums: Array<Int>):Int{
    var x = 1
    nums.forEach { y->
     x*=y
    }
    return x
}

fun mixedArray(mixedArray: Array<Any>):Double{
    var nums= 0.0
    mixedArray.forEach { z ->
        if(z is Double || z is Float)
            nums+=z.toString().toDouble()

    }
    return nums
}

fun characters(words:Array<String>):Int{
var word= 0
    words.forEach { p ->
        if(p=="a" || p=="e" || p=="i" || p=="o" || p=="u")
            word++
    }
    return word
}