fun main(){
stringcharacter()
    var result = remainder(5,3)
    println(result)
    var par = getNameandAge("Happiness", 23)
    println(par)
    var total = stringlength("Happy")
    println(total)
}
fun stringcharacter(){
    var name = "codeHive"
    var output = name[4].toString()+name[5] +name[6] + name[7]
    println(output)
}
fun remainder(num1: Int, num2: Int): Int{
    var rem = num1%num2
    return rem
}
fun getNameandAge(name1: String, age: Int): String{
    var structure = "Hi, my name is $name1 and I am $age years old"
    return structure
}
fun stringlength(measure: String): Int{
var x = measure.length
    return x
}